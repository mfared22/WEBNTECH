package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PersonalInformationPage {

    private WebDriver driver;
    private By selectNationality = By.xpath("//*[text()='Select Nationality']");
    private By selectResidnecy = By.xpath("//*[text()='Select Country of Residence']");
    private By clickNextButton2 = By.id("Button");
    private By doF = By.xpath("//div[@class='row']//div[3]//div[1]//div[1]//div[1]//div[1]//div[1]//input[2]");
    private By mobileNumber = By.xpath("//input[@type='tel']");


    public PersonalInformationPage(WebDriver driver){

        this.driver =driver;
    }

    public void setSelectNationality(String selectNationality1){
        driver.findElement(selectNationality);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript(selectNationality1);

    }

    public void setSelectResidnecy(String selectResidnecy1){
        driver.findElement(selectResidnecy);
        JavascriptExecutor jss = (JavascriptExecutor) driver;
        jss.executeScript(selectResidnecy1);


    }

    public void setDoF (String dof){
      driver.findElement(doF).sendKeys();
    }


    public void setMobileNumber (String MN) {
        driver.findElement(mobileNumber).sendKeys();
    }
    public OptionalInformationPage clickNext2Button () {

        driver.findElement(clickNextButton2).click();
        return new OptionalInformationPage(driver);
    }
}


