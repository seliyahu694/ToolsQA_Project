package pageObjects.toolsqa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MenuPage {

    @FindBy(className = "group-header")
    public List<WebElement> headerMenu;

    @FindBy(css = ".btn.btn-light")
    public List<WebElement> subjectMenu;
}
