package common;

import pages.ElementsPage;
import pages.WebTablesPage;
import utils.PropertyManager;

public class PageFactory {


    private static String elementPageUrl;
    private static String webTablePageUrl;

    public static ElementsPage buildElementsPage() {
        return new ElementsPage(elementPageUrl);
    }

    public static WebTablesPage buildWebTablesPage() {
        return new WebTablesPage(webTablePageUrl);
    }

    public static void setPagesUrl() {

        PropertyManager propertyManager = new PropertyManager();
        elementPageUrl = propertyManager.getProperty("APP_URL_ELM");
        webTablePageUrl = propertyManager.getProperty("APP_URL_TBL");


    }

}
