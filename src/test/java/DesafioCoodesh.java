

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DesafioCoodesh {

	ChromeDriver driver;

	@Before
	public void setUp() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://beta.coodesh.com/");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void test_usuario_cadastrado() {
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		driver.findElement(By.xpath("//*[@id=\"header-nav-bar\"]//button")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/form/div[3]/div/div[3]//a")).click();
		driver.findElement(By.id("displayName")).sendKeys("André Marcos Vinicius Vieira");
		driver.findElement(By.id("email")).sendKeys("cheroxmillert@hotmail.com");
		driver.findElement(By.id("password")).sendKeys("T3rgui@S");

		WebElement element = driver.findElement(By.id("privacy.gpdr"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);

		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/form//button")).click();
	}

	@Test

	public void test_usuario_novo() {
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		driver.findElement(By.xpath("//*[@id=\"header-nav-bar\"]//button")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/form/div[3]/div/div[3]//a")).click();
		driver.findElement(By.id("displayName")).sendKeys("Isis Alice Clarice Teixeira");
		driver.findElement(By.id("email")).sendKeys("isis_teixeira@endoimplantes.com.br");
		driver.findElement(By.id("password")).sendKeys("T3rgui@S");

		WebElement element = driver.findElement(By.id("privacy.gpdr"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);

		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[2]/form//button")).click();

	}

}
