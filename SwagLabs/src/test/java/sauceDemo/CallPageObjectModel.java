package sauceDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CallPageObjectModel {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "E:\\XLR\\Selenium JARs\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriver driver = new ChromeDriver(chromeOptions);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		// importing PageObjectModel class by creating object
		PageObjectModel pom = new PageObjectModel();
		driver.findElement(pom.username).sendKeys("standard_user");
		driver.findElement(pom.password).sendKeys("secret_sauce");
		driver.findElement(pom.login).click();

	}
}
