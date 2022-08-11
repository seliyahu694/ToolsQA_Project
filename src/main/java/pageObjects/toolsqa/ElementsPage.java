package pageObjects.toolsqa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ElementsPage extends MenuPage {

    // Elements Page Header
    @FindBy(css = ".pattern-backgound.playgound-header")
    public WebElement header;

    // Text Box Section
    @FindBy(id = "userName")
    public WebElement fullNameTextBox;

    // Form fields
    @FindBy(id = "userEmail")
    public WebElement emailTextBox;

    @FindBy(id = "currentAddress")
    public WebElement currentAddressTextBox;

    @FindBy(id = "permanentAddress")
    public WebElement permanentAddressTextBox;

    @FindBy(id = "submit")
    public WebElement submitBtn;

    @FindBy(className = "mb-1")
    public List<WebElement> outputTextBox;


}
