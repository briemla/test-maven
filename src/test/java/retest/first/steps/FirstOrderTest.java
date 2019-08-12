package retest.first.steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import de.retest.web.selenium.RecheckDriver;

public class FirstOrderTest {

	private RecheckDriver driver;

	@Before
	public void setup() {
		driver = new RecheckDriver(new ChromeDriver());
	}

	@Test
	public void check_order() throws Exception {
		driver.startTest();

		String url = this.getClass().getResource("formPage.html").toString();
		driver.get(url);

		driver.findElement(By.id("email")).sendKeys("Max");
		driver.findElement(By.id("age")).sendKeys("16");
		driver.findElement(By.name("login")).submit();

		driver.capTest();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
