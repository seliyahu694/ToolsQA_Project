package pageObjects.toolsqa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ButtonsPage {

    @FindBy(id = "doubleClickBtn")
    public WebElement doubleClickButton;

    @FindBy(id = "rightClickBtn")
    public WebElement rightClickButton;

    @FindBy(id = "RLdRS")
    public WebElement Button;

    @FindBy(id = "doubleClickMessage")
    public WebElement doubleClickOutputMessage;

    @FindBy(id = "rightClickMessage")
    public WebElement rightClickOutputMessage;

    @FindBy(id = "dynamicClickMessage")
    public WebElement clickMeOutputMessage;

}
