package demowebshop.ui.pages.basepageelement;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Selenide.$$x;

public class FooterSection {
    public ElementsCollection getInformationList(){
        return $$x("//div[@class = \"column information\"]//a")
                .as("Ссылки колонки \"Information\"");
    }
    public ElementsCollection getCustomerServiceList(){
        return $$x("//div[@class = \"column customer-service\"]//a")
                .as("Ссылки колонки \"Customer Service\"");
    }
    public ElementsCollection getMyAccountList(){
        return $$x("//div[@class = \"column column my-account\"]//a")
                .as("Ссылки колонки \"My Account\"");
    }
    public ElementsCollection getFollowUsList(){
        return $$x("//div[@class = \"column follow-us\"]//a")
                .as("Ссылки колонки \"Follow Us\"");
    }
}
