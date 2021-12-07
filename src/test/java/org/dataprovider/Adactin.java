package org.dataprovider;

import org.testng.annotations.BeforeClass;

public class Adactin {
@BeforeClass
public void browserconfig()
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Venkat\\eclipse-workspace\\Dataprovider\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.instagram.com");
	driver.manage().window().maximize();
	
	
}
}
