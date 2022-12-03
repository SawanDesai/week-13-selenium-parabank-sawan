package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.UtilityTest;

public class RegisterTest extends UtilityTest {
    //1.verifyThatSigningUpPageDisplay
    @Before
    public void setUp() {
        openBrowser();
    }

    @Test
    //1.verifyThatSigningUpPageDisplay
    public void verifyThatSigningUpPageDisplay() {
        //* click on the ‘Register’ link
        clickOnElement(By.xpath("//a[contains(text(),'Register')]"));
        //* Verify the text ‘Signing up is easy!’
        String vSignUp = "Signing up is easy!";
        Assert.assertEquals(vSignUp, getTextFromElement(By.xpath("//h1[contains(text(),'Signing up is easy!')]")));
    }

    //2.userSholdRegisterAccountSuccessfully
    @Test
    public void userShouldRegisterAccountSuccessfully() {
        //* click on the ‘Register’ link
        clickOnElement(By.xpath("//a[contains(text(),'Register')]"));
        //         * Enter First name
        sendTextToElement(By.xpath("//input[@id='customer.firstName']"), "sawan");
        //* Enter Last name
        sendTextToElement(By.xpath("//input[@id='customer.lastName']"), "desai");
        //       * Enter Address
       sendTextToElement(By.xpath("//input[@id='customer.address.street']"), "20 tudor walk");
        //     * Enter City
        sendTextToElement(By.xpath("//input[@id='customer.address.city']"), "United Kingdom");
        //   * Enter State
        sendTextToElement(By.xpath("//input[@id='customer.address.state']"), "London");
        // * Enter Zip Code
        sendTextToElement(By.xpath("//input[@id='customer.address.zipCode']"), "wd24 7pa");
        //* Enter Phone
        sendTextToElement(By.xpath("//input[@id='customer.phoneNumber']"), "01923 111 222");
        //* Enter SSN
        sendTextToElement(By.xpath("//input[@id='customer.ssn']"), "12345");
        //* Enter Username
        driver.findElement(By.xpath("//input[@id='customer.username']")).clear();
        sendTextToElement(By.xpath("//input[@id='customer.username']"), "sawan123");
        //* Enter Password
        sendTextToElement(By.xpath("//input[@id='customer.password']"), "Desai456");
        //* Enter Confirm
        sendTextToElement(By.xpath("//input[@id='repeatedPassword']"), "Desai456");
        //* Click on REGISTER button
        clickOnElement(By.xpath("//tbody/tr[13]/td[2]/input[1]"));
        //* Verify the text 'Your account was created successfully. You are now logged in.’
        String vYourLogin = "Your account was created successfully. You are now logged in.";
        Assert.assertEquals(vYourLogin, getTextFromElement(By.xpath("//p[contains(text(),'Your account was created successfully. You are now')]")));
        clickOnElement(By.xpath("//a[contains(text(),'Log Out')]"));
    }
    @After
    public void tearDown(){closeBrowser();}


}
