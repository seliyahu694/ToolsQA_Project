package sanity;

import extensions.Verifications;
import io.qameta.allure.Description;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import utilities.CommonOps;
import workflows.*;

import java.util.*;

@Listeners(utilities.Listeners.class)
public class ToolsQAElements extends CommonOps {

    @Test(description = "Test01 - Verify Site Header")
    @Description("This test check if the logo picture is correct using Sikuli")
    public void test01_VerifySiteLogo() {
        Verifications.visualSiteHeader("logo");
    }

    @Test(description = "Test02 - Verify Elements Page")
    @Description("This test redirects to Elements page and verify the header")
    public void test02_VerifyElementsPage() {
        HomeWebFlows.goToPage("Elements");
        Verifications.verifyTextInElement(toolsQAElementsPage.header, "Elements");
    }

    @Test(description = "Test03 - Verify Text Box Section")
    @Description("This test redirects to Text Boxes page and verify the header")
    public void test03_VerifyTextBoxSection() {
        MenuWebFlows.goToSubjectInMenu("Text Box");
        Verifications.verifyTextInElement(toolsQAElementsPage.header, "Text Box");
    }

    @Test(description = "Test04 - Fill Text Boxes")
    @Description("This test fill input Text boxes and verify the output")
    public void test04_FillTextBoxes() {
        ElementsWebFlows.fillTextBoxes("Shahar Eliyahu", "shahar@gmail.com", "beer yaakov", "ramat hasharon");
        List<WebElement> inputWebElements = Arrays.asList(toolsQAElementsPage.fullNameTextBox, toolsQAElementsPage.emailTextBox, toolsQAElementsPage.currentAddressTextBox, toolsQAElementsPage.permanentAddressTextBox);
        Verifications.verifyInputOutputTexts(inputWebElements, toolsQAElementsPage.outputTextBox);
    }

    @Test(description = "Test05 - Verify Check Box Section")
    @Description("This test redirects to Check Box page and verify the header")
    public void test05_VerifyCheckBoxSection() {
        MenuWebFlows.goToSubjectInMenu("Check Box");
        Verifications.verifyTextInElement(toolsQAElementsPage.header, "Check Box");
    }

    @Test(description = "Test06 - Check Check Box")
    @Description("This test open the folders and checks check box")
    public void test06_CheckCheckBox() {
        CheckBoxWebFlow.checkCheckBox("Classified");
        Verifications.verifyCheckedCheckBox();
    }

    @Test(description = "Test07 - Verify Radio Button Section")
    @Description("This test redirects to Radio Button page and verify the header")
    public void test07_VerifyRadioButtonSection() {
        MenuWebFlows.goToSubjectInMenu("Radio Button");
        Verifications.verifyTextInElement(toolsQAElementsPage.header, "Radio Button");
    }

    @Test(description = "Test08 - Select Radio Button")
    @Description("This test select Radio Button")
    public void test08_SelectRadioButton() {
        RadioButtonWebFlow.clickOnRadioButton("Impressive");
        Verifications.verifySelectedRadioButton();
    }

    @Test(description = "Test09 - Verify Web Tables Section")
    @Description("This test redirects to Web Tables page and verify the header")
    public void test09_VerifyWebTablesSection() {
        MenuWebFlows.goToSubjectInMenu("Web Tables");
        Verifications.verifyTextInElement(toolsQAElementsPage.header, "Web Tables");
    }

    @Test(description = "Test10 - Add To Web Table", dataProvider = "data-provider-webTables", dataProviderClass = utilities.ManageDDT.class)
    @Description("This test add data to Web Table from Data Driven file")
    public void test10_AddToWebTable(String firsName, String lastName, String email, String age, String salary, String department) {
        WebTablesWebFlow.fillWebTableForm(firsName, lastName, email, age, salary, department);
    }

    @Test(description = "test11 - verify Table Size")
    public void test11_verifyTableSize() {
        WebTablesWebFlow.clickHowManyRowsToShow("25");
        Verifications.verifyTableSize(13);
    }

    @Test(description = "Test12 - Verify Buttons Section")
    @Description("This test redirects to Buttons page and verify the header")
    public void test12_VerifyButtonsSection() {
        MenuWebFlows.goToSubjectInMenu("Buttons");
        Verifications.verifyTextInElement(toolsQAElementsPage.header, "Buttons");
    }

    @Test(description = "test13 - verify Clicked Button", dataProvider = "data-provider-buttons", dataProviderClass = utilities.ManageDDT.class)
    public void test13_verifyDoubleClickedButton(String clickType) {
        ButtonsWebFlow.clickOnButton(clickType);
        Verifications.verifyClickedButtons(clickType);
    }
}