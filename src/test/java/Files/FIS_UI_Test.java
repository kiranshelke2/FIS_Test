package Files;

import static org.testng.Assert.assertTrue;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class FIS_UI_Test {
	public WebDriver driver;

	    @Test
	    public void setUp() throws InterruptedException {
	        // Set the path for ChromeDriver (ensure the ChromeDriver is downloaded and the path is set correctly)
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

	        // Initialize the Chrome WebDriver
	        WebDriverManager.chromedriver().setup();
	        //1.1 Open Browser 
	    	driver = new ChromeDriver();
	    	//1.2 Navigate to ebay.com
	    	driver.get("https://www.ebay.com/");
	    	driver.manage().window().maximize();
	    	//1.3 	Search for ‘book’
	    	
	    	WebElement searchBox = driver.findElement(By.id("gh-ac"));
	        searchBox.sendKeys("book");
	        searchBox.submit(); 
	        //1.4.	Click on the first book in the list
	        List<WebElement> Listof_Books = driver.findElements(By.xpath("//span[@role='heading']"));
	     //  Listof_Books.forEach(System.out::print);
	        for(WebElement book : Listof_Books) {
	        	System.out.println(book.getText());
	        }
	        
	        WebElement firstBook = driver.findElement(By.xpath("//span[contains(text(),'Before RedNote, Original Little Red Book: QUOTATIO')]"));
	        firstBook.click();
	        driver.manage().window().maximize();
	        synchronized (searchBox) {
	        	try {
	        		searchBox.wait(5000);
	        	} catch (InterruptedException e) {
        		e.printStackTrace();
	        	}
	        }
	        //1.5	In the item listing page, click on ‘Add to cart’
	       // driver.wait(5000);
	      driver.findElement(By.xpath("//input[@id='qtyTextBox']")).click();
	       // driver.wait(5000);
	       // driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]")).sendKeys(Keys.PAGE_DOWN);
	      
	        WebElement addToCartButton = driver.findElement(By.xpath("//span[contains(text(),'Add to cart')]"));
	        
	        addToCartButton.click();
	        //1.6
	        WebElement cartIcon = driver.findElement(By.xpath("//span[@role='img'][normalize-space()='1']"));
	        String cartCount = cartIcon.getText();
	     // 1.76. Verify that the cart has at least 1 item
	        assertTrue(cartCount.contains("1"), "The cart should contain 1 item.");
	    	               
	    }
	   
}
