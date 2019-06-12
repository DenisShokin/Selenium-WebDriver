import com.codeborne.selenide.Condition;
import org.junit.*;
import static com.codeborne.selenide.Configuration.baseUrl;

public class SignUpTest {

    SignUpPage page;

    @BeforeClass
    public static void setUp()
    {
        System.setProperty("webdriver.chrome.driver" , "/Users/denis/Desktop/Selenium/Drivers/chromedriver");
        baseUrl="https://www.spotify.com/us/signup";
        //browser=""; Default value: "chrome"
    }

    @Test
    public void typeInvalidYear()
    {
        page = new SignUpPage();
        page.open()
                .setMonth("December")
                .typeDay("20")
                .typeYear("21")
                .setShare(true);
        page.getError("Please enter a valid year.").shouldBe(Condition.visible);
        page.getError("When were you born?").shouldNotBe(Condition.visible);
    }

    @Test
    public void typeInvalidEmail()
    {
        page = new SignUpPage();
        page.open()
                .typeEmail("test_email@mail.ru")
                .typeConfirmEmail("wrong_email@mail.ru")
                .typeName("test_name")
                .clickSignUpButton();
        page.getError("Email address doesn't match.").shouldBe(Condition.visible);
    }

    @Test
    public void signUpWithEmptyPassword()
    {
        page = new SignUpPage();
        page.open()
                .typeEmail("test_email@mail.ru")
                .typeName("test_name")
                .typeConfirmEmail("test_email@mail.ru")
                .clickSignUpButton();
        page.getError("Please choose a password.").shouldBe(Condition.visible);
    }

    @Test
    public void typeInvalidValues()
    {
        page = new SignUpPage();
        page.open()
                .typeEmail("test_email@mail.ru.qwerty")
                .typeConfirmEmail("test_email@mail.ru")
                .typePassword("qwerty")
                .typeName("name")
                .setGender("Male")
                .setShare(false)
                .clickSignUpButton();
        page.getError("When were you born?").shouldNotBe(Condition.visible);
    }

}
