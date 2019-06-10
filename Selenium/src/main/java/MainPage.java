import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    WebDriver driver;

    public MainPage(WebDriver driver)
    {
        this.driver = driver;
    }

    @FindBy(xpath = "//a[@href='/login']")
    private WebElement signInButton;

    @FindBy(xpath = "(//a[@href=\"/join?source=header-home\" and @data-ga-click])[2]")
    private WebElement signUpButton;
    @FindBy(xpath = "//input[@id='user[login]']")
    private WebElement userNameField;
    @FindBy(xpath = "//input[@id='user[email]']")
    private WebElement emailField;
    @FindBy(xpath = "//input[@id='user[password]']")
    private WebElement passwordField;
    @FindBy(xpath = "//form[@class=\"home-hero-signup text-gray-dark js-signup-form\"]//button[text()='Sign up for GitHub']")
    private WebElement signUpForGithubButton;

    public LoginPage clickSignIn()
    {
        signInButton.click();
        return new LoginPage(driver);
    }

    public SignUpPage clickSignUp()
    {
        signUpButton.click();
        return new SignUpPage(driver);
    }

    public SignUpPage clickSignUpForGithub()
    {
        signUpForGithubButton.click();
        return new SignUpPage(driver);
    }

    public MainPage typeUserName(String userName)
    {
        userNameField.sendKeys(userName);
        return this;
    }

    public MainPage typePassword(String password)
    {
        passwordField.sendKeys(password);
        return this;
    }

    public MainPage typeEmail(String email)
    {
        emailField.sendKeys(email);
        return this;
    }

    public SignUpPage register (String userName, String email, String password)
    {
        typeUserName(userName);
        typeEmail(email);
        typePassword(password);
        clickSignUpForGithub();
        return new SignUpPage(driver);
    }


}
