package com.Admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;  
import org.testng.annotations.*;

public class AdminTest {
	
	public String baseUrl=("http://localhost:4200/products");
			
			String driverPath= ("C:\\Users\\Mrityunjay Thakur\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

			public WebDriver driver;

			
//			@SuppressWarnings("deprecation")
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
			public void adminlogin() {
				System.out.println("Launching Chrome Browser");
				 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
				 
				 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/app-login-status[1]/div[1]/button[1]")).click(); 

				 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-login[1]/div[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("admin");
				 driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-login[1]/div[1]/form[1]/div[1]/div[2]/input[1]")).sendKeys("admin");

				  //Login Button
				 WebElement element=driver.findElement(By.cssSelector("div.page-wrapper:nth-child(1) div.page-container div.login-form:nth-child(3) form.ng-dirty.ng-touched.ng-valid div:nth-child(2) div.form-group:nth-child(5) > button.btn.btn-primary.btn-block"));
				 element.click();
				 element.click();
		 }
//			@SuppressWarnings("deprecation")
//			@Test(priority=1)
//			public void addProduct() {
//				System.out.println("Add Products");
//				//Click AddProduct Button
//				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/aside[1]/app-product-category-menu[1]/div[1]/nav[1]/ul[1]/li[8]/button[1]")).click();
//				//Add new Product info
//				//Name
//				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-add-product[1]/div[1]/form[1]/div[1]/input[1]")).sendKeys("chana masala");
//				//Description
//				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-add-product[1]/div[1]/form[1]/div[2]/input[1]")).sendKeys("These spice blends are very similar and make great substitutes for one another when necessary");
//				//Price
//				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-add-product[1]/div[1]/form[1]/div[3]/input[1]")).sendKeys("50");
//				//Image Url
//				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-add-product[1]/div[1]/form[1]/div[4]/input[1]")).sendKeys("https://t4.ftcdn.net/jpg/02/97/69/65/360_F_297696576_s8k3pGepliFhN2oILIzLUAkQuukKalDI.jpg");
//				//Cuisine
//				WebElement testdropdown = driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-add-product[1]/div[1]/form[1]/div[5]/select[1]"));  
//				Select dropdown = new Select(testdropdown);  
//				dropdown.selectByIndex(3);  
//				
//      			//Click on add button
//     			driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-add-product[1]/div[1]/form[1]/div[6]/button[1]")).click();
//				
//			}
			@SuppressWarnings("deprecation")
			@Test(priority=1)
			public void serachProduct() {
				 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
				//SearchProduct
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/app-search[1]/div[1]/input[1]")).sendKeys("Moutabal");
				//click on search button
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/app-search[1]/div[1]/button[1]")).click();
				
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/app-search[1]/div[1]/input[1]")).clear();
		
				
			}
			@SuppressWarnings("deprecation")
			@Test(priority=2)
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
			
			@SuppressWarnings("deprecation")
			@Test(priority=2)
			public void logout() {
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
				
				driver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/div[1]/div[1]/header[1]/div[1]/div[1]/div[1]/app-login-status[1]/div[1]/button[1]")).click();
				
				
				
			}
			
			
			
			


}
