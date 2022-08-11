package workflows;

import extensions.UIActions;
import utilities.CommonOps;

public class RadioButtonWebFlow extends CommonOps {

    public static void clickOnRadioButton(String radioButtonName) {
        switch (radioButtonName) {
            case "Yes":
                UIActions.clickOnElement(toolsQARadioButtonPage.radioButtonsTexts.get(0));
                break;
            case "Impressive":
                UIActions.clickOnElement(toolsQARadioButtonPage.radioButtonsTexts.get(1));
                break;
        }
    }
}
