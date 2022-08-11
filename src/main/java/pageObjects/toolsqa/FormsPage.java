package pageObjects.toolsqa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FormsPage {
    @FindBy(css = ".pattern-backgound.playgound-header")
    public WebElement header;
}
