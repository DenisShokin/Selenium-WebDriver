import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static org.openqa.selenium.By.xpath;

public class SignUpPage {

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

    public SignUpPage open()
    {
        Selenide.open("/");
        return this;
    }

    public SignUpPage typeEmail(String email)
    {
        $(emailField).setValue(email);
        return this;
    }

    public SignUpPage typeConfirmEmail(String email)
    {
        $(confirmEmailField).setValue(email);
        return this;
    }

    public SignUpPage typePassword(String password)
    {
        $(passwordField).setValue(password);
        return this;
    }

    public SignUpPage typeName(String name)
    {
        $(nameField).setValue(name);
        return this;
    }

    public SignUpPage setMonth(String month)
    {
        $(monthDropDown).selectOption(month);
        return this;
    }

    public SignUpPage typeDay(String day)
    {
        $(dayField).setValue(day);
        return this;
    }

    public SignUpPage typeYear(String year)
    {
        $(yearField).setValue(year);
        return this;
    }

    public SignUpPage setGender(String value)
    {
        $(By.xpath(String.format(genderRadioButton, value))).click();
        return this;
    }

    public SignUpPage setShare(boolean value)
    {
        $(shareCheckBox).setSelected(value);
        return this;
    }

    public void clickSignUpButton()
    {
        $(signUpButton).click();
    }

    public ElementsCollection getErrors()
    {
        return $$(errorLabel);
    }

    public SelenideElement getErrorByNumber(int number)
    {
        return getErrors().get(number-1);
    }

    public SelenideElement getError(String message)
    {
        return $(xpath(String.format(errorByText, message)));
    }
}
