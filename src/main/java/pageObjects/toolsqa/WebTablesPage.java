package pageObjects.toolsqa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WebTablesPage {

    // Add Button
    @FindBy(id = "addNewRecordButton")
    public WebElement addButton;

    // form fields
    @FindBy(id = "firstName")
    public WebElement firstNameTextBox;

    @FindBy(id = "lastName")
    public WebElement lastNameTextBox;

    @FindBy(id = "userEmail")
    public WebElement emailTextBox;

    @FindBy(id = "age")
    public WebElement ageTextBox;

    @FindBy(id = "salary")
    public WebElement salaryTextBox;

    @FindBy(id = "department")
    public WebElement departmentTextBox;

    @FindBy(id = "submit")
    public WebElement submitButton;

    @FindBy(className = "action-buttons")
    public List<WebElement> filledTableRows;

    @FindBy(xpath = "//select[@aria-label='rows per page']")
    public WebElement numberOfRowsToShowDropDown;

}
