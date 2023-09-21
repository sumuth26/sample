
	package com.wipro;

	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class DragAndDoub {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\mailm\\eclipse-workspace\\JavaDemo1\\driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/droppable");//to launch the browser
	driver.manage().window().maximize();//to maximize the window
	Actions acc = new Actions(driver);
	WebElement source = driver.findElement(By.xpath("//*[@id='draggable']"));
	WebElement destination = driver.findElement(By.xpath("//*[@id='droppable']"));
	acc.dragAndDrop(source, destination).perform();

	}
	}



