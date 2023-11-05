package sauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CallPOM_Find {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\XLR\\Selenium JARs\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		POM_Find pom=PageFactory.initElements(driver, POM_Find.class);
		pom.username.isDisplayed();
		pom.username.isEnabled();
		pom.username.sendKeys("standard_user");
		pom.password.isDisplayed();
		pom.password.isEnabled();
		pom.password.sendKeys("secret_sauce");
		pom.login.isDisplayed();
		pom.login.isEnabled();
		pom.login.sendKeys("login-button");
		pom.login.click();

	}
}
