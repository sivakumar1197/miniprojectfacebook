package Project.FacebookTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromelaunchTest {

	WebDriver driver;

	@Test(dataProvider = "in")
	public void mainTest(String username, String password) {

		ChromeOptions chrome = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(chrome);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
	}

	@DataProvider(name = "in")
	public Object[][] input() {
		Object in[][] = new Object[2][2];
		in[0][0] = "name";
		in[0][1] = "name@2245";

		in[1][0] = "nk";
		in[1][1] = "nk@356";
		return in;

	}

}
