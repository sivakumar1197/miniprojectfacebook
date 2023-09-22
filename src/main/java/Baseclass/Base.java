package Baseclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {
	public static WebDriver driver;
	public static Actions ac;

	public static WebDriver LaunchBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\lenovo\\eclipse-workspace\\Facebook\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\lenovo\\eclipse-workspace\\Facebook\\chrome\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		return driver;
	}

	public static void getURL(String URL) {
		driver.get(URL);

	}

	public static void Inputvalue(WebElement element, String path) {
		ac = new Actions(driver);
		ac.sendKeys(element, path).build().perform();

	}

	public static void clickAction(WebElement element) {
		ac = new Actions(driver);
		ac.click(element).build().perform();

	}

	public static void navigatBackclass() {
		driver.navigate().back();

	}

	public static void Implicitwait(int a, TimeUnit value) {
		driver.manage().timeouts().implicitlyWait(a, value);

	}

	public static void Dropdown(WebElement element, Object value) {
		Select s = new Select(element);

		if (value.equals(value)) {
			s.selectByVisibleText((String) value);
		}
	}
	public static void close() {
		driver.close();
	}
	

}
