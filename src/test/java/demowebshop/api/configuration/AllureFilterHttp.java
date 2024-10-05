package demowebshop.api.configuration;

import io.qameta.allure.restassured.AllureRestAssured;
import lombok.Getter;

public class AllureFilterHttp {
    @Getter
    private static AllureRestAssured allureFilter = new AllureRestAssured()
            .setRequestTemplate("http-request.ftl")
            .setResponseTemplate("http-response.ftl");
}
