package homeDepot;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class Register {
	public WebDriver driver;
	
  @Test
  public void setUp() throws InterruptedException {
//	  browser ("Chrome", "https://www.homedepot.com/");
	  
	  // my account leading to sign up
	  WebElement myAccount = driver.findElement(By.xpath("//*[@class = 'MyAccount__button']"));
	  myAccount.click();
	  Thread.sleep(2000);
	  WebElement registerButton = driver.findElement(By.xpath("//*[@id=\"SPSORegister\"]/a/span"));
	  registerButton.click();
	  WebElement submit = driver.findElement(By.xpath("//*[@class='bttn__content'][1]"));
	  submit.click();
	  
	  //sign up field
	  WebElement email = driver.findElement(By.xpath("//*[@id=\\\"email\\\"]"));
	  // /html/body/div[1]/div/div[1]/div/div[2]/form/div[1]/input
	  // //*[@id=\"email\"]
	  email.sendKeys("john.doe@gmail.com");
	  WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
	  password.sendKeys("john159*");
	  WebElement zipcode = driver.findElement(By.xpath("//*[@id='zipCode']"));
	  zipcode.sendKeys("10001");
	  WebElement phone = driver.findElement(By.xpath("//*[@id='phone']"));
	  phone.sendKeys("2124789874");
	  WebElement create = driver.findElement(By.xpath("//*[@class='bttn__content'][1]"));
	  create.click();
	  
	  
	  
  }

  @Parameters ({"browser", "url"})
  @BeforeClass
	public void browser(String browser, String url) {
		if (browser.equalsIgnoreCase("Chrome")) {
			String userdirectory = System.getProperty("user.dir");
			System.out.println(userdirectory);
			System.setProperty("webdriver.chrome.driver", userdirectory + "\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.navigate().to(url);
			driver.manage().window().maximize(); 
		}
		else if (browser.equalsIgnoreCase("Firefox")) {
			String userdirectory = System.getProperty("user.dir");
			System.setProperty("webdriver.gecko.driver", userdirectory + "\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.navigate().to(url);
			driver.manage().window().maximize();
		} else {
			System.out.println("Wrong browser name");
		}
}

}
