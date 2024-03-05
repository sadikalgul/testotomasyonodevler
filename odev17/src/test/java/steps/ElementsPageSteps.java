package steps;

import common.PageManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.AssertJUnit.assertEquals;

public class ElementsPageSteps {

    PageManager pageManager;

    @Given("I am on the elements page")
    public void i_am_on_the_elements_page() {
        // Write code here that turns the phrase above into concrete actions
        pageManager = new PageManager();
        pageManager.elementsPage.open();
    }
    @When("I press buttons")
    public void i_press_buttons() {
        // Write code here that turns the phrase above into concrete actions
        pageManager.elementsPage.buttons.click();
    }
    @When("I press Click Me")
    public void i_press_click_me() {
        // Write code here that turns the phrase above into concrete actions
        pageManager.elementsPage.clickMeButtons.click();
    }
    @Then("I can see {string}")
    public void i_can_see(String string) {
        // Write code here that turns the phrase above into concrete actions
        String pageMsg = pageManager.elementsPage.clickMeMessage.getText();
        System.out.println(pageMsg + " " + string);
        assertEquals(pageMsg,string);
    }


}
