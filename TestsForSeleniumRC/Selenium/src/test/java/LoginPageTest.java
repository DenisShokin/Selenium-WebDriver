//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import java.util.concurrent.TimeUnit;
//
//public class LoginPageTest {
//    private WebDriver driver;
//    private LoginPage loginPage;
//
//    @Before
//    public void setUp()
//    {
//        System.setProperty("webdriver.chrome.driver" , "/Users/denis/Desktop/Selenium/Drivers/chromedriver");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get("https://github.com/login");
//        loginPage = new LoginPage(driver);
//    }
//
//    @Test
//    public void loginWithEmptyCreds()
//    {
//        LoginPage newLoginPage = loginPage.login("","");
//        String error = newLoginPage.getErrorText();
//        Assert.assertEquals("Incorrect username or password.",error);
//    }
//
//    @Test
//    public void createAccountButtonClick()
//    {
//        SignUpPage signUpPage = loginPage.createAccount();
//        String heading = signUpPage.getHeadingText();
//        Assert.assertEquals("Join GitHub",heading);
//
//    }
//
//    @Test
//    public void loginWithIncorrectCreds()
//    {
//        LoginPage newLoginPage = loginPage.login("qwertyuiop","qwertyuiop1234567890");
//        String error = newLoginPage.getErrorText();
//        Assert.assertEquals("Incorrect username or password.",error);
//    }
//
//    @After
//    public void tearDown()
//    {
//        driver.quit();
//    }
//
//}
