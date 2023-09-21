
	package com.test;

	import org.openqa.selenium.By;
    import org.openqa.selenium.NoSuchSessionException;
    import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.chrome.ChromeOptions;
    
	public class AdactinRegist {
		public static void main(String[] args) throws NoSuchSessionException, InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\mailm\\eclipse-workspace\\Javadem\\src\\driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			Thread.sleep(1000);
			driver.get("https://adactinhotelapp.com/");
			driver.manage().window().maximize();
			WebElement register=driver.findElement(By.xpath("//a[text()='New User Register Here']"));
			register.click();
			WebElement user=driver.findElement(By.xpath("//input[@id='username']"));
			user.sendKeys("Muthulakshmi");
			WebElement pass=driver.findElement(By.xpath("//input[@id='password']"));
			pass.sendKeys("Muthu026");
			WebElement confrm=driver.findElement(By.xpath("//input[@id='re_password']"));
			confrm.sendKeys("Muthu026");
			WebElement full_nam=driver.findElement(By.xpath("//input[@name='full_name']"));
			full_nam.sendKeys("Muthulakshmi Subbiah");
			WebElement email = driver.findElement(By.xpath("//input[@name='email_add']"));
			email.sendKeys("mail.myfrnd@gmail.com");
			WebElement checkB=driver.findElement(By.xpath("//input[@name='tnc_box']"));
		    checkB.click();
		    WebElement Regis=driver.findElement(By.xpath("//input[@type='submit']"));
		    Regis.click();
		    System.out.println("Registration done successfully");
			
			
			
			
		}
	}



