package batch7project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.saucedemo.com/");
		//driver.navigate().to("https://www.saucedemo.com/v1/")
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Maximize the window
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		Thread.sleep(500);  //used for wait 0.5 seconds for clear visualization
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(500);
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(500);
		
		driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
		Thread.sleep(500);
		driver.findElement(By.className("shopping_cart_link")).click();
		Thread.sleep(500);
		driver.findElement(By.id("checkout")).click();
		Thread.sleep(500);
		driver.findElement(By.id("first-name")).sendKeys("Alex");
		Thread.sleep(500);
		driver.findElement(By.id("last-name")).sendKeys("Marcer");
		Thread.sleep(500);
		driver.findElement(By.id("postal-code")).sendKeys("2240");
		Thread.sleep(500);
		driver.findElement(By.id("continue")).click();
		Thread.sleep(500);
		driver.findElement(By.id("finish")).click();
		Thread.sleep(500);
		driver.findElement(By.id("back-to-products")).click();
		Thread.sleep(500);
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(500);
		driver.findElement(By.id("logout_sidebar_link")).click();
		
		
		
		
		Thread.sleep(3000);  //NOT suitable for use
		
		
		
		driver.close();
		//driver.quit();
		
	}

}
