package workflows;

import extensions.UIActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class ButtonsWebFlow extends CommonOps {

    @Step("click On Button")
    public static void clickOnButton(String selectedClick) {
        switch (selectedClick) {
            case "doubleClick":
                UIActions.doubleClickOnElement(toolsQAButtonsPage.doubleClickButton);
                break;
            case "rightClick":
                UIActions.rightClickOnElement(toolsQAButtonsPage.rightClickButton);
                break;
            case "click":
                UIActions.clickOnElement(toolsQAButtonsPage.Button);
                break;
        }
    }

    @Step("double click On Double Click Button")
    public static void clickOnDoubleClickButton() {
        UIActions.doubleClickOnElement(toolsQAButtonsPage.doubleClickButton);
    }

    @Step("right click On Right Click Button")
    public static void clickOnRightClickButton() {
        UIActions.rightClickOnElement(toolsQAButtonsPage.rightClickButton);
    }

    @Step("click On Click Me Button")
    public static void clickOnClickMeButton() {
        UIActions.clickOnElement(toolsQAButtonsPage.Button);
    }
}
