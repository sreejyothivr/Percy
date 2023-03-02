

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


import io.percy.selenium.Percy;



public class Example {
	
	@Test
	public void getstring()
	{
	
	WebDriver driver;
	driver=new ChromeDriver();
	Percy percy = new Percy(driver);
   driver.get("https://www.google.com");
	System.out.println(driver.getTitle());
	percy.snapshot("Java example");
	  }}
