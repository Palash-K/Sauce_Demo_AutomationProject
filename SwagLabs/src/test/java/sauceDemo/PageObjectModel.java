package sauceDemo;

import org.openqa.selenium.By;

public class PageObjectModel {

	By username=By.id("user-name");
	By password=By.id("password");
	By login=By.id("login-button");
	By backpack=By.xpath("//*[@id=\\\"item_4_title_link\\\"]/div");
	By addcart=By.id("add-to-cart-sauce-labs-backpack");
	By cartsymbol=By.cssSelector("#shopping_cart_container > a");
	By checkout=By.id("checkout");
	By firstname=By.id("first-name");
	By lastname=By.id("last-name");
	By code=By.id("postal-code");
	By cont=By.id("continue");
	By finish=By.id("finish");
	By backhome=By.id("back-to-products");
}
