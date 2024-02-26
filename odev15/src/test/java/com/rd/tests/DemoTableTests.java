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

        WebElement addButton = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
        addButton.click();
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("SADIK");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("ALGUL");
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("dd@gmail.com");
        driver.findElement(By.xpath("//input[@id='age']")).sendKeys("40");
        driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("1000");
        driver.findElement(By.xpath("//input[@id='department']")).sendKeys("CMY");
        WebElement saveButton = driver.findElement(By.xpath("//button[@id='submit']"));
        saveButton.click();

    }


    @Test(priority = 2)
    public void editTest() {

        WebElement txtSearch = driver.findElement(By.xpath("//input[@id='searchBox']"));
        txtSearch.sendKeys("SADIK");

        WebElement editButton = driver.findElement(By.xpath("//span[@id='edit-record-4']"));
       // System.out.println(editButton.getText());
        editButton.click();
        driver.findElement(By.xpath("//input[@id='firstName']")).clear();
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("SEVGI");
        driver.findElement(By.xpath("//input[@id='lastName']")).clear();
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("SAFA");
        driver.findElement(By.xpath("//input[@id='userEmail']")).clear();
        driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("cc@gmail.com");
        driver.findElement(By.xpath("//input[@id='age']")).clear();
        driver.findElement(By.xpath("//input[@id='age']")).sendKeys("35");
        driver.findElement(By.xpath("//input[@id='salary']")).clear();
        driver.findElement(By.xpath("//input[@id='salary']")).sendKeys("5000");
        driver.findElement(By.xpath("//input[@id='department']")).clear();
        driver.findElement(By.xpath("//input[@id='department']")).sendKeys("TYT");
        WebElement saveButton = driver.findElement(By.xpath("//button[@id='submit']"));
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
