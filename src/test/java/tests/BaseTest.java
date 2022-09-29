package tests;

import com.codeborne.selenide.AssertionMode;
import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import pages.ProjectsPage;
import utils.PropertyReader;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class BaseTest {
    LoginPage loginPage;
    ProjectsPage projectsPage;
    String user;
    String password;

    @BeforeMethod
    public void setup() {
        Configuration.baseUrl = PropertyReader.getProperty("qase.url");
        user = PropertyReader.getProperty("qase.user");
        password = PropertyReader.getProperty("qase.password");
        Configuration.browser = "chrome";
        Configuration.headless = false;
        Configuration.timeout = 10000;
        Configuration.screenshots = true;
        //Configuration.clickViaJs = true;
        //Configuration.fastSetValue = true;

        loginPage = new LoginPage();
        projectsPage = new ProjectsPage();

        open();
        getWebDriver().manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void finish() {
        if(getWebDriver() != null) getWebDriver().quit();

    }
}
