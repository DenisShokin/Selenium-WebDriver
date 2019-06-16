package testpackage.steps.jbehave;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import testpackage.steps.serenity.SignUpSteps;

public class SignUpPageSteps {

    @Steps
    SignUpSteps steps;

    @Given("I open_signup_page")
    public void openPage()
    {
        steps.open_signup_page();
    }

    @When("I set month \"$month\"")
    public void setMonth(String month)
    {
        steps.set_month(month);
    }

    @When("I set day \"$day\"")
    public void setDay(String day)
    {
        steps.set_day(day);
    }

    @When("I set year \"$year\"")
    public void setYear(String year)
    {
        steps.set_year(year);
    }

    @When("I check share")
    public void checkShare()
    {
        steps.set_share(true);
    }

    @When("I uncheck share")
    public void uncheckShare()
    {
        steps.set_share(false);
    }

    @When("I type email \"$email\"")
    public void typeEmail(String email)
    {
        steps.type_email(email);
    }

    @When("I type confirmation email \"$email\"")
    public void typeConfirmationEmail(String email)
    {
        steps.type_confirmation_email(email);
    }

    @When("I type name \"$name\"")
    public void typeName(String name)
    {
        steps.type_name(name);
    }

    @When("I type password \"$password\"")
    public void typePassword(String password)
    {
        steps.type_password(password);
    }

    @When("I click signup")
    public void clickSinup()
    {
        steps.click_signup();
    }

    @When("I set gender \"$gender\"")
    public void setGender(String gender)
    {
        steps.set_gender(gender);
    }

    @Then("I see error \"$message\"")
    public void shouldSeeErrorByText(String message)
    {
        steps.should_see_error(message);
    }

    @Then("I don't see error \"$message\"")
    public void shouldNotSeeErrorByText(String message)
    {
        steps.should_not_see_error(message);
    }

}
