package pageObjects.toolsqa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RadioButtonPage {

    @FindBy(className = "custom-control-input")
    public List<WebElement> radioButtons;

    @FindBy(className = "custom-control-label")
    public List<WebElement> radioButtonsTexts;

    @FindBy(className = "text-success")
    public WebElement outputOfElectedRadioButtonText;
}
