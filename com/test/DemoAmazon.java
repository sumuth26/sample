
	package com.test;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class DemoAmazon {
		public static void main(String[] args) throws InterruptedException
		{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mailm\\eclipse-workspace\\JavaDemo1\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.amazon.in/");//to launch the browser
	    driver.manage().window().maximize();//to maximize the window
	    WebElement mob = driver.findElement(By.xpath("//*[text()='Mobiles']"));
	    Actions acc = new Actions(driver);
	    acc.contextClick(mob).perform();
	    WebElement search=driver.findElement(By.xpath("//input[@type='text']"));
	    search.sendKeys("iphone13");
	    WebElement submit=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
	    submit.click();
	    WebElement model=driver.findElement(By.xpath("//img[@class='s-image']"));
	    Actions acc1 = new Actions(driver);
	    acc1.doubleClick(model).perform();
	    System.out.println("double click success");
	    WebElement add=driver.findElement(By.xpath("//*[text()='Add to Cart']"));
	    Actions acc2 = new Actions(driver);
	    acc2.moveToElement(add).perform();
	    acc2.click();
	    System.out.println("Move to element success");
	
	   
	}
	}


