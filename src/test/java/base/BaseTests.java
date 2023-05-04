package base;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.FirstPage;


public class BaseTests<Select> {

    private WebDriver driver;
    protected FirstPage firstPage;


    @BeforeClass
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mahmoud.registration.wntdev.ae/auth/register?hash=CDt5a%2BgKV5n2aX6N4xxS4WIBHzdXs2qtQ0fblxs%2B7HVpqLy%2BtNFj32zKQ9BwB18hHo0%2BlYoXrktQRKf0n4IO77uiw9VmuA7SH9wMsE9exW4sKBtLqfhbMpcP27WXzdikKHUJ9oK8TlZJeRoW19LLgtyKsHpttaM8wufrw3fx4JAiLhhGhmKwxr0%2Bbua0nKbfIs2OrRym%2B1v0HrMRdx5VBqW0uzrOkNeQCkOP8Afbwio%2BUvZmtHbJW2U8yItRTV4ApC5zuhmwP8cHZpYTwU%2FImzlNWMOraoFsZjkGOoB6Addbjiwz24RoC5LYsY4lXCXATjvyTuj641gBEiLV9b2fIGhp40Fh2FLxIg%2BEYM6G8UyFT8VnFwNm7UPqmQP3oa7ZUjcF1H31m0zfbIqcH8P0e4zfAf%2FaZgU124v6tUFYm3U1x4X8%2B0p4p2UYUpgdRmjrSrkF1Ez%2B1wh1M%2F1CvESBxFexoxMBSXg600CUN2EUTHgoZ1muwPWcpDEERI50FYnESzNGrr2bNpQ%2FBfPFBKXfnCSfenEEH%2FLRhjcqB4BwhdF5Z3Ubw2HlBKT7o9hJd3cdZHdpPhBYpryQGQq7PQjaY3SP%2FMfqdW3ZHWM9F4DgDBMvChr23VTMAhaKkjuSxLbH5n%2FwSBrqqgvVLxf%2BzZswCLG4wm2PurGoPb0%2BazgLlIA%3D");
        firstPage = new FirstPage(driver);

        JavascriptExecutor jsss = (JavascriptExecutor) driver;
        jsss.executeScript("window.scrollBy(0,1000)");


    }

    @AfterClass
    public void teardown(){

        driver.quit();
    }

}
