
	package com.test;

	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;


	public class Demo {
		public static void main(String[] args) throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mailm\\eclipse-workspace\\JavaDemo1\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://adactinhotelapp.com/");//to launch the browser
	    driver.manage().window().maximize();//to maximize the window
	    WebElement user=driver.findElement(By.xpath("//input[@name= 'username']"));
	    user.sendKeys("MuthulakshmiS");
	    WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
	    pass.sendKeys("muthuadactin");
	    WebElement login=driver.findElement(By.name("login"));
	    login.click();
		

	}
	}


