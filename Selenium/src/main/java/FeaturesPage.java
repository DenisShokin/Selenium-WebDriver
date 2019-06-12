import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FeaturesPage {
    WebDriver driver;

     FeaturesPage(WebDriver driver)
    {
        this.driver = driver;
    }

    private By heading = By.xpath("//h1[contains(text(),'How developers work')]");

     String getHeadingText()
    {
        return driver.findElement(heading).getText();
    }

}
