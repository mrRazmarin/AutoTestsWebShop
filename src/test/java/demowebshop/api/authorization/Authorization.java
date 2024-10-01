package demowebshop.api.authorization;


import demowebshop.api.endpoints.LogInPost;
import io.restassured.RestAssured;
import io.restassured.config.EncoderConfig;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.openqa.selenium.Cookie;

import java.util.Map;

import static demowebshop.ui.configuration.owner.ConfigSingle.config;
import static io.restassured.RestAssured.given;

public class Authorization {
    private static Cookie getCommerceAuth() {
        Response response = given()
                .config(RestAssured.config()
                        .encoderConfig(EncoderConfig.encoderConfig()
                                .encodeContentTypeAs("x-www-form-urlencoded", ContentType.URLENC)))
                .contentType("application/x-www-form-urlencoded")
                .formParam("RememberMe", "false")
                .formParam("Email", config.getUserEmail())
                .formParam("Password", config.getUserPassword())
                .when()
                .post(config.baseUrl()+ LogInPost.LOG_IN_POST);
        Map<String, String> allCookies = response.getCookies();
        return new Cookie(
                "NOPCOMMERCE.AUTH",
                allCookies.get("NOPCOMMERCE.AUTH"),
                "/"
        );
    }
    public static final Cookie getCookieAuth(){
        return getCommerceAuth();
    }
}
