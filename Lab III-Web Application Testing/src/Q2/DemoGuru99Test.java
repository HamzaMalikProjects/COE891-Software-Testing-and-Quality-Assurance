package Q2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoGuru99Test {

    @Test
    public void verifyHomepageTitle() {
        // Set the path to chromedriver.exe
    	String driverPath = "/home/student2/hemalik/Desktop/chromedriver"; // Update this path
        System.setProperty("webdriver.chrome.driver", driverPath);

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the website
        String baseUrl = "http://demo.guru99.com/test/newtours/";
        driver.get(baseUrl);

        // Retrieve the title of the web page
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title of the Page: " + actualTitle);

        // Expected title
        String expectedTitle = "Welcome: Mercury Tours";

        // Assert that the actual title matches the expected title
        Assert.assertEquals(actualTitle, expectedTitle, "Title does not match the expected value!");

        // Close the browser
        driver.close();
    }
}
