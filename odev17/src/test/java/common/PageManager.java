package common;

import driver.DriverFactory;
import pages.ElementsPage;
import pages.WebTablesPage;

public class PageManager {
    public ElementsPage elementsPage;

    public WebTablesPage webTablesPage;

    public PageManager() {

        DriverFactory.initDriver();
        PageFactory.setPagesUrl();
        elementsPage = PageFactory.buildElementsPage();
        webTablesPage = PageFactory.buildWebTablesPage();

    }
}
