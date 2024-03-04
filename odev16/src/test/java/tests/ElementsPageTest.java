package tests;

import common.DemoHelper;
import driver.DriverFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ElementsPageTest extends BaseTest{

    @BeforeMethod
    public void before(){
        pageManager.elementsPage.open();
    }
    @Test
    public void clickMeButtonTest(){

        pageManager.elementsPage.buttons.click();
        pageManager.elementsPage.clickMeButtons.click();
        DemoHelper.pause();
        System.out.println(pageManager.elementsPage.clickMeMessage.getText());
        assertThat(pageManager.elementsPage.clickMeMessage.isDisplayed()).isTrue();
    }
}
