package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.Screen;
import org.testng.asserts.SoftAssert;

public class Base {

    protected static WebDriver driver;
    protected static WebDriverWait wait;
    protected static Actions action;
    protected static SoftAssert softAssert;
    protected static Screen screen;

    // Page Objects
    protected static pageObjects.toolsqa.HomePage toolsQAHomePage;
    protected static pageObjects.toolsqa.MenuPage toolsQAMenuPage;
    protected static pageObjects.toolsqa.ElementsPage toolsQAElementsPage;
    protected static pageObjects.toolsqa.FormsPage toolsQAFormsPage;
    protected static pageObjects.toolsqa.CheckBoxPage toolsQACheckBoxPage;
}
