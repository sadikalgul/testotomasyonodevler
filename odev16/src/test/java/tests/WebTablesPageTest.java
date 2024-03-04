package tests;

import common.DemoHelper;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WebTablesPageTest extends BaseTest{

    @BeforeMethod
    public void before(){
        pageManager.webTablesPage.open();
    }
    @Test
    public void addUpdateItemTest(){

        pageManager.webTablesPage.addButton.click();
        pageManager.webTablesPage.firstName.sendKeys("SADIK");
        pageManager.webTablesPage.lastName.sendKeys("ALGUL");
        pageManager.webTablesPage.userEmail.sendKeys("sss@gmail.com");
        pageManager.webTablesPage.age.sendKeys("42");
        pageManager.webTablesPage.salary.sendKeys("1000");
        pageManager.webTablesPage.department.sendKeys("CMY");
        pageManager.webTablesPage.submit.click();
        DemoHelper.pause();
        //pageManager.webTablesPage.searchBox.sendKeys("SADIK");
       // DemoHelper.pause();
        pageManager.webTablesPage.newItem.click();
        pageManager.webTablesPage.searchBox.clear();
        pageManager.webTablesPage.firstName.clear();
        pageManager.webTablesPage.firstName.sendKeys("SEVGI");
        pageManager.webTablesPage.lastName.clear();
        pageManager.webTablesPage.lastName.sendKeys("SAFA");
        pageManager.webTablesPage.userEmail.clear();
        pageManager.webTablesPage.userEmail.sendKeys("fff@gmail.com");
        pageManager.webTablesPage.age.clear();
        pageManager.webTablesPage.age.sendKeys("35");
        pageManager.webTablesPage.salary.clear();
        pageManager.webTablesPage.salary.sendKeys("5000");
        pageManager.webTablesPage.department.clear();
        pageManager.webTablesPage.department.sendKeys("DER");
        pageManager.webTablesPage.submit.click();
        DemoHelper.pause();
    }
}
