package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class ProjectTest extends BaseTest{

    @Test
    public void createProject(){
    loginPage.openPage();
    loginPage.login("atandrei@proton.me", "7333333aK");
    projectsPage.isOpened();
    }
}
