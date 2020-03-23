import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SwenDeptInfo{

	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver"); // can be replaced with Firefox driver
		driver = new ChromeDriver(); // can be replaced with Firefox
		baseUrl = "https://www.rit.edu"; // TARGET URL
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testSwen_352() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//Goes to RIT website
		driver.get(baseUrl);
		
		//Clicks the Academics nav bar
		driver.findElement(By.id("main-nav--link--academics")).click();
		
		//Waits for nav options to be visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"block-rit-bootstrap-subtheme-rit-main-menu\"]/ul/li[2]/div")));
		
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));
		//driver.findElement(By.xpath("")).click();
		
		//Clicks "Colleges"
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\\\"block-rit-bootstrap-subtheme-rit-main-menu\\\"]/ul/li[2]/div/div/ul[1]/li[5]/a")));
		driver.findElement(By.xpath("//*[@id=\"block-rit-bootstrap-subtheme-rit-main-menu\"]/ul/li[2]/div/div/ul[1]/li[5]/a")).click();
		
		//Clicks to Golisano Page
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"block-rit-bootstrap-subtheme-content\"]/div/div[3]/div[3]/div/div/div/div/div/div/div/div/ul/li[3]/a")));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"block-rit-bootstrap-subtheme-content\"]/div/div[3]/div[3]/div/div/div/div/div/div/div/div/ul/li[3]/a")));
		driver.findElement(By.xpath("//*[@id=\"block-rit-bootstrap-subtheme-content\"]/div/div[3]/div[3]/div/div/div/div/div/div/div/div/ul/li[3]/a")).click();
		
		//Clicks to contact button
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"block-rit-bootstrap-subtheme-rit-main-menu\"]/ul/li[7]/a")));
		driver.findElement(By.xpath("//*[@id=\"block-rit-bootstrap-subtheme-rit-main-menu\"]/ul/li[7]/a")).click();
		
		//CLicks SE Department tab
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("\"//*[@id=\\\"card-header-4291\\\"]/h5/a\"")));
		driver.findElement(By.xpath("\"//*[@id=\\\"card-header-4291\\\"]/h5/a\"")).click();
		
		//Wait for dropdown to be visible
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"card-collapse-4291\"]/div/div/article")));
		
		
		
		
		//TODO: Extract data and print to console, remove code below

		
		
		
		//get result(s)
		List<WebElement> myElements = driver.findElements(By.cssSelector("field-content row pb-4 px-3 mb-4 border-bottom border-neutral-cool-gray"));

		//Print relevant values
		for (WebElement e : myElements) {
			System.out.println();
			String a = e.getText();
			String[] array = a.split("\n");
			String[] line = Arrays.copyOfRange(array,7,11);
			for (String answer : line ) {
				System.out.print(answer + " ");
			}
		}
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
		System.out.println();
	}

}
