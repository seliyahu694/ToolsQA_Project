package pageObjects.toolsqa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FormsPage {
    @FindBy(css = ".pattern-backgound.playgound-header")
    public WebElement header;
}
