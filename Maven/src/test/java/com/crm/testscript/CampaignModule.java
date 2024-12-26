package com.crm.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CampaignModule {
	@Test
	public void createCampaign() {
//	System.setProperty("webdriver.chrome.driver", "Path of driver executable");
//	WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	driver.get("http://192.168.61.129:8080/crm/HomePage.do");
//	driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
//	driver.findElement(By.id("passWord")).sendKeys("123456"+Keys.ENTER);
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	System.out.println("The title of the webpage is: "+driver.getTitle());
	driver.quit();
	Reporter.log("createCampaign",true);
	}
}