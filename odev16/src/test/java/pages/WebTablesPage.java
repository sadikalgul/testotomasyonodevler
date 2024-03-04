package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$x;

public class WebTablesPage extends BasePage{

    public SelenideElement addButton = $x("//button[@id='addNewRecordButton']");
    public SelenideElement firstName = $x("//input[@id='firstName']");
    public SelenideElement lastName = $x("//input[@id='lastName']");
    public SelenideElement userEmail = $x("//input[@id='userEmail']");
    public SelenideElement age = $x("//input[@id='age']");
    public SelenideElement salary = $x("//input[@id='salary']");
    public SelenideElement department = $x("//input[@id='department']");
    public SelenideElement submit = $x("//button[@id='submit']");
    public SelenideElement searchBox = $x("//input[@id='searchBox']");
    public SelenideElement newItem = $x("//span[@id='edit-record-4']");


    public WebTablesPage(String pageUrl) {
        super(pageUrl);
    }

    @Override
    public void open() {
        String url = pageUrl;
        Selenide.open(url);
    }

}
