package org.dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hi\\workspace\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(5000);
		WebElement day = driver.findElement(By.id("day"));
		Select s=new Select(day);
		List<WebElement> alloptions = s.getOptions();
		for (int i = 0; i < alloptions.size(); i++) {
			if (i%2==0) {
//				WebElement eachopt = alloptions.get(i);
//				System.out.println(eachopt.getText());
				System.out.println(i);
			}
		}
	}
}