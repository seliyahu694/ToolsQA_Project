package workflows;

import extensions.UIActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class ElementsWebFlows extends CommonOps {

    @Step("fill form and click submit")
    public static void fillTextBoxes(String fullNameText, String emailText, String currentAddressText, String permanentAddressText) {
        UIActions.setText(toolsQAElementsPage.fullNameTextBox, fullNameText);
        UIActions.setText(toolsQAElementsPage.emailTextBox, emailText);
        UIActions.setText(toolsQAElementsPage.currentAddressTextBox, currentAddressText);
        UIActions.setText(toolsQAElementsPage.permanentAddressTextBox, permanentAddressText);
        UIActions.clickOnElement(toolsQAElementsPage.submitBtn);
    }
}
