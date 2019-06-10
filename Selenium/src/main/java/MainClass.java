//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.PageFactory;
//import java.util.concurrent.TimeUnit;
//
//public class MainClass
//{
//    static WebDriver driver;
//
//    public static void main(String[] args) {
//
//        System.setProperty("webdriver.chrome.driver" , "/Users/denis/Desktop/Selenium/Drivers/chromedriver");
//       // System.setProperty("phantomjs.binary.path","/Users/denis/Desktop/Selenium/Drivers/phantomjs");
//
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.get("https://github.com/");
//       // MainPage mainPage = new MainPage(driver);
//
//        MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
//        mainPage.clickSignIn();
//       // mainPage.register("testname", "testemail@mail.com", "testpasswordtestpassword");
//
////        driver.get("https://market.yandex.ru/");
//
////        driver.findElement(By.xpath("//a[@class='link n-w-tab__control b-zone b-spy-events' and @href='/catalog--bytovaia-tekhnika/54419']")).click();
////        driver.findElement(By.xpath("//a[text()='Посудомоечные машины']")).click();
////        //driver.findElement(By.xpath("//div[@class='LhMupC0dLR']/span[text()='Hansa']")).click();
////        List<WebElement> elements = driver.findElements(By.xpath("//fieldset[@data-autotest-id=\"7893318\"]//ul[@class=\"_2y67xS5HuR\"]//li[@class='_1-l0XiE_ze']//div[@class='_16hsbhrgAf']"));
////        //selectElement(element.get(2).getText());
////        for(WebElement element:elements)
////        {
////            selectElement(element.getText());
////        }
//
////        WebElement categories = driver.findElement(By.xpath("//div[@class='n-w-tab__control b-zone b-spy-events i-bem n-w-tab__control_js_inited']"));
////        Actions action = new Actions(driver);
////        action.click(categories).build().perform();
////        WebElement phone = driver.findElement(By.xpath("(//a[text()='Мобильные телефоны'])[1]"));
////        action.click(phone).build().perform();
//
////        JavascriptExecutor jse = (JavascriptExecutor)driver;
////        jse.executeScript("alert('Hello world');");
////        try {
////            Thread.sleep(2000);
////        } catch (InterruptedException e) {
////            e.printStackTrace();
////        }
////        driver.switchTo().alert().accept();
////        jse.executeScript("window.scrollBy(0,1000);");
//
////        driver.get("https://signup.live.com/?lic=1");
////        String tab1 = driver.getWindowHandle();
////        WebElement element = driver.findElement(By.xpath("//a[text()='Условия использования']"));
////        element.click();
////
////        for(String tab: driver.getWindowHandles())
////        {
////            driver.switchTo().window(tab);
////        }
////
////        driver.findElement(By.xpath("//a[text()='Часто задаваемые вопросы']")).click();
////
////        driver.switchTo().window(tab1);
////
////        driver.findElement(By.xpath("//input[@id='MemberName']")).sendKeys("Hello");
////
////        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
////        try {
////            FileUtils.copyFile(screenshot, new File ("/Users/denis/Desktop/Selenium/screenshot1.png"));
////        } catch (IOException e) {
////            e.printStackTrace();
////        }
////
////        driver.quit();
//
////        driver.get("https://www.google.ru/imghp?hl=ru&tab=wi&ogbl");
////        WebElement element = driver.findElement(By.xpath("//div[@aria-label='Поиск по картинке']"));
////        element.click();
////        WebElement download = driver.findElement(By.xpath("//a[text()='Загрузить файл']"));
////        download.click();
////        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("/Users/denis/Desktop/Selenium/screenshot1.png");
//
//    }
//
//    public static void selectElement(String name)
//    {
//        String xPath = String.format("//div[@class='LhMupC0dLR']/span[text()='%s']", name);
//        driver.findElement(By.xpath(xPath)).click();
//    }
//
//}
