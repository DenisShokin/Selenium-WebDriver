import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CodeReviewPage
{
    WebDriver driver;

    public CodeReviewPage(WebDriver driver)
    {
        this.driver = driver;
    }

    private By heading = By.xpath("//h1[text()='Write better code']");
    private By backToAllFeaturesButton = By.xpath("//div[@class=\"text-center border-y py-4\"]//a[@href=\"/features\"]");

    public String getHeadingText()
    {
        return driver.findElement(heading).getText();
    }

    public FeaturesPage returnToAllFeaturesPage()
    {
        driver.findElement(backToAllFeaturesButton).click();
        return new FeaturesPage(driver);
    }


}
