//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class SignupPageTest {
//    private WebDriver driver;
//    private SignUpPage signUpPage;
//
//    @Before
//    public void setUp()
//    {
//        System.setProperty("webdriver.chrome.driver", "/Users/denis/Desktop/Selenium/Drivers/chromedriver");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get("https://github.com/join");
//        signUpPage = new SignUpPage(driver);
//    }
//
//    @Test
//    public void shortPassword()
//    {
//        SignUpPage sp = signUpPage.typePassword("101");
//        sp = sp.typeEmail("test@mail.ru");
//        sp.typeUserName("username");
//        Assert.assertFalse(signUpPage.isSignUpButtonEnable());
//    }
//
//    @After
//    public void tearDown()
//    {
//        driver.quit();
//    }
//
//}
