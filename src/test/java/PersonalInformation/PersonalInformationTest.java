package PersonalInformation;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.OptionalInformationPage;
import pages.PersonalInformationPage;

import static junit.framework.Assert.assertEquals;

public class PersonalInformationTest extends BaseTests {
    @Test
    public void testFillingData(){
       PersonalInformationPage personalInformationPage = firstPage.clickOnNextButton();
       personalInformationPage.setSelectNationality("arguments[0].textContent = 'EGYPT'");
       personalInformationPage.setSelectResidnecy("arguments[0].textContent = 'UNITED ARAB EMIRATES'");
       personalInformationPage.setDoF("05051994");
       personalInformationPage.setMobileNumber("+971502174516");

       OptionalInformationPage optionalInformationPage = personalInformationPage.clickNext2Button();
       assertEquals(optionalInformationPage.getAlertText(),"Optional Information","Error");
    }
}
