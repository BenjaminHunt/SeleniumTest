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

public class TigerSearchClass{

	private WebDriver driver;
	private String baseUrl;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver"); // can be replaced with Firefox driver
		driver = new ChromeDriver(); // can be replaced with Firefox
		baseUrl = "https://tigercenter.rit.edu"; // TARGET URL
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testSwen_352() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//Goes to Tiger Center Landing Page
		driver.get(baseUrl + "/tigerCenterApp/landing");
		//Clicks the Search Class Button
		driver.findElement(By.xpath("//div[@id='angularApp']/app-root/div[2]/mat-sidenav-container[2]/mat-sidenav-content/div[2]/landing-page/div/div/div/div/div[4]/a/div")).click();
		//Selects the Spring 2020 Term from the term options
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='termSelector']")));
		new Select (driver.findElement(By.xpath("//select[@name='termSelector']"))).selectByVisibleText("2019-20 Spring (2195)");

		//Input class name SWEN-352
		driver.findElement(By.xpath("//input[@name='']")).clear();
		driver.findElement(By.xpath("//input[@name='']")).sendKeys("SWEN-352");
		//Submit
		driver.findElement(By.xpath("//input[@name='']")).sendKeys(Keys.ENTER);

		//Print out the class name
		System.out.println(driver.findElement(By.xpath("//div[@id='classSearchContainer']/div[2]/div[4]/div[5]/app-class-search-row/div/div/div/div/p/span")).getText());


		//Wait for table
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("app-class-search-row")));

		//get table elements
		List<WebElement> myElements = driver.findElements(By.cssSelector("app-class-search-row"));

		//Print relevent values
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

	@Test
	public void testSwen_261() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//Goes to Tiger Center Landing Page
		driver.get(baseUrl + "/tigerCenterApp/landing");
		//Clicks the Search Class Button
		driver.findElement(By.xpath("//div[@id='angularApp']/app-root/div[2]/mat-sidenav-container[2]/mat-sidenav-content/div[2]/landing-page/div/div/div/div/div[4]/a/div")).click();
		//Selects the Spring 2020 Term from the term options
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='termSelector']")));

		new Select (driver.findElement(By.xpath("//select[@name='termSelector']"))).selectByVisibleText("2019-20 Spring (2195)");

		//Input class name SWEN-261
		driver.findElement(By.xpath("//input[@name='']")).clear();
		driver.findElement(By.xpath("//input[@name='']")).sendKeys("SWEN-261");
		//Submit
		driver.findElement(By.xpath("//input[@name='']")).sendKeys(Keys.ENTER);
		//Print out the class name
		System.out.println(driver.findElement(By.xpath("//div[@id='classSearchContainer']/div[2]/div[4]/div[5]/app-class-search-row/div/div/div/div/p/span")).getText());


		//Wait for table
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("app-class-search-row")));

		//get table elements
		List<WebElement> myElements = driver.findElements(By.cssSelector("app-class-search-row"));

		//Print relevent values
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

	@Test
	public void testSwen_343() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//Goes to Tiger Center Landing Page
		driver.get(baseUrl + "/tigerCenterApp/landing");
		//Clicks the Search Class Button
		driver.findElement(By.xpath("//div[@id='angularApp']/app-root/div[2]/mat-sidenav-container[2]/mat-sidenav-content/div[2]/landing-page/div/div/div/div/div[4]/a/div")).click();
		//Selects the Spring 2020 Term from the term options
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='termSelector']")));

		new Select (driver.findElement(By.xpath("//select[@name='termSelector']"))).selectByVisibleText("2019-20 Spring (2195)");

		//Input class name SWEN-343
		driver.findElement(By.xpath("//input[@name='']")).clear();
		driver.findElement(By.xpath("//input[@name='']")).sendKeys("SWEN-343");
		//Submit
		driver.findElement(By.xpath("//input[@name='']")).sendKeys(Keys.ENTER);

		//Print out the class name
		System.out.println(driver.findElement(By.xpath("//div[@id='classSearchContainer']/div[2]/div[4]/div[5]/app-class-search-row/div/div/div/div/p/span")).getText());


		//Wait for table
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("app-class-search-row")));

		//get table elements
		List<WebElement> myElements = driver.findElements(By.cssSelector("app-class-search-row"));

		//Print relevent values
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

	@Test
	public void testSwen_262() throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//Goes to Tiger Center Landing Page
		driver.get(baseUrl + "/tigerCenterApp/landing");
		//Clicks the Search Class Button
		driver.findElement(By.xpath("//div[@id='angularApp']/app-root/div[2]/mat-sidenav-container[2]/mat-sidenav-content/div[2]/landing-page/div/div/div/div/div[4]/a/div")).click();
		//Selects the Spring 2020 Term from the term options
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='termSelector']")));

		new Select (driver.findElement(By.xpath("//select[@name='termSelector']"))).selectByVisibleText("2019-20 Spring (2195)");

		//Input class name SWEN-262
		driver.findElement(By.xpath("//input[@name='']")).clear();
		driver.findElement(By.xpath("//input[@name='']")).sendKeys("SWEN-262");
		//submit
		driver.findElement(By.xpath("//input[@name='']")).sendKeys(Keys.ENTER);
		//Print out the class name
		System.out.println(driver.findElement(By.xpath("//div[@id='classSearchContainer']/div[2]/div[4]/div[5]/app-class-search-row/div/div/div/div/p/span")).getText());

		//Wait for table
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("app-class-search-row")));

		//get table elements
		List<WebElement> myElements = driver.findElements(By.cssSelector("app-class-search-row"));

		//Print relevent values
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
		driver.quit();
	}

}
