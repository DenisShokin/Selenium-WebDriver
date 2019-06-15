package steps;

import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.WebDriver;
import pages.SignUpPage;

public class SignUpSteps {

    SignUpPage page;



    @Step
    public void open_signup_page()
    {
        page.open();
    }

    @Step ("User type email [0]")
    public void type_email(String mail)
    {
        page.typeEmail(mail);
    }

    @Step
    public void type_confirmation_email(String mail)
    {
        page.typeConfirmEmail(mail);
    }

    @Step
    public void type_password(String password)
    {
        page.typePassword(password);
    }

    @Step
    public void type_name(String name)
    {
        page.typeName(name);
    }

    @Step
    public void set_month(String month)
    {
        page.setMonth(month);
    }

    @Step
    public void set_day(String day)
    {
        page.typeDay(day);
    }

    @Step
    public void set_year(String year)
    {
        page.typeYear(year);
    }

    @Step
    public void set_gender(String gender)
    {
        page.setGender(gender);
    }

    @Step
    public void set_share(boolean value)
    {
        page.setShare(value);
    }

    @Step
    public void click_signup()
    {
        page.clickSignUpButton();
    }

    @Step
    public void should_see_error(String message)
    {
        Assertions.assertThat(page.isErrorVisible(message))
                .as("User should see message, but he doesn't")
                .isTrue();
    }

    @Step
    public void should_not_see_error(String message)
    {
        Assertions.assertThat(page.isErrorVisible(message))
                .as("User shouldn't see message, but he does")
                .isFalse();
    }

}
