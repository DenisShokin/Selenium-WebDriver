//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;
//
//import java.util.concurrent.TimeUnit;
//
//public class MainPageTest
//{
//    private WebDriver driver;
//    private MainPage mainPage;
//    private String searchStringOnPage = "Hello";
//
//    @Before
//    public void setUp()
//    {
//        System.setProperty("webdriver.chrome.driver" , "/Users/denis/Desktop/Selenium/Drivers/chromedriver");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get("https://github.com/");
//        mainPage = PageFactory.initElements(driver, MainPage.class);
//    }
//
//    @Test
//    public void signIn()
//    {
//        LoginPage loginPage = mainPage.clickSignIn();
//        String heading = loginPage.getHeadingText();
//        Assert.assertEquals("Check loginPage heading", "Sign in to GitHub", heading);
//    }
//
//    @Test
//    public void failRegisterWithInvalidData()
//    {
//        SignUpPage signUpPage = mainPage.register("testname", "test@mail.ru", "testpassword1234567890");
//        String error = signUpPage.getMainErrorText();
//        Assert.assertEquals("Check error heading", "There were problems creating your account.", error);
//    }
//
//    @Test
//    public void registerEmptyUsername()
//    {
//        SignUpPage signUpPage = mainPage.register("", "test@mail.ru", "testpassword1234567890");
//        String error = signUpPage.getLoginErrorText();
//        Assert.assertEquals("Check error with empty login", "Login can't be blank", error);
//    }
//
//    @Test
//    public void navigateToCodeReviewPage()
//    {
//        CodeReviewPage crp = mainPage.navigateToCodeReview();
//        String heading = crp.getHeadingText();
//        Assert.assertEquals( "Write better code", heading);
//    }
//
//    @Test
//    public void searchInformation()
//    {
//        mainPage.search(searchStringOnPage);
//    }
//
//    @After
//    public void tearDown()
//    {
//        driver.quit();
//    }
//
//}
