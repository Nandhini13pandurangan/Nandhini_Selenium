package org.test.Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

		public static void main(String[] args) {

			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Rajadurai.R-PC\\elipse-Nandhini\\selenium\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();

			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");

			JavascriptExecutor js = (JavascriptExecutor) driver;

			WebElement name = driver.findElement(By.id("email"));

			js.executeScript("arguments[0].setAttribute('value','hello')", name);

			WebElement pass = driver.findElement(By.id("pass"));

			js.executeScript("arguments[0].setAttribute('value','hai')", pass);

			WebElement btnSignin = driver.findElement(By.xpath("//input[@value='sign in']"));
			btnSignin.click();

			driver.quit();
		}

	}