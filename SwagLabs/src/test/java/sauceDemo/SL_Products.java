package sauceDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SL_Products {
public static void main(String[] args) throws Exception {
		
	System.setProperty("webdriver.chrome.driver", "E:\\XLR\\Selenium JARs\\chromedriver_win32\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	ChromeOptions chromeOptions = new ChromeOptions();
	WebDriver driver = new ChromeDriver(chromeOptions);
	driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		// Login Page
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement login=driver.findElement(By.id("login-button"));
		login.click();
		// Sauce Labs Backpack Product
		driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
		//Add to Cart Functionality 
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		// Remove from cart functionality 
		driver.findElement(By.id("remove-sauce-labs-backpack")).click();
		// Cart Symbol functionality
		WebElement cart=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		cart.click();
		// Checkout Button
		driver.findElement(By.id("checkout")).click();
		//checkout details
		driver.findElement(By.id("first-name")).sendKeys("FNAME");
		driver.findElement(By.id("last-name")).sendKeys("LNAME");
		driver.findElement(By.id("postal-code")).sendKeys("123456");
		driver.findElement(By.id("continue")).click();
		//Checkout Overview
		driver.findElement(By.id("finish")).click();
		// Back to Homepage
		driver.findElement(By.id("back-to-products")).click();
		
	}

}
