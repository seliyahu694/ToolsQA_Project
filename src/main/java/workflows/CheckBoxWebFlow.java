package workflows;

import extensions.UIActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class CheckBoxWebFlow extends CommonOps {

    @Step("open Check Box Folder")
    private static void openCheckBoxFolder(String parentFolder) {
        switch (parentFolder) {
            case "Home":
                for (int i = 0; i < toolsQACheckBoxPage.checkBoxFolders.size(); i++) {
                    UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxFolders.get(i));
                }
                break;
            case "Desktop":
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxFolders.get(0));
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxFolders.get(1));
                break;
            case "Documents":
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxFolders.get(0));
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxFolders.get(2));
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxFolders.get(3));
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxFolders.get(4));
                break;
            case "WorkSpace":
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxFolders.get(0));
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxFolders.get(2));
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxFolders.get(3));
                break;
            case "Office":
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxFolders.get(0));
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxFolders.get(2));
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxFolders.get(4));
                break;
            case "Downloads":
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxFolders.get(0));
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxFolders.get(3));
                break;
        }
    }

    @Step("check Check Box")
    public static void checkCheckBox(String checkBoxName) {
        switch (checkBoxName) {
            case "Home":
                openCheckBoxFolder(checkBoxName);
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxes.get(0));
                break;
            case "Desktop":
                openCheckBoxFolder(checkBoxName);
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxes.get(1));
                break;
            case "Notes":
                openCheckBoxFolder("Desktop");
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxes.get(2));
                break;
            case "Commands":
                openCheckBoxFolder("Desktop");
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxes.get(3));
                break;
            case "Documents":
                openCheckBoxFolder(checkBoxName);
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxes.get(2));
                break;
            case "WorkSpace":
                openCheckBoxFolder(checkBoxName);
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxes.get(3));
                break;
            case "React":
                openCheckBoxFolder("WorkSpace");
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxes.get(4));
                break;
            case "Angular":
                openCheckBoxFolder("WorkSpace");
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxes.get(5));
                break;
            case "Veu":
                openCheckBoxFolder("WorkSpace");
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxes.get(6));
                break;
            case "Office":
                openCheckBoxFolder(checkBoxName);
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxes.get(4));
                break;
            case "Public":
                openCheckBoxFolder("Office");
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxes.get(5));
                break;
            case "Private":
                openCheckBoxFolder("Office");
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxes.get(6));
                break;
            case "Classified":
                openCheckBoxFolder("Office");
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxes.get(7));
                break;
            case "General":
                openCheckBoxFolder("Office");
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxes.get(8));
                break;
            case "Downloads":
                openCheckBoxFolder(checkBoxName);
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxes.get(3));
                break;
            case "Word File.doc":
                openCheckBoxFolder("Downloads");
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxes.get(4));
                break;
            case "Excel File.doc":
                openCheckBoxFolder("Downloads");
                UIActions.clickOnElement(toolsQACheckBoxPage.checkBoxes.get(5));
                break;
        }
    }
}
