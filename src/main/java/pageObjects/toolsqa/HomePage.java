package pageObjects.toolsqa;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage {

    @FindBy(css=".card.mt-4.top-card")
    public List<WebElement> subjectBtns;


}
