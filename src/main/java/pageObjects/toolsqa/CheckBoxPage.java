package pageObjects.toolsqa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CheckBoxPage {


    // List should contain { Home, Desktop, Documents, WorkSpace, Office, Downloads }
    @FindBy(xpath = "//button[@aria-label='Toggle']")
    public List<WebElement> checkBoxFolders;

    // List should contain all checkboxes
    @FindBy(className = "rct-checkbox")
    public List<WebElement> checkBoxes;

    // List of output text of checked
    @FindBy(xpath = "//div[@id='result']/span")
    public List<WebElement> checkedTextResult;

}
