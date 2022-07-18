package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.HomeWebFlows;
import workflows.ElementsWebFlows;
import workflows.MenuWebFlows;

import java.util.*;

@Listeners(utilities.Listeners.class)
public class ToolsQAElements extends CommonOps {

    @Test (description = "Test01 - Verify Site Header")
    @Description("This test check if the logo picture is correct using Sikuli")
    public void test01_VerifySiteLogo() {
        Verifications.visualSiteHeader("logo");
    }

    @Test (description = "Test02 - Verify Elements Page")
    @Description("This test redirects to Elements page and verify the header")
    public void test02_VerifyElementsPage() {
        HomeWebFlows.goToPage("Elements");
        Verifications.verifyTextInElement(toolsQAElementsPage.header, "Elements");
    }

    @Test (description = "Test03 - Verify Text Box Section")
    @Description("This test redirects to Text Boxes page and verify the header")
    public void test03_VerifyTextBoxSection() {
        MenuWebFlows.goToSubjectInMenu("Text Box");
        Verifications.verifyTextInElement(toolsQAElementsPage.header, "Text Box");
    }

    @Test (description = "Test04 - Fill Text Boxes")
    @Description("This test fill input Text boxes and verify the output")
    public void test04_FillTextBoxes() {
        ElementsWebFlows.fillTextBoxes("Shahar Eliyahu", "shahar@gmail.com", "beer yaakov", "ramat hasharon");
        List<WebElement> inputWebElements = Arrays.asList(toolsQAElementsPage.fullNameTextBox, toolsQAElementsPage.emailTextBox, toolsQAElementsPage.currentAddressTextBox, toolsQAElementsPage.permanentAddressTextBox);
        Verifications.verifyInputOutputTexts(inputWebElements, toolsQAElementsPage.outputTextBox);
    }

    @Test (description = "Test05 - Verify Check Box Section")
    @Description("This test redirects to Check Box page and verify the header")
    public void test05_VerifyCheckBoxSection() {
        MenuWebFlows.goToSubjectInMenu("Check Box");
        Verifications.verifyTextInElement(toolsQAElementsPage.header, "Check Box");
    }
}
