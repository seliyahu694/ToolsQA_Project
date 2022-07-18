package workflows;

import extensions.UIActions;
import utilities.CommonOps;

public class HomeWebFlows extends CommonOps {
    public static void goToPage(String pageName) {
        switch (pageName) {
            case "Elements":
                UIActions.clickOnElement(toolsQAHomePage.subjectBtns.get(0));
                break;
            case "Forms":
                UIActions.clickOnElement(toolsQAHomePage.subjectBtns.get(1));
                break;
            case "Alerts, Frame & Windows":
                UIActions.clickOnElement(toolsQAHomePage.subjectBtns.get(2));
                break;
            case "Widgets":
                UIActions.clickOnElement(toolsQAHomePage.subjectBtns.get(3));
                break;
            case "Interactions":
                UIActions.clickOnElement(toolsQAHomePage.subjectBtns.get(4));
                break;
            case "Book Store Application":
                UIActions.clickOnElement(toolsQAHomePage.subjectBtns.get(5));
                break;
        }
    }
}
