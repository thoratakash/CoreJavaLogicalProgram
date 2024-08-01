package com.logical.array;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Rediff {

	@Test
	public void register() {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com/");

		driver.findElement(By.xpath("//a[text()='Create Account']")).click();

		driver.findElement(By.xpath("//input[starts-with(@name,'name')]")).sendKeys("Akash");

		driver.findElement(By.xpath("//input[starts-with(@name,'login')]")).sendKeys("akasht358");

		driver.findElement(By.xpath("//input[starts-with(@name,'btn')]")).click();

		List<WebElement> radioBtnsList = driver.findElements(By.xpath("//input[contains(@value,'akasht358')]"));

		//First Method
		int count = 0;
		for (WebElement radiobtn : radioBtnsList) {
			count++;
			if (count >= 2) {
				radiobtn.click();
				break;
			}
		}

		//Second Method
		/*
		  int count=0; 
		 for(int i=0;i<radioBtnsList.size();i++) { 
		 WebElement radioBtnVal=radioBtnsList.get(i); 
		 count++; 
		 if(count>2) {
		  radioBtnVal.click(); break; 
		  }  */
		 
	}

//}

}// class
