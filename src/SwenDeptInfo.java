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
		baseUrl = "http://www.rit.edu"; // TARGET URL
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testSwenDeptInfo()throws Exception {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		//Goes to RIT website
		driver.get(baseUrl);
		//Click academics
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='main-nav--link--academics']")));
		driver.findElement(By.xpath("//*[@id='main-nav--link--academics']")).click();
		//click colleges

		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='block-rit-bootstrap-subtheme-rit-main-menu']/ul/li[2]/div/div/ul[1]/li[5]/a")));
		driver.findElement(By.xpath("//*[@id=\"block-rit-bootstrap-subtheme-rit-main-menu\"]/ul/li[2]/div/div/ul[1]/li[5]/a")).click();
		//click golisano
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='block-rit-bootstrap-subtheme-content']/div/div[3]/div[3]/div/div/div/div/div/div/div/div/ul/li[3]/a")));

		driver.findElement(By.xpath("//*[@id='block-rit-bootstrap-subtheme-content']/div/div[3]/div[3]/div/div/div/div/div/div/div/div/ul/li[3]/a")).click();
		//click contact
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='block-rit-bootstrap-subtheme-rit-main-menu']/ul/li[7]/a")));

		driver.findElement(By.xpath("//*[@id='block-rit-bootstrap-subtheme-rit-main-menu']/ul/li[7]/a")).click();

		//expand SE contact
		driver.findElement(By.xpath("//*[@id='card-header-4291']/h5/a")).click();

		//print the information
		System.out.println(driver.findElement(By.xpath("//*[@id='card-collapse-4291']/div/div/article/div/div[2]/div[1]/a")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"card-collapse-4291\"]/div/div/article/div/div[3]/div[1]/a")).getText());
		System.out.println(driver.findElement(By.xpath("///*[@id=\"card-collapse-4291\"]/div/div/article/div/div[2]/div[2]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"card-collapse-4291\"]/div/div/article/div/div[2]/div[3]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[@id=\"card-collapse-4291\"]/div/div/article/div/div[2]/div[4]"")).getText());


	}


	@After
	public void tearDown() throws Exception {
		//driver.quit();
		System.out.println();
	}

}
