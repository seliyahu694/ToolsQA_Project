package extensions;


import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import pageObjects.toolsqa.CheckBoxPage;
import utilities.CommonOps;

import java.util.List;

import static org.testng.Assert.*;

public class Verifications extends CommonOps {

    /**
     * Verify if specific text is the text in element
     *
     * @param webElement   = element to check the text on
     * @param expectedText = the expected text to be in element
     */
    @Step("check Text")
    public static void verifyTextInElement(WebElement webElement, String expectedText) {
        UIActions.highLighterMethod(webElement);
        assertEquals(UIActions.getTextFromElement(webElement), expectedText);
    }

    /**
     * Verify that input texts showed in output
     *
     * @param inputWebElement  = text boxes elements
     * @param outputWebElement = the texts from input
     */
    @Step("verify Input Output Texts")
    public static void verifyInputOutputTexts(List<WebElement> inputWebElement, List<WebElement> outputWebElement) {
        for (int i = 0; i < inputWebElement.size(); i++) {
            UIActions.highLighterMethod(inputWebElement.get(i));
            UIActions.scrollToElement(outputWebElement.get(i));
            UIActions.highLighterMethod(outputWebElement.get(i));
            softAssert.assertEquals(UIActions.getNewSubStringFromElement(outputWebElement.get(i), ':'), UIActions.getTextFromElement(inputWebElement.get(i)));
        }
        softAssert.assertAll();
    }

    /**
     * Check site logo from existing image (using Sikuli)
     *
     * @param expectedImageName = image name from ImageRepository folder
     */
    @Step("Verify visual Site Header")
    public static void visualSiteHeader(String expectedImageName) {
        try {
            screen.find(getData("imageRepo") + expectedImageName + ".png");
        } catch (FindFailed findFailed) {
            System.out.println("Error Comparing Image File: " + findFailed);
            fail("Error Comparing Image File: " + findFailed);
        }
    }

    /**
     *
     * Check if text of checked checkbox showed in output
     *
     */
    @Step("verify Checked CheckBox")
    public static void verifyCheckedCheckBox() {
        for (int i = 1; i < toolsQACheckBoxPage.checkBoxes.size(); i++) {
            if (UIActions.isElementSelected(toolsQACheckBoxPage.checkBoxes.get(i))) {
                softAssert.assertEquals(UIActions.getTextFromElementToLowerCase(toolsQACheckBoxPage.checkedTextResult.get(i + 1)), UIActions.getTextFromElement(toolsQACheckBoxPage.checkBoxes.get(i)));
            }
        }
        softAssert.assertAll();
    }

    /**
     * Verify selected radio button
     */
    @Step("verify Selected Radio Button")
    public static void verifySelectedRadioButton() {
        if (UIActions.isElementSelected(toolsQARadioButtonPage.radioButtons.get(0))) {
            assertEquals(UIActions.getTextFromElement(toolsQARadioButtonPage.radioButtonsTexts.get(0)), "Yes");
            assertEquals(UIActions.getTextFromElement(toolsQARadioButtonPage.outputOfElectedRadioButtonText), "Yes");
        }
        if (UIActions.isElementSelected(toolsQARadioButtonPage.radioButtons.get(1))) {
            assertEquals(UIActions.getTextFromElement(toolsQARadioButtonPage.radioButtonsTexts.get(1)), "Impressive");
            assertEquals(UIActions.getTextFromElement(toolsQARadioButtonPage.outputOfElectedRadioButtonText), "Impressive");
        }
    }

    @Step("verify Table Size")
    public static void verifyTableSize(int expectedRowsInTable) {
        assertEquals(toolsQAWebTablesPage.filledTableRows.size(), expectedRowsInTable);
    }

    public static void verifyClickedButtons(String click) {
        switch (click) {
            case "doubleClick":
                assertEquals(UIActions.getTextFromElement(toolsQAButtonsPage.doubleClickOutputMessage), "You have done a double click");
                break;
            case "rightClick":
                assertEquals(UIActions.getTextFromElement(toolsQAButtonsPage.rightClickOutputMessage), "You have done a right click");
                break;
            case "click":
                assertEquals(UIActions.getTextFromElement(toolsQAButtonsPage.clickMeOutputMessage), "You have done a dynamic click");
                break;
        }
    }
}
