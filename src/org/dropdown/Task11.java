package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
		WebElement userId = driver.findElement(By.id("username"));
		userId.sendKeys("sowntharya");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("sss*123");
		driver.findElement(By.id("login")).click();
		Thread.sleep(5000);
		
		WebElement adultRoom = driver.findElement(By.id("adult_room"));
		Select s=new Select(adultRoom);
		List<WebElement> options = s.getOptions();
		int size = options.size();
		System.out.println(size);
	
	
}
}