package com.ecomm.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class 
{       
	static String projectPath= System.getProperty("user.dir");
	public static WebDriver driver;
	
	public void initDriver()
	{

	//String projectPath = System.getProperty("user.dir");
	//System.out.println(projectPath);
	
	System.setProperty("webdriver.chrome.driver", projectPath+"\\driver\\chromedriver.exe");
    driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/v4/index.php");
	driver.manage().window().maximize();
	
	
	
	
	

}
}
