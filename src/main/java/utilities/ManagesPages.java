package utilities;

import org.openqa.selenium.support.PageFactory;

public class ManagesPages extends Base {

    public static void initToolsQA() {
        toolsQAHomePage = PageFactory.initElements(driver, pageObjects.toolsqa.HomePage.class);
        toolsQAMenuPage = PageFactory.initElements(driver, pageObjects.toolsqa.MenuPage.class);
        toolsQAElementsPage = PageFactory.initElements(driver, pageObjects.toolsqa.ElementsPage.class);
        toolsQAFormsPage = PageFactory.initElements(driver, pageObjects.toolsqa.FormsPage.class);
        toolsQACheckBoxPage = PageFactory.initElements(driver, pageObjects.toolsqa.CheckBoxPage.class);
    }
}
