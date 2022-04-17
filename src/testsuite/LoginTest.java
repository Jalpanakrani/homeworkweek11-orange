package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before
    public void setup() {
        openBrowser(baseUrl);
    }

    @Test
    public void verifyUserShouldLoginSuccessfullyWithValidCredentials() {


        //Enter valid username
        WebElement username = driver.findElement(By.id("txtUsername"));
        //sending field valid username'

        username.sendKeys("Admin");

        // Find the valid password field element
        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        //     Sending valid Password to password field element
        passwordField.sendKeys("admin123");


        //Find the login button and click on it
        WebElement loginButton = driver.findElement(By.className("button"));
        loginButton.click();

        //This is from requirement
        String expectedMessage = "Welcome Paul";

        //find the welcome back text element and get the text
        WebElement actualMessageElement = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/a[2]"));
        String actualMessage = actualMessageElement.getText();
        System.out.println(actualMessage);
        //validate actual and expected message
        Assert.assertEquals("Not navigate to login page", expectedMessage, actualMessage);

    }

    @After
    public void tearDown() {
        closeBrowser();
    }
}
