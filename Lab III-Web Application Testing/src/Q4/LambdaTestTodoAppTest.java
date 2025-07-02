package Q4;

import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LambdaTestTodoAppTest {

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
    public void testTodoApp() {
        // Navigate to the LambdaTest Todo App website
        String baseUrl = "https://lambdatest.github.io/sample-todo-app/";
        driver.get(baseUrl);

        // Find and check "Second Item"
        WebElement secondItem = driver.findElement(By.name("li2"));
        secondItem.click();

        // Find and check "Fourth Item"
        WebElement fourthItem = driver.findElement(By.name("li4"));
        fourthItem.click();

        // Find the blank input field, clear it, and add a name
        WebElement inputField = driver.findElement(By.id("sampletodotext"));
        inputField.clear();
        inputField.sendKeys("John Doe");

        // Submit the form
        WebElement addButton = driver.findElement(By.id("addbutton"));
        addButton.click();

        // Print a success message
        System.out.println("Items checked and name added successfully!");
    }

    @AfterMethod
    public void tearDown() {
        // Close the browser
        driver.close();
    }
}