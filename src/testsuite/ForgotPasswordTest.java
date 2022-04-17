package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {
    String baseUrl ="https://opensource-demo.orangehrmlive.com/";
    @Before
    public void setup(){
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldNavigateToForgotPasswordpageSuccessfully() {
        // click on forgot your password
        WebElement forgotpasswordButton = driver.findElement(By.id("btnLogin"));
        forgotpasswordButton.click();
        //This is from requirement
        String expectedMessage = "Forgot your password?";

        //find the welcome back text element and get the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/form[1]/div[5]/div[1]/a[1]"));
        String actualMessage = actualMessageElement.getText();
        System.out.println(actualMessage);
    }
        @After
        public void tearDown(){
            closeBrowser();
        }
    }

