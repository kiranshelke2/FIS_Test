import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FIS_UI_Test {
	public WebDriver driver;

	    @BeforeTest
	    public void setUp() {
	        // Set the path for ChromeDriver (ensure the ChromeDriver is downloaded and the path is set correctly)
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize the Chrome WebDriver
	        driver = new ChromeDriver();
	    }
}
