package Q5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class GoogleSearchTestWithAnnotations {

    WebDriver driver;

    @BeforeClass
    public void openBrowser() {
        // Set the path to chromedriver.exe
        String driverPath = "C:\\chromedriver.exe"; // Update this path
        System.setProperty("webdriver.chrome.driver", driverPath);

        // Initialize ChromeDriver
        driver = new ChromeDriver();
        System.out.println("Browser opened successfully.");
    }

    @Test
    public void launchGoogle() {
        // Navigate to Google
        driver.get("http://www.google.com");
        System.out.println("Google launched successfully.");
    }

    @Test(dependsOnMethods = "launchGoogle")
    public void performSearchAndClick1stLink() throws InterruptedException {
        // Wait for the search box to be present
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement searchBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));

        // Enter "Facebook" in the search box
        searchBox.sendKeys("Facebook");
        searchBox.submit();

        // Wait for the results to load
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h3")));

        // Add a delay to allow manual CAPTCHA solving
        System.out.println("Please solve the CAPTCHA manually within 25 seconds...");
        Thread.sleep(15000); // 25 seconds delay

        // Click the first search result
        WebElement firstResult = driver.findElement(By.xpath("(//h3)[1]"));
        firstResult.click();

        System.out.println("Search performed and first link clicked.");
    }

    @Test(dependsOnMethods = "performSearchAndClick1stLink")
    public void faceBookPageTitleVerification() throws InterruptedException {
        // Wait for the page to load
        Thread.sleep(2000);

        // Verify the title of the page
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);
        Assert.assertTrue(actualTitle.contains("Facebook"), "Title verification failed! Actual title: " + actualTitle);

        System.out.println("Title verified successfully: " + actualTitle);
    }

    @AfterClass
    public void driverExit() {
        // Close the browser
        driver.quit();
        System.out.println("Browser closed successfully.");
    }
}