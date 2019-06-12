import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MainPage {
    WebDriver driver;
    Actions action;

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
    @FindBy(xpath = "//summary[contains(text(),\"Why GitHub?\")]")
    private WebElement whyGithubPad;
    @FindBy(xpath = "//li[@class='edge-item-fix']//a[text()='Code review']")
    private WebElement codeReviewItem;
    @FindBy (xpath = "//input[@type='text' and @aria-label=\"Search GitHub\"]")
    private WebElement searchInput;

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

    public void navigateToWhyGitHubPad()
    {
        action = new Actions(driver);
        action.moveToElement(whyGithubPad).build().perform();
    }

    public CodeReviewPage navigateToCodeReview()
    {
        navigateToWhyGitHubPad();
        if (codeReviewItem.isDisplayed())
        codeReviewItem.click();
        return new CodeReviewPage(driver);
    }

    public void search(String searchString)
    {
        searchInput.sendKeys(searchString + Keys.ENTER);
    }


}
