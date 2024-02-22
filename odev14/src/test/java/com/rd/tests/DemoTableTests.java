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


public class DemoTableTests {

    public static WebDriver driver;
    Driver webDriver = new Driver();
    PropertyManager propertyManager= new PropertyManager();
    String url =propertyManager.getProperty("APP_URL_TBL");


    @BeforeTest(alwaysRun = true)
    public void beforeTest() throws MalformedURLException{
        driver = webDriver.initializeDriver();
        driver.get(url);
    }


    @Test(priority = 1)
    public void clickAddTest() {

        WebElement addButton = driver.findElement(new By.ByCssSelector("button#addNewRecordButton"));
        addButton.click();
        driver.findElement(new By.ByCssSelector("input#firstName")).sendKeys("SADIK");
        driver.findElement(new By.ByCssSelector("input#lastName")).sendKeys("ALGUL");
        driver.findElement(new By.ByCssSelector("input#userEmail")).sendKeys("dd@gmail.com");
        driver.findElement(new By.ByCssSelector("input#age")).sendKeys("40");
        driver.findElement(new By.ByCssSelector("input#salary")).sendKeys("1000");
        driver.findElement(new By.ByCssSelector("input#department")).sendKeys("CMY");
        WebElement saveButton = driver.findElement(new By.ByCssSelector("button#submit"));
        saveButton.click();

    }


    @Test(priority = 2)
    public void editTest() {

        WebElement txtSearch = driver.findElement(new By.ByCssSelector("input#searchBox"));
        txtSearch.sendKeys("SADIK");

        WebElement editButton = driver.findElement(new By.ByCssSelector("span#edit-record-4"));
        System.out.println(editButton.getText());
       // WebElement editButton = driver.findElement(new By.ByCssSelector("span[title=Edit][id=edit-record-4]"));
        editButton.click();
        driver.findElement(new By.ByCssSelector("input#firstName")).clear();
        driver.findElement(new By.ByCssSelector("input#firstName")).sendKeys("SEVGI");
        driver.findElement(new By.ByCssSelector("input#lastName")).clear();
        driver.findElement(new By.ByCssSelector("input#lastName")).sendKeys("SAFA");
        driver.findElement(new By.ByCssSelector("input#userEmail")).clear();
        driver.findElement(new By.ByCssSelector("input#userEmail")).sendKeys("cc@gmail.com");
        driver.findElement(new By.ByCssSelector("input#age")).clear();
        driver.findElement(new By.ByCssSelector("input#age")).sendKeys("35");
        driver.findElement(new By.ByCssSelector("input#salary")).clear();
        driver.findElement(new By.ByCssSelector("input#salary")).sendKeys("5000");
        driver.findElement(new By.ByCssSelector("input#department")).clear();
        driver.findElement(new By.ByCssSelector("input#department")).sendKeys("TYT");
        WebElement saveButton = driver.findElement(new By.ByCssSelector("button#submit"));
        saveButton.click();
    }

    @AfterTest(alwaysRun = true)
    public void  after(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        webDriver.quitDriver();
    }
}
