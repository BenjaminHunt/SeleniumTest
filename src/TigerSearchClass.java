import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TigerSearchClass {

	 private WebDriver driver;
	 private String baseUrl;
	 
	 @Before
	  public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver"); // can be replaced with Firefox driver
	    driver = new ChromeDriver(); // can be replaced with Firefox
	    baseUrl = ""; // TARGET URL
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testPart1Class1() throws Exception {
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	  }

}
