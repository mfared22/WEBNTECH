package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OptionalInformationPage {
    private WebDriver driver;
    private By statusAlert = By.id("Optional");
    public OptionalInformationPage(WebDriver driver) {
        this.driver =driver;
    }

    public String getAlertText(){

        return driver.findElement(statusAlert).getText();
    }
}
