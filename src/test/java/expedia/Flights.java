package expedia;

import org.testng.annotations.Test;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class Flights {
	public WebDriver driver;
  @Test
  public void search() throws InterruptedException, Exception {
	  // search for flight
	  WebElement flight = driver.findElement(By.xpath("//*[@id=\"uitk-tabs-button-container\"]/li[2]/a/span"));
	  flight.click();
	  WebElement dest = driver.findElement(By.xpath("//*[@id=\"location-field-leg1-origin-menu\"]/div[1]/button"));
	  dest.click();
	  WebElement destfrom = driver.findElement(By.xpath("//*[@id=\"location-field-leg1-origin\"]"));
	  destfrom.sendKeys("New York");
	  WebElement airportfrom = driver.findElement(By.xpath("//*[@id=\"location-field-leg1-origin-menu\"]/div[2]/ul/li[2]/button"));
	  airportfrom.click();
	  WebElement arrival = driver.findElement(By.xpath("//*[@id=\"location-field-leg1-destination-menu\"]/div[1]/button"));
	  arrival.click();
	  WebElement arrivalto = driver.findElement(By.xpath("//*[@id=\"location-field-leg1-destination\"]"));
	  arrivalto.sendKeys("Indonesia");
	  WebElement airportto = driver.findElement(By.xpath("//*[@id=\"location-field-leg1-destination-menu\"]/div[2]/ul/li[1]/button"));
	  airportto.click();
	  WebElement dpdate = driver.findElement(By.xpath("//*[@id=\"d1-btn\"]"));
	  dpdate.click();
	  Thread.sleep(3000);
	  WebElement dpSep10 = driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/table/tbody/tr[2]/td[5]/button"));
	  dpSep10.click();
	  WebElement rtSep29 = driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[1]/div[2]/div[2]/table/tbody/tr[5]/td[3]/button"));
	  rtSep29.click();
	  WebElement done = driver.findElement(By.xpath("//*[@id=\"wizard-flight-tab-roundtrip\"]/div/div[2]/div/div/div/div[1]/div/div[2]/div/div[2]/button/span"));
	  done.click();
	  WebElement passenger = driver.findElement(By.xpath("//*[@id=\"adaptive-menu\"]/a"));
	  passenger.click();
	  WebElement single = driver.findElement(By.xpath("//*[@id=\"adaptive-menu\"]/div/div/section/div[1]/div[1]/div/button[1]"));
	  single.click();
	  WebElement okay = driver.findElement(By.xpath("//*[@id=\"adaptive-menu\"]/div/div/div[2]/button/span"));
	  okay.click();
	  WebElement search = driver.findElement(By.xpath("//*[@id=\"wizard-flight-pwa-1\"]/div[3]/div[2]/button"));
	  search.click();
	  Thread.sleep(3000);
	  
	  // selecting flights
	  WebElement select1 = driver.findElement(By.xpath("(//*[@type='button'])[34]"));
	  select1.click();
	  Thread.sleep(6000);
	  WebElement select2 = driver.findElement(By.xpath("(//*[@type='button'])[34]"));
	  select2.click();
	  Thread.sleep(5000);
//	  WebElement tripsavings = driver.findElement(By.xpath("//*[@id=\"forcedChoiceNoThanks\"]"));
//	  tripsavings.click();
//	  Thread.sleep(4000);
	  String currentHandle= driver.getWindowHandle();
	  Set <String> handles = driver.getWindowHandles();
	   for(String actual: handles)
       {
           
        if(!actual.equalsIgnoreCase(currentHandle))
        {
            driver.switchTo().window(actual);
        }
       }
	  WebElement booking = driver.findElement(By.xpath("(//*[@type='submit'])[11]"));
	  booking.click();
	  
	  Set <String> handled = driver.getWindowHandles();
	   for(String actual: handled)
      {
          
       if(!actual.equalsIgnoreCase(currentHandle))
       {
           driver.switchTo().window(actual);
       }
      }
	  
	  // passenger info
	  WebElement first = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[14]/section[2]/article[1]/form/fieldset/fieldset/div/fieldset[1]/label[1]/input"));
	  first.sendKeys("John");
	  WebElement last = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[14]/section[2]/article[1]/form/fieldset/fieldset/div/fieldset[1]/label[3]/input"));
	  last.sendKeys("Doe");
	  WebElement phone = driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[14]/section[2]/article[1]/form/fieldset/fieldset/div/label[2]/input"));
	  phone.sendKeys("2124789874");
	  WebElement sex = driver.findElement(By.xpath("//*[@id=\"gender_male[0]\"]"));
	  sex.click();
	  WebElement month = driver.findElement(By.xpath("//*[@id=\"date_of_birth_month0\"]"));
	  Select m = new Select(month);
	  m.selectByValue("07");
	  WebElement day = driver.findElement(By.xpath("//*[@id=\"date_of_birth_day[0]\"]"));
	  Select d = new Select(day);
	  d.selectByValue("21");
	  WebElement year = driver.findElement(By.xpath("//*[@id=\"date_of_birth_year[0]\"]"));
	  Select y = new Select(year);
	  y.selectByValue("1992");
	  
	  WebElement cardName = driver.findElement(By.xpath("//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/label[1]/input"));
	  cardName.sendKeys("John Doe");
	  WebElement cardNum = driver.findElement(By.xpath("//*[@id=\"creditCardInput\"]"));
	  cardNum.sendKeys("4602660215987456");
	  WebElement cardMonth = driver.findElement(By.xpath("//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/fieldset/label[1]/select"));
	  Select cm = new Select(cardMonth);
	  cm.selectByValue("12");
	  WebElement cardYear = driver.findElement(By.xpath("//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/fieldset/label[2]/select"));
	  Select cy = new Select(cardYear);
	  cy.selectByValue("2025");
	  WebElement cardCode = driver.findElement(By.xpath("//*[@id=\"new_cc_security_code\"]"));
	  cardCode.sendKeys("666");
	  
	  WebElement billAdd = driver.findElement(By.xpath("//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[1]/input"));
	  billAdd.sendKeys("15671 Cross Bay Blvd");
	  WebElement billCity = driver.findElement(By.xpath("//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[3]/input"));
	  billCity.sendKeys("Howard Beach");
	  WebElement billState = driver.findElement(By.xpath("//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[4]/select"));
	  Select bs = new Select(billState);
	  bs.selectByValue("NY");
	  WebElement billZip = driver.findElement(By.xpath("//*[@id=\"payment-type-creditcard\"]/div[2]/form/fieldset/div/div/div[3]/div/fieldset/div[3]/label[5]/input"));
	  billZip.sendKeys("11414");
	  
	  WebElement email = driver.findElement(By.xpath("//*[@id=\"email\"]/div[1]/fieldset/label/input"));
	  email.sendKeys("john.doe@gmail.com");
	  WebElement pass = driver.findElement(By.xpath("//*[@id=\"account-creation\"]/fieldset/label[1]/input"));
	  pass.sendKeys("John159*");
	  WebElement passConfirm = driver.findElement(By.xpath("//*[@id=\"account-creation\"]/fieldset/label[2]/input"));
	  passConfirm.sendKeys("John159*");
	  
	  
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
