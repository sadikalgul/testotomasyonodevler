package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import common.DemoHelper;

import static com.codeborne.selenide.Selenide.$x;
import static org.assertj.core.api.Assertions.assertThat;

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
