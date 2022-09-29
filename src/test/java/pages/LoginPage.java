package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {

    public void openPage(){
        open("/login");
    }

    public void login(String email, String password) {
        $("#inputEmail").setValue(email);
        $("#inputPassword").sendKeys(password);
        $("#btnLogin").click();

    }
}
