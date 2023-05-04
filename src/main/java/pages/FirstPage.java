package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FirstPage {

    private WebDriver driver;
    private By formFirstScreen = By.xpath("//button[contains(text(),'Next')]");

    public FirstPage(WebDriver driver){
        this.driver=driver;

    }


    public PersonalInformationPage clickOnNextButton() {
         driver.findElement(formFirstScreen).click();
         return new PersonalInformationPage(driver);
    }
}

