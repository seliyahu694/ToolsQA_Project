package extensions;


import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import utilities.CommonOps;
import java.util.List;


import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

public class Verifications extends CommonOps {

    /**
     *
     * Verify if specific text is the text in element
     *
     * @param webElement = element to check the text in
     * @param expectedText = the expected text to be in element
     *
     */
    @Step("check Text")
    public static void verifyTextInElement(WebElement webElement, String expectedText) {
        UIActions.highLighterMethod(webElement);
        assertEquals(UIActions.getTextFromElement(webElement), expectedText);
    }

    /**
     *
     * Verify that input texts showed in output
     *
     * @param inputWebElement = text boxes elements
     * @param outputWebElement = the texts from input
     *
     */
    @Step("verify Input Output Texts")
    public static void verifyInputOutputTexts(List<WebElement> inputWebElement, List<WebElement> outputWebElement) {
        for (int i = 0; i < inputWebElement.size(); i++) {
            UIActions.highLighterMethod(inputWebElement.get(i));
            UIActions.highLighterMethod(outputWebElement.get(i));
            UIActions.scrollToElement(outputWebElement.get(i));
            softAssert.assertEquals(UIActions.getNewSubStringFromElement(outputWebElement.get(i), ':'), UIActions.getTextFromElement(inputWebElement.get(i)));
        }
        softAssert.assertAll();
    }

    @Step("Verify visual Site Header")
    public static void visualSiteHeader(String expectedImageName) {
        try {
            screen.find(getData("imageRepo") + expectedImageName + ".png");
        } catch (FindFailed findFailed) {
            System.out.println("Error Comparing Image File: " + findFailed);
            fail("Error Comparing Image File: " + findFailed);
        }
    }
}
