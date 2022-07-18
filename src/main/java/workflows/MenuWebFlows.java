package workflows;

import extensions.UIActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class MenuWebFlows extends CommonOps {

    @Step("go To Section In Menu")
    public static void goToSectionInMenu(String menuName) {
        switch (menuName) {
            case "Elements":
                if (UIActions.waitForElementExist(UIActions.webElementByXpath("//div[@class='header-text'][text()='Elements']/../../../div[@class='element-list collapse']")))
                    UIActions.clickOnElement(toolsQAMenuPage.headerMenu.get(0));
                break;
            case "Forms":
                if (UIActions.waitForElementExist(UIActions.webElementByXpath("//div[@class='header-text'][text()='Forms']/../../../div[@class='element-list collapse']")))
                    UIActions.clickOnElement(toolsQAMenuPage.headerMenu.get(1));
                break;
            case "Alerts, Frame & Windows":
                if (UIActions.waitForElementExist(UIActions.webElementByXpath("//div[@class='header-text'][text()='Alerts, Frame & Windows']/../../../div[@class='element-list collapse']")))
                    UIActions.clickOnElement(toolsQAMenuPage.headerMenu.get(2));
                break;
            case "Widgets":
                if (UIActions.waitForElementExist(UIActions.webElementByXpath("//div[@class='header-text'][text()='Widgets, Frame & Windows']/../../../div[@class='element-list collapse']")))
                    UIActions.clickOnElement(toolsQAMenuPage.headerMenu.get(3));
                break;
            case "Interactions":
                if (UIActions.waitForElementExist(UIActions.webElementByXpath("//div[@class='header-text'][text()='Interactions']/../../../div[@class='element-list collapse']")))
                    UIActions.clickOnElement(toolsQAMenuPage.headerMenu.get(4));
                break;
            case "Book Store Application":
                if (UIActions.waitForElementExist(UIActions.webElementByXpath("//div[@class='header-text'][text()='Book Store Application']/../../../div[@class='element-list collapse']")))
                    UIActions.clickOnElement(toolsQAMenuPage.headerMenu.get(5));
                break;
        }
    }

    @Step("go To Subject In Menu")
    public static void goToSubjectInMenu(String subjectName) {
        switch (subjectName) {
            case "Text Box":
                goToSectionInMenu("Elements");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(0));
                break;
            case "Check Box":
                goToSectionInMenu("Elements");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(1));
                break;
            case "Radio Button":
                goToSectionInMenu("Elements");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(2));
                break;
            case "Web Tables":
                goToSectionInMenu("Elements");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(3));
                break;
            case "Buttons":
                goToSectionInMenu("Elements");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(4));
                break;
            case "Links":
                goToSectionInMenu("Elements");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(5));
                break;
            case "Broken Links - Images":
                goToSectionInMenu("Elements");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(6));
                break;
            case "Upload and Download":
                goToSectionInMenu("Elements");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(7));
                break;
            case "Dynamic Properties":
                goToSectionInMenu("Elements");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(8));
                break;
            case "Practice Form":
                goToSectionInMenu("Forms");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(9));
                break;
            case "Browser Windows":
                goToSectionInMenu("Alerts, Frame & Windows");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(10));
                break;
            case "Alerts":
                goToSectionInMenu("Alerts, Frame & Windows");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(11));
                break;
            case "Frames":
                goToSectionInMenu("Alerts, Frame & Windows");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(12));
                break;
            case "Nested Frames":
                goToSectionInMenu("Alerts, Frame & Windows");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(13));
                break;
            case "Modal Dialogs":
                goToSectionInMenu("Alerts, Frame & Windows");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(14));
                break;
            case "Accordian":
                goToSectionInMenu("Widgets");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(15));
                break;
            case "Auto Complete":
                goToSectionInMenu("Widgets");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(16));
                break;
            case "Date Picker":
                goToSectionInMenu("Widgets");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(17));
                break;
            case "Slider":
                goToSectionInMenu("Widgets");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(18));
                break;
            case "Progress Bar":
                goToSectionInMenu("Widgets");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(19));
                break;
            case "Tabs":
                goToSectionInMenu("Widgets");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(20));
                break;
            case "Tool Tips":
                goToSectionInMenu("Widgets");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(21));
                break;
            case "Menu":
                goToSectionInMenu("Widgets");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(22));
                break;
            case "Select Menu":
                goToSectionInMenu("Widgets");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(23));
                break;
            case "Sortable":
                goToSectionInMenu("Interactions");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(24));
                break;
            case "Selectable":
                goToSectionInMenu("Interactions");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(25));
                break;
            case "Resizable":
                goToSectionInMenu("Interactions");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(26));
                break;
            case "Droppable":
                goToSectionInMenu("Interactions");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(27));
                break;
            case "Dragabble":
                goToSectionInMenu("Interactions");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(28));
                break;
            case "Login":
                goToSectionInMenu("Book Store Application");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(29));
                break;
            case "Book Store":
                goToSectionInMenu("Book Store Application");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(30));
                break;
            case "Profile":
                goToSectionInMenu("Book Store Application");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(31));
                break;
            case "Book Store API":
                goToSectionInMenu("Book Store Application");
                UIActions.clickOnElement(toolsQAMenuPage.subjectMenu.get(32));
                break;
        }
    }
}
