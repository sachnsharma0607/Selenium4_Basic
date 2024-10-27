package com.basictestscript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestPageLoadStrategies extends constants {
	@Test
	public void testPageLoadStragies01() {
		URL = "https://www.makemytrip.com/flights/";
		URL="https://www.cleartrip.com/";
		ChromeOptions opt = new ChromeOptions();
		//opt.setPageLoadStrategy(PageLoadStrategy.NORMAL);//6173
		//opt.setPageLoadStrategy(PageLoadStrategy.EAGER);//7174
		opt.setPageLoadStrategy(PageLoadStrategy.NONE);//6040
		// WebDriverManager.chromedriver().setup();
		long start = System.currentTimeMillis();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(URL);
		
		driver.findElement(By.xpath("//div[contains(@class,'flex flex-middle nmx')]")).click();
		//driver.findElement(By.xpath("//a[text()='Search']")).click();
		long end = System.currentTimeMillis();

		driver.quit();
		System.out.println(end - start);

	}
}
