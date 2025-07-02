package Q3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FacebookEmailTagNameTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set the path to chromedriver.exe
        String driverPath = "C:\\chromedriver.exe"; // Update this path
        System.setProperty("webdriver.chrome.driver", driverPath);

        // Initialize ChromeDriver
        driver = new ChromeDriver();
    }

    @Test
    public void testEmailTextFieldTagName() {
        // Navigate to the Facebook website
        String baseUrl = "http://www.facebook.com";
        driver.get(baseUrl);

        // Locate the email text field element using its name attribute
        WebElement emailTextField = driver.findElement(By.name("email"));

        // Retrieve the tag name of the email text field
        String tagName = emailTextField.getTagName();

        // Print the tag name to the output
        System.out.println("Tag Name of the Email Text Field: " + tagName);
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        driver.close();
    }
}