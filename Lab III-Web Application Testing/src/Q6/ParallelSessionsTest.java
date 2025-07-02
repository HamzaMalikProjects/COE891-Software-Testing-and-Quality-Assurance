package Q6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelSessionsTest {

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
    public void executSessionOne() {
        // Navigate to the website
        driver.get("http://demo.guru99.com/V4/");

        // Find the UserID field and fill it with "Driver 1"
        WebElement userIdField = driver.findElement(By.name("uid"));
        userIdField.sendKeys("Driver 1");

        System.out.println("Session One: UserID filled with 'Driver 1'");
    }

    @Test
    public void executSessionTwo() {
        // Navigate to the website
        driver.get("http://demo.guru99.com/V4/");

        // Find the UserID field and fill it with "Driver 2"
        WebElement userIdField = driver.findElement(By.name("uid"));
        userIdField.sendKeys("Driver 2");

        System.out.println("Session Two: UserID filled with 'Driver 2'");
    }

    @Test
    public void executSessionThree() {
        // Navigate to the website
        driver.get("http://demo.guru99.com/V4/");

        // Find the UserID field and fill it with "Driver 3"
        WebElement userIdField = driver.findElement(By.name("uid"));
        userIdField.sendKeys("Driver 3");

        System.out.println("Session Three: UserID filled with 'Driver 3'");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        driver.quit();
    }
}