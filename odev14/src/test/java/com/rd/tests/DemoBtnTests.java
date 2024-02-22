package com.rd.tests;

import com.rd.drivers.Driver;
import com.rd.utils.PropertyManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Optional;


public class DemoBtnTests {

    public static WebDriver driver;
    Driver webDriver = new Driver();
    PropertyManager propertyManager= new PropertyManager();
    String url =propertyManager.getProperty("APP_URL_ELM");


    @BeforeTest(alwaysRun = true)
    public void beforeTest() throws MalformedURLException{
        driver = webDriver.initializeDriver();
        driver.get(url);
    }

    @Test(priority = 1)
    public void clickButtonTest() {

        List<WebElement> buttonList = driver.findElements(new By.ByCssSelector("li#item-4>span.text"));
        Optional<WebElement> button = buttonList.stream().filter(webElement -> webElement.getText().equals("Buttons")).findFirst();
        button.ifPresent(WebElement::click);

        List<WebElement> ClickButtons = driver.findElements(new By.ByCssSelector("button[type=button]"));
        Optional<WebElement> clickButton = ClickButtons.stream().filter(webElement -> webElement.getText().equals("Click Me")).findFirst();
        clickButton.ifPresent(WebElement::click);

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (driver.findElement(new By.ByCssSelector("p#dynamicClickMessage")).isDisplayed())
            System.out.println(driver.findElement(new By.ByCssSelector("p#dynamicClickMessage")).getText());

    }

    @AfterTest(alwaysRun = true)
    public void  after(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        webDriver.quitDriver();
    }
}
