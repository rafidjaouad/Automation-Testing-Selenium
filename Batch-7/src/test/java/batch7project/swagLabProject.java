package batch7project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class swagLabProject {

	public static void main(String[] args) {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//Sign up
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		driver.findElement(By.id("input-firstname")).sendKeys("Alex");
		driver.findElement(By.id("input-lastname")).sendKeys("Marcer");
		driver.findElement(By.id("input-email")).sendKeys("apexpredator@outlook.com");
		driver.findElement(By.id("input-password")).sendKeys("##110099ApEx");
		
		driver.findElement(By.id("input-newsletter-yes")).click();
		driver.findElement(By.xpath("//input[@name='agree']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//Log in
		driver.findElement(By.xpath("//a[@class='list-group-item'][normalize-space()='Login']")).click();
		driver.findElement(By.id("input-email")).sendKeys("apexpredator@outlook.com");
		driver.findElement(By.id("input-password")).sendKeys("##110099ApEx");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		
		//driver.findElement(By.id("login-button")).click();
		//driver.findElement(By.id("")).sendKeys("");
		//driver.findElement(By.xpath("")).sendKeys("");

	}

}
