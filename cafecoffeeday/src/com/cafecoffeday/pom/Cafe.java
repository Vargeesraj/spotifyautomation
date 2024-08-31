package com.cafecoffeday.pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Cafe {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.cafecoffeeday.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 WebElement ele = driver.findElement(By.xpath("//a[@class=\"login-bts\"]"));
		 int yaxis = ele.getLocation().getY();
		 Actions a = new Actions(driver);
		 a.scrollToElement(ele).perform();
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("window.scrollTo(0,"+yaxis+")");
		 ele.click();
		 driver.findElement(By.id("userData")).sendKeys("vargeesraj27@gmail.com");
		 driver.findElement(By.id("userpass")).sendKeys("372cs13057");
	//driver.findElement(By.xpath("//span[contains(@class,'log-state')]")).click();
}
}
