import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
    WebDriver driver;

    public LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    private By loginField = By.xpath("//input[@id='login_field']");
    private By passwordField = By.xpath("//input[@id='password']");
    private By signInButton = By.xpath("//input[@type='submit']");
    private By heading = By.xpath("//h1[text()='Sign in to GitHub']");
    private By error = By.xpath("//div[@class=\"flash flash-full flash-error\"]/div[@class='container']");
    private By createAccout = By.xpath("//a[text()='Create an account']");

    public LoginPage typeUsername(String username)
    {
        driver.findElement(loginField).sendKeys(username);
        return this;
    }

    public LoginPage typePassword(String password)
    {
        driver.findElement(passwordField).sendKeys(password);
        return this;
    }

    public LoginPage login(String username, String password)
    {
        typeUsername(username);
        typePassword(password);
        driver.findElement(signInButton).click();
        return new LoginPage(driver);
    }

    public String getHeadingText()
    {
        return driver.findElement(heading).getText();
    }

    public String getErrorText()
    {
        return driver.findElement(error).getText();
    }

    public SignUpPage createAccount()
    {
        driver.findElement(createAccout).click();
        return new SignUpPage(driver);
    }
}
