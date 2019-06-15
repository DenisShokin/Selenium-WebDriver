package pages;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.openqa.selenium.By.xpath;

@DefaultUrl("https://www.spotify.com/us/signup/")
public class SignUpPage extends PageObject {

    private By emailField = xpath("//input[@id='register-email']");
    private By confirmEmailField = xpath("//input[@id='register-confirm-email']");
    private By passwordField = xpath("//input[@id='register-password']");
    private By nameField = xpath("//input[@id='register-displayname']");
    private By monthDropDown = xpath("//select[@id='register-dob-month']");
    private String monthDropDownOption = "//select[@id='register-dob-month']//option[text()='%s']";
    private By dayField = xpath("//input[@id='register-dob-day']");
    private By yearField = xpath("//input[@id='register-dob-year']");
    private String genderRadioButton = "//li[@id='li-gender']//label[normalize-space()='%s']/input";
    private By shareCheckBox = xpath("//input[@id='register-male']");
    private By signUpButton = xpath("//a[@id='register-button-email-submit']");
    private By errorLabel = xpath("//label[@class='has-error' and string-length(text()>0)]");
    private String errorByText = "//label[@class=\"has-error\" and text()=\"%s\"]";

    public SignUpPage typeEmail(String email)
    {
        find(emailField).sendKeys(email);
        return this;
    }

    public SignUpPage typeConfirmEmail(String email)
    {
        find(confirmEmailField).sendKeys(email);
        return this;
    }

    public SignUpPage typePassword(String password)
    {
        find(passwordField).sendKeys(password);
        return this;
    }

    public SignUpPage typeName(String name)
    {
        find(nameField).sendKeys(name);
        return this;
    }

    public SignUpPage setMonth(String month)
    {
        find(monthDropDown).click();
        find(xpath(String.format(monthDropDownOption, month))).waitUntilVisible().click();
        return this;
    }

    public SignUpPage typeDay(String day)
    {
        find(dayField).sendKeys(day);
        return this;
    }

    public SignUpPage typeYear(String year)
    {
        find(yearField).sendKeys(year);
        return this;
    }

    public SignUpPage setGender(String value)
    {
        $(By.xpath(String.format(genderRadioButton, value))).click();
        return this;
    }

    public SignUpPage setShare(boolean value)
    {
        WebElement checkbox = find(shareCheckBox);
        if (!checkbox.isSelected() == value)
            checkbox.click();
        return this;
    }

    public void clickSignUpButton()
    {
        $(signUpButton).click();
    }

    public List<WebElementFacade> getErrors()
    {
        return findAll(errorLabel);
    }

    public String getErrorByNumber(int number)
    {
        return getErrors().get(number-1).getText();
    }

    public boolean isErrorVisible(String message)
    {
        return findAll(xpath(String.format(errorByText, message))).size() > 0
                && findAll(xpath(String.format(errorByText, message))).get(0).isDisplayed();
    }
}
