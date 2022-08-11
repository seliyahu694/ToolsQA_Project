package workflows;

import extensions.UIActions;
import io.qameta.allure.Step;
import utilities.CommonOps;

public class WebTablesWebFlow extends CommonOps {

    @Step("fill Web Table Form from external file and click add to add to table")
    public static void fillWebTableForm(String firstName, String lastName, String email, String age, String salary, String department) {
        UIActions.clickOnElement(toolsQAWebTablesPage.addButton);
        UIActions.setTextAsHuman(toolsQAWebTablesPage.firstNameTextBox, firstName);
        UIActions.setTextAsHuman(toolsQAWebTablesPage.lastNameTextBox, lastName);
        UIActions.setTextAsHuman(toolsQAWebTablesPage.emailTextBox, email);
        UIActions.setTextAsHuman(toolsQAWebTablesPage.ageTextBox, age);
        UIActions.setTextAsHuman(toolsQAWebTablesPage.salaryTextBox, salary);
        UIActions.setTextAsHuman(toolsQAWebTablesPage.departmentTextBox, department);
        UIActions.clickOnElement(toolsQAWebTablesPage.submitButton);


    }

    @Step("click on drop down and select how many rows to view in table")
    public static void clickHowManyRowsToShow(String value) {
        UIActions.selectByValue(toolsQAWebTablesPage.numberOfRowsToShowDropDown, value);
    }
}
