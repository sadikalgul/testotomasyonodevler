package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class ElementsPage extends BasePage{

    public SelenideElement buttons = $x("//span[text()='Buttons']");
    public SelenideElement clickMeButtons = $x("//button[text()='Click Me']");

    public SelenideElement clickMeMessage = $x("//p[@id='dynamicClickMessage']");

    public ElementsPage(String pageUrl) {
        super(pageUrl);
    }

    @Override
    public void open() {
        String url = pageUrl;
        Selenide.open(url);
    }
}
