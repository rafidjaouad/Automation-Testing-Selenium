package batch7project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radioButton {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("fname")).sendKeys("ABC");
		Thread.sleep(500);  //used for wait 0.5 seconds for clear visualization
		driver.findElement(By.id("lname")).sendKeys("XYZ");
		Thread.sleep(500);
		
		WebElement radiobutton = driver.findElement(By.id("female"));
		radiobutton.click();
		
		//This is used for the radio button is clicked or not
		radiobutton.isDisplayed();                      
		System.out.println("isdisplayed");
		System.out.println(radiobutton.isDisplayed());
		radiobutton.isEnabled();
		System.out.println("isEnabled");
		System.out.println(radiobutton.isEnabled());
		radiobutton.isSelected();
		System.out.println("isSelected");
		System.out.println(radiobutton.isSelected());
		
		
		Thread.sleep(500);
		driver.findElement(By.id("male")).click();
		Thread.sleep(500);
		driver.findElement(By.id("other")).click();
		Thread.sleep(500);
		
		driver.close();

	}

}
