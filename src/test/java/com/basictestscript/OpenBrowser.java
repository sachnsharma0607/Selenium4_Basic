package com.basictestscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class OpenBrowser extends constants{
	
	
	
	
	
	@Test
	public void browser_chrome()
	{
		URL="https://www.includehelp.com/mcq/selenium-mcqs.aspx";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.close();
	}
	
	@Test
	public void browser_firefox()
	{
		URL="https://www.youtube.com/watch?v=Cs3ReVCahuw";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.close();
	}

}
