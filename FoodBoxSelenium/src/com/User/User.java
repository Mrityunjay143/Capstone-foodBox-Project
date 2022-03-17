package com.User;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class User {
	
	public String baseUrl=("http://localhost:4200/products");
	
	String driverPath= ("C:\\Users\\Mrityunjay Thakur\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

	public WebDriver driver;

	
//	@SuppressWarnings("deprecation")
	@BeforeTest
	public void launchBrowser() {
		System.out.println("Launching Chrome Browser");
	    System.setProperty("webdriver.chrome.driver", driverPath);
	    driver=new ChromeDriver(); 
	    driver.get(baseUrl);
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@SuppressWarnings("deprecation")
	@Test(priority=0)
	public void userRegistration() {
		System.out.println("Launching Chrome Browser");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
		  //click on Login Button
		 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/app-login-status[1]/div[1]/button[1]")).click();
		//create an account
		 driver.findElement(By.xpath("//a[contains(text(),'Create an Account')]")).click();
		 //username
		 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-register[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("Jhon");
		 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-register[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("jhon@gmail.com");
		 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-register[1]/div[1]/form[1]/div[3]/input[1]")).sendKeys("Jhon@123");
		 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-register[1]/div[1]/form[1]/div[4]/input[1]")).sendKeys("9301509048");
		 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-register[1]/div[1]/form[1]/div[5]/input[1]")).sendKeys("Bangalore");
		 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-register[1]/div[1]/form[1]/div[6]/input[1]")).sendKeys("Yalhanka");
		 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-register[1]/div[1]/form[1]/div[7]/input[1]")).sendKeys("560064");
		 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-register[1]/div[1]/form[1]/div[8]/button[1]")).click();
	}
	
	@SuppressWarnings("deprecation")
	@Test(priority=1)
	public void userLogin() throws InterruptedException {
		
		System.out.println("Launching Chrome Browser");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		 
	//	 WebElement element= driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/app-login-status[1]/div[1]/button[1]")).click();
		 WebElement element = driver.findElement(By.cssSelector("div.page-wrapper:nth-child(1) div.page-container header.header-desktop:nth-child(1) div.section-content.section-content-p30 div.container-fluid div.header-wrap app-login-status:nth-child(3) div.form-header > button.au-btn-submit.login"));
		 element.click();
		 element.click();
//		 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/app-login-status[1]/div[1]/button[1]")).click();

		 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-login[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("2");
		  driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-login[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys("2");
		  WebElement element1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-login[1]/div[1]/form[1]/div[1]/div[3]/button[1]"));
		  element1.click();
		  Thread.sleep(2000);
		  element1.click();
		  element1.click();
		
	}
	@SuppressWarnings("deprecation")
	@Test(priority=2,description="all product")
	public void allProduct() {
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		//For All Product
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/aside[1]/app-product-category-menu[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]")).click();
		//Shorting by name
		WebElement testdropdown = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-product-list[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/select[1]"));  
		Select dropdown = new Select(testdropdown);  
		dropdown.selectByIndex(0); 
		
		//Shorting by firstcreated
		WebElement testdropdown1 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-product-list[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/select[1]"));  
		Select dropdown1 = new Select(testdropdown1);  
		dropdown1.selectByIndex(1);
		
		//Shorting by Lastcreated
		WebElement testdropdown2 = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-product-list[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[2]/select[1]"));  
		Select dropdown2 = new Select(testdropdown2);  
		dropdown2.selectByIndex(2);
		
		//For All Arab Arab
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/aside[1]/app-product-category-menu[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]")).click();
		//For All chinese product
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/aside[1]/app-product-category-menu[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]")).click();
		//For All Arab Presian
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/aside[1]/app-product-category-menu[1]/div[1]/nav[1]/ul[1]/li[5]/a[1]")).click();
		//For All Arab Indian
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/aside[1]/app-product-category-menu[1]/div[1]/nav[1]/ul[1]/li[6]/a[1]")).click();
		//For All Arab Italian
		driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/aside[1]/app-product-category-menu[1]/div[1]/nav[1]/ul[1]/li[7]/a[1]")).click();
		
	}
	
	
		 
		 
		 


 

}
