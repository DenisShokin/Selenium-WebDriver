import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class CodeReviewPageTest
{
    private WebDriver driver;
    private CodeReviewPage codeReviewPage;

    @Before
    public void setUp()
    {
//        System.setProperty("webdriver.chrome.driver" , "/Users/denis/Desktop/Selenium/Drivers/chromedriver");
//        driver = new ChromeDriver();
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wb/hub"), caps);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://github.com/features/code-review/");
        codeReviewPage = new CodeReviewPage(driver);
    }

    @Test
    public void returnToAllFetures()
    {
        FeaturesPage featuresPage = codeReviewPage.returnToAllFeaturesPage();
        String heading = featuresPage.getHeadingText();
        Assert.assertEquals("How developers work",heading);
    }

    @After
    public void tearDown()
    {
        driver.quit();
    }
}
