package Tests;
	
import java.util.Optional;
import java.lang.*;
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.*;
import org.openqa.selenium.devtools.v97.network.Network;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;


public class Test1 {		

    private ChromeDriver driver;		
    private DevTools devTools;
    
	@Test				
	public void testEasy() {	
		System.out.println("Starting url test.");
		driver.get("http://demo.guru99.com/test/guru99home/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Demo Guru99 Page")); 		
	}	
	@BeforeTest
	public void beforeTest() {	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\oran-\\eclipse-workspace\\chromedriver.exe");
//		devTools = driver.getDevTools();
//		devTools.createSession();
		String s = "";
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();		
		System.out.println();
	}		
}	