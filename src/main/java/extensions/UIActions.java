package extensions;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.CommonOps;

import java.time.Duration;
import java.util.Locale;

public class UIActions extends CommonOps {

    /**
     * Click on element
     *
     * @param webElement = the element to click
     * @return true if webElement was clicked, false otherwise
     */
    @Step("click On Element")
    public static boolean clickOnElement(WebElement webElement) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(webElement));
            highLighterMethod(webElement);
            webElement.click();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * @param webElement = element to check if selected
     * @return true if webElement is selected, false otherwise
     */
    @Step("is Element Selected")
    public static boolean isElementSelected(WebElement webElement) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(webElement));
            if (webElement.isSelected()){
                highLighterMethod(webElement);
                return true;
            }
            else
                return false;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Highlight the element
     *
     * @param webElement = teh element to highlight
     * @return true if highlighted, false otherwise
     */
    @Step("highLighter Method")
    public static boolean highLighterMethod(WebElement webElement) {
        try {
            JavascriptExecutor js = (JavascriptExecutor) getDriver();
            js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 3px solid blue;');", webElement);
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    /**
     * @param locator     = how to find the WebElement
     * @param locatorText = locator string
     * @return element
     */
    @Step("get WebElement")
    private static WebElement getWebElement(String locator, String locatorText) {
        WebElement webElement = null;

        try {
            switch (locator) {
                case "id":
                    webElement = getDriver().findElement(By.id(locatorText));
                    break;
                case "xPath":
                    webElement = getDriver().findElement(By.xpath(locatorText));
                    break;
                case "name":
                    webElement = getDriver().findElement(By.name(locatorText));
                    break;
                case "css":
                    webElement = getDriver().findElement(By.cssSelector(locatorText));
                    break;
                case "linkText":
                    webElement = getDriver().findElement(By.partialLinkText(locatorText));
                    break;
                case "className":
                    webElement = getDriver().findElement(By.className(locatorText));
                    break;
                case "tagName":
                    webElement = getDriver().findElement(By.tagName(locatorText));
                    break;
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return webElement;
    }

    /**
     * Finds element by id
     *
     * @param byId = id string
     * @return element
     */
    @Step("webElement By Id")
    public static WebElement webElementById(String byId) {
        try {
            return getWebElement("id", byId);
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    /**
     * Finds element by xpath
     *
     * @param byXpath = xpath string
     * @return element
     */
    @Step("webElement By Xpath")
    public static WebElement webElementByXpath(String byXpath) {
        try {
            return getWebElement("xPath", byXpath);
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    /**
     * Finds element by name
     *
     * @param byName = name string
     * @return element
     */
    @Step("webElement By Name")
    public static WebElement webElementByName(String byName) {
        try {
            return getWebElement("name", byName);
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    /**
     * Finds element by css
     *
     * @param byCss = css string
     * @return element
     */
    @Step("webElement By Css")
    public static WebElement webElementByCss(String byCss) {
        try {
            return getWebElement("css", byCss);
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    /**
     * Finds element by link text
     *
     * @param byLinkText = link text string
     * @return element
     */
    @Step("webElement By Link Text")
    public static WebElement webElementByLinkText(String byLinkText) {
        try {
            return getWebElement("linkText", byLinkText);
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    /**
     * Finds element by class name
     *
     * @param byClassName = class name string
     * @return element
     */
    @Step("webElement By Class Name")
    public static WebElement webElementByClassName(String byClassName) {
        try {
            return getWebElement("className", byClassName);
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    /**
     * Finds element by tag name
     *
     * @param byTagName = tag name string
     * @return element
     */
    @Step("webElement By Tag Name")
    public static WebElement webElementByTagName(String byTagName) {
        try {
            return getWebElement("tagName", byTagName);
        } catch (Exception e) {
            e.getMessage();
        }
        return null;
    }

    /**
     * Waiting until the element is displayed
     *
     * @param webElement = The element to wait for
     * @return true if the element is displayed and enabled, false otherwise
     */
    @Step("wait For Element Exist")
    public static boolean waitForElementExist(WebElement webElement) {
        try {
            if (isElementDisplayed(webElement) && isElementEnabled(webElement) && isElementVisible(webElement))
                return true;
        } catch (Exception e) {
            e.getMessage();
        }
        return false;
    }

    /**
     * Waiting for specific element to be visible
     *
     * @param webElement = the element to check if visible
     * @return true if webElement is visible, false otherwise
     */
    @Step("is Element Visible")
    public static boolean isElementVisible(WebElement webElement) {
        try {
            wait.until(ExpectedConditions.visibilityOf(webElement));
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    /**
     * Check if element is enabled
     *
     * @param webElement
     * @return true if enabled, false otherwise
     */
    @Step("is Element Enabled")
    public static boolean isElementEnabled(WebElement webElement) {
        try {
            if (webElement.isEnabled())
                return true;
            else
                return false;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Check if element is displayed on screen
     *
     * @param webElement
     * @return true if displayed, false otherwise
     */
    @Step("is Element Displayed")
    public static boolean isElementDisplayed(WebElement webElement) {
        try {
            if (webElement.isDisplayed())
                return true;
            else
                return false;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Move the mouse over the element
     *
     * @param webElement
     * @return
     */
    @Step("mouse Over")
    public static boolean mouseOver(WebElement webElement) {
        try {
            highLighterMethod(webElement);
            action.moveToElement(webElement).build().perform();
            return true;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    /**
     * Get text from element
     *
     * @param webElement = The element to get text from
     */
    @Step("get Text From Element")
    public static String getTextFromElement(WebElement webElement) {
        String elementText = "";
        try {
            isElementVisible(webElement);
            highLighterMethod(webElement);
            scrollToElement(webElement);
            if (webElement.getAttribute("tagName").contains("INPUT") || webElement.getAttribute("tagName").contains("TEXTAREA")) {
                elementText = webElement.getAttribute("value");
            } else {
                elementText = webElement.getText();
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return elementText;
    }

    public static String getTextFromElementToLowerCase(WebElement webElement) {
        String elementText = getTextFromElement(webElement);
        return elementText.toLowerCase();
    }

    /**
     * Scroll to specific element
     *
     * @param webElement
     * @return true id scrolled to element, false otherwise
     */
    @Step("scroll To Element")
    public static boolean scrollToElement(WebElement webElement) {
        try {
            if (waitForElementExist(webElement)) {
                highLighterMethod(webElement);
//                action.scrollToElement(webElement).build().perform();
                JavascriptExecutor js = (JavascriptExecutor) getDriver();
                js.executeScript("arguments[0].scrollIntoView(true);", webElement);
                return true;
            }
        } catch (Exception e) {
            e.getMessage();
        }
        return false;
    }

    /**
     * Get new sub string from element text starting from specific index of char + 1
     *
     * @param webElement           = the element to get the text from
     * @param charToStartNewString = the char to take the new string from
     * @return
     */
    @Step("get New Sub String From Element")
    public static String getNewSubStringFromElement(WebElement webElement, char charToStartNewString) {
        int startIndex = getTextFromElement(webElement).indexOf(charToStartNewString) + 1;
        int length = getTextFromElement(webElement).length();
        int newLength = length - startIndex;
        char[] newChars = new char[newLength];
        getTextFromElement(webElement).getChars(startIndex, length, newChars, 0);
        return new String(newChars);
    }

    /**
     * Send text to element
     *
     * @param webElement = The element to send text to
     * @param text       = The text to sent to element
     */
    @Step("set Text")
    public static void setText(WebElement webElement, String text) {
        try {
            waitForElementExist(webElement);
            scrollToElement(webElement);
            highLighterMethod(webElement);
            webElement.clear();
            webElement.sendKeys(text);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    /**
     * Send text to element as human (slow typing)
     *
     * @param webElement = The element to send text to
     * @param text       = The text to sent to element
     */
    @Step("set Text As Human")
    public static void setTextAsHuman(WebElement webElement, String text) {
        try {
            waitForElementExist(webElement);
            scrollToElement(webElement);
            highLighterMethod(webElement);
            webElement.clear();
            for (char ch : text.toCharArray()) {
                wait.withTimeout(Duration.ofMillis(500));
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}