import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.*;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import steps.SignUpSteps;

@RunWith(SerenityRunner.class)
public class WhenSignUp {

    @Steps
    SignUpSteps steps;

    @Managed(driver = "chrome")
    WebDriver driver;

    @Test
    public void typeInvalidYear()
    {
        steps.open_signup_page();
        steps.set_month("December");
        steps.set_day("20");
        steps.set_year("21");
        steps.set_share(true);
        steps.should_see_error("Please enter a valid year.");
        steps.should_not_see_error("When were you born?");
    }

    @Test
    public void typeInvalidEmail()
    {
        steps.open_signup_page();
        steps.type_email("test_email@mail.ru");
        steps.type_confirmation_email("wrong_email@mail.r");
        steps.type_name("test_name");
        steps.click_signup();
        steps.should_see_error("Email address doesn't match.");
    }

    @Test
    public void signUpWithEmptyPassword()
    {
        steps.open_signup_page();
        steps.type_email("test_email@mail.ru");
        steps.type_confirmation_email("test_email@mail.ru");
        steps.click_signup();
        steps.should_see_error("Please choose a password.");
    }

    @Test
    public void typeInvalidValues()
    {
        steps.open_signup_page();
        steps.type_email("test_email@mail.ru.qwerty");
        steps.type_confirmation_email("test_email@mail.ru");
        steps.type_password("qwerty");
        steps.type_name("name");
        steps.set_gender("Male");
        steps.set_share(false);
        steps.click_signup();
        steps.should_not_see_error("When were you born?");
    }

}
