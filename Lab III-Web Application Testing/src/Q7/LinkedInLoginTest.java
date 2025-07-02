package Q7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LinkedInLoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        // Set the path to chromedriver.exe
        String driverPath = "C:\\chromedriver.exe"; // Update this path
        System.setProperty("webdriver.chrome.driver", driverPath);

        // Initialize ChromeDriver
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Implicit wait
    }

    @Test
    public void testLinkedInLogin() {
        // Navigate to LinkedIn login page
        driver.get("https://www.linkedin.com/login");

        // Retrieve LinkedIn username and password from environment variables
        String username = System.getenv("LINKEDIN_USERNAME");
        String password = System.getenv("LINKEDIN_PASSWORD");

        // Wait for the username field to be present
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement usernameField = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
        usernameField.sendKeys(username);

        // Find the password field and enter the password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);

        // Find the login button using a reliable XPath
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit' and contains(text(), 'Sign in')]")));
        loginButton.click();

        // Wait for the page to load after login
        wait.until(ExpectedConditions.urlToBe("https://www.linkedin.com/feed/"));

        // Get the current URL after login
        String currentUrl = driver.getCurrentUrl();

        // Expected URL after successful login
        String expectedUrl = "https://www.linkedin.com/feed/";

        // Verify if the current URL matches the expected URL
        Assert.assertEquals(currentUrl, expectedUrl, "Login failed! URL does not match.");

        // Print a success message
        System.out.println("Login successful! Current URL: " + currentUrl);
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}