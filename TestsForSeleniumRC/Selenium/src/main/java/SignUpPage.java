import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignUpPage
{
    WebDriver driver;

    public SignUpPage(WebDriver driver)
    {
        this.driver = driver;
    }

    private By heading = By.xpath("//div[@class='setup-header setup-org']/h1");
    private By userNameField = By.xpath("//input[@id='user_login']");
    private By emailField = By.xpath("//input[@id='user_email']");
    private By passwordField = By.xpath("//input[@id='user_password']");
    private By signUpButton = By.xpath("//button[@id='signup_button']");
    private By mainError = By.xpath("//div[@class='flash flash-error my-3']");
    private By loginEmptyError = By.xpath("(//dl[@class='form-group errored required']//dd[@class='error'])[1]");

    public SignUpPage typeUserName(String userName)
    {
        driver.findElement(userNameField).sendKeys(userName);
        return this;
    }

    public SignUpPage typePassword(String password)
    {
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public SignUpPage typeEmail(String email)
    {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public SignUpPage registerWithInvalidCreds(String userName, String password, String email)
    {
        typeUserName(userName);
        typeEmail(email);
        typePassword(password);
        driver.findElement(signUpButton).click();
        return new SignUpPage(driver);
    }

    public String getHeadingText()
    {
        return driver.findElement(heading).getText();
    }

    public String getMainErrorText()
    {
        return driver.findElement(mainError).getText();
    }

    public String getLoginErrorText()
    {
        return driver.findElement(loginEmptyError).getText();
    }

    public Boolean isSignUpButtonEnable()
    {
        return driver.findElement(signUpButton).isEnabled();
    }

}
