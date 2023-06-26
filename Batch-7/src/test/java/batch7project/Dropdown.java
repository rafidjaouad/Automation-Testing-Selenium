package batch7project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		
		WebElement dropdown = driver.findElement(By.id("option"));
		Select selectobject = new Select(dropdown);
		
		selectobject.selectByIndex(1);
		Thread.sleep(500);
		selectobject.selectByValue("option 3");
		Thread.sleep(500);
		selectobject.selectByVisibleText("Option 2");
		Thread.sleep(500);

	}

}
