package pages;

import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class ProjectsPage {

    public void isOpened() {
        $("#createButton").shouldBe(Condition.visible);
    }
}
