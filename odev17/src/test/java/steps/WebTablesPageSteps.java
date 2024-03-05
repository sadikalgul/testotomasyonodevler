package steps;

import common.DemoHelper;
import common.PageManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.testng.AssertJUnit.assertEquals;

public class WebTablesPageSteps {

    PageManager pageManager;

    @Given("I am on the webTables page")
    public void i_am_on_the_web_tables_page() {
        // Write code here that turns the phrase above into concrete actions
        pageManager = new PageManager();
        pageManager.webTablesPage.open();
    }
    @When("I press ADD buttons")
    public void i_press_add_buttons() {
        // Write code here that turns the phrase above into concrete actions
        pageManager.webTablesPage.addButton.click();
    }
    @When("I add new personal")
    public void i_add_new_personal() {
        // Write code here that turns the phrase above into concrete actions
        pageManager.webTablesPage.firstName.sendKeys("SADIK");
        pageManager.webTablesPage.lastName.sendKeys("ALGUL");
        pageManager.webTablesPage.userEmail.sendKeys("sss@gmail.com");
        pageManager.webTablesPage.age.sendKeys("42");
        pageManager.webTablesPage.salary.sendKeys("1000");
        pageManager.webTablesPage.department.sendKeys("CMY");
        pageManager.webTablesPage.submit.click();
    }
    @When("I update newly added personal")
    public void i_update_newly_added_personal() {
        // Write code here that turns the phrase above into concrete actions
        pageManager.webTablesPage.newItem.click();
        pageManager.webTablesPage.searchBox.clear();
        pageManager.webTablesPage.firstName.clear();
        pageManager.webTablesPage.firstName.sendKeys("ECE");
        pageManager.webTablesPage.lastName.clear();
        pageManager.webTablesPage.lastName.sendKeys("DENIZ");
        pageManager.webTablesPage.userEmail.clear();
        pageManager.webTablesPage.userEmail.sendKeys("fff@gmail.com");
        pageManager.webTablesPage.age.clear();
        pageManager.webTablesPage.age.sendKeys("35");
        pageManager.webTablesPage.salary.clear();
        pageManager.webTablesPage.salary.sendKeys("5000");
        pageManager.webTablesPage.department.clear();
        pageManager.webTablesPage.department.sendKeys("DER");
        pageManager.webTablesPage.submit.click();
    }
    @Then("I can see personal name {string}")
    public void i_can_see_personal_name(String string) {
        // Write code here that turns the phrase above into concrete actions
        //DemoHelper.pause();
        String personalName = pageManager.webTablesPage.newItemName.getText();
        System.out.println(personalName + " " + string);
        assertEquals(personalName,string);
    }

}
