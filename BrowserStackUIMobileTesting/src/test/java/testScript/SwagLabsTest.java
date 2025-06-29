package testScript;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SwagLabsTest {
	WebDriver driver;
	ChromeOptions options;

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com/v1/index.html");
	}

	@BeforeMethod
	public void login() {
		// WebElement of Username ,password and loginbtin
		WebElement username = driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.id("login-button"));

		// providing action to Username ,password and loginbtin
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		loginBtn.click();

	}

	@Test
	public void testAddItemsAndCheckout() {

		// Collecting all itemps in list and adding first two item in cart
		List<WebElement> allItems = driver.findElements(By.xpath("//*[@class=\"inventory_list\"]//button"));
		for (int i = 0; i < 2; i++) {
			allItems.get(i).click();
		}

		// click on cart
		WebElement shoppingCart = driver.findElement(By.id("shopping_cart_container"));
		shoppingCart.click();

		// click on checkout
		WebElement checkout = driver.findElement(By.cssSelector("a.checkout_button"));
		checkout.click();

		// Enter First Name
		WebElement firstName = driver.findElement(By.id("first-name"));
		firstName.sendKeys("Chayan");

		// Enter Last Name
		WebElement lastName = driver.findElement(By.id("last-name"));
		lastName.sendKeys("Roy");

		// Enter Pin Code
		WebElement zipCode = driver.findElement(By.id("postal-code"));
		zipCode.sendKeys("128799");

		// Click on continue Button
		WebElement continuebtn = driver.findElement(By.cssSelector(".cart_button"));
		continuebtn.click();

		// Click on finish
		WebElement finish = driver.findElement(By.linkText("FINISH"));
		finish.click();

		// Validate expected vs Actual
		String ActualResult = driver.findElement(By.xpath("//*[@id=\"checkout_complete_container\"]//h2")).getText();
		String ExpectedResult = "THANK YOU FOR YOUR ORDER";
		Assert.assertEquals(ActualResult, ExpectedResult);

	}

	@AfterMethod
	public void logout() {

		// Click on hamburger menu
		WebElement hamBurger = driver.findElement(By.className("bm-burger-button"));
		hamBurger.click();

		// Click on logout
		driver.findElement(By.linkText("Logout")).click();

	}

	@AfterTest
	public void teardown() {
		// close the browser
		driver.close();

	}

}


