package TEST;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
  @Test
  public void f() {
	  String currentTitle=driver.getTitle();
	  String expectedTitle="trivago.in - Compare hotel prices worldwide";
	  System.out.println(currentTitle);
		if(currentTitle.equals(expectedTitle)) {
			System.out.println("Title Matched");
		}
		else {
			System.out.println("Title not Matched");
		}
		
		
  }
  @Test
  public void Q1() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"input-auto-complete\"]")).click();
	  Thread.sleep(3000);
	  WebElement txtBox1=driver.findElement(By.xpath("//*[@id=\"input-auto-complete\"]"));
	  txtBox1.sendKeys("Munnar");
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//*[@id=\"input-auto-complete\"]")).sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/div[2]/div/div[3]/div/div/form/fieldset/div/div[1]/button")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/div[2]/div/div[3]/div/div/form/div[4]/div/div/div[2]/div/div[2]/div[2]/ul/li[1]/label")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[3]/div[2]/div/div[3]/div/div/form/div[4]/div/div/div[2]/div/div[2]/div[2]/ul/li[3]/label")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[2]/div/div[1]/button[3]/span")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"checkbox-22\"]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"overlay-root\"]/div/section/footer/div/div/div/button[2]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/div[1]/section/div[2]/div[2]/div/button")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/main/div[2]/div[2]/div/div/div/div[2]/div/ul/li[2]/div/label")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/main/div[2]/div[2]/div/div/div/div[3]/div/button/span/span[2]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/main/div[2]/div[2]/div/div/div/div[3]/div/button/span/span[1]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/main/div[2]/div[2]/div/div/div/div[5]/div/button")).click();
	  
	  
  }
  @Test
  public void Q2() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"sorting-selector\"]")).click();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"sorting-selector\"]/option[3]")).click();
	  Thread.sleep(3000);
	  String txt1=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/main/div[3]/div[1]/div/div[3]/div/div/ol/li/div/article/div[2]/div[1]/section/h2/button/span")).getText();
		System.out.println(txt1);
		Thread.sleep(3000);
		String txt2=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/main/div[3]/div[1]/div/div[3]/div/div/ol/li/div/article/div[2]/div[2]/div[1]/div/div[3]/div[1]/div/p")).getText();
		System.out.println(txt2);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"sorting-selector\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"sorting-selector\"]/option[6]")).click();
		Thread.sleep(3000);
		String txt3=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/main/div[3]/div[1]/div/div[3]/div/div/ol/li/div/article/div[2]/div[1]/section/h2/button/span")).getText();
		System.out.println(txt3);
		Thread.sleep(3000);
		String txt4=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/main/div[3]/div[1]/div/div[3]/div/div/ol/li/div/article/div[2]/div[2]/div[1]/div/div[3]/div[1]/div/p")).getText();
		System.out.println(txt4);
		
		String txt5=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/main/div[3]/div[1]/div/div[2]/div[1]/div[2]/div[2]/div/div/div[1]/span[2]/strong")).getText();
		System.out.println("Stay Found : " + txt5);
		Thread.sleep(3000);
		String txt6=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/main/div[3]/div[1]/div/div[3]/div/div/ol/li/div/article/div[2]/div[2]/div[1]/div/div[3]/div[1]/div/p")).getText();
		System.out.println("Booking site Searched : "+txt6);
		
  }
  @Test
  public void Q3() throws InterruptedException {
	  String txt1=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
	  System.out.println(txt1);
	  String txt2=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
	  System.out.println(txt2);
	  String txt3=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[5]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
	  System.out.println(txt3);
	  String txt4=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
	  System.out.println(txt4);
	  String txt5=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[7]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).getText();
	  System.out.println(txt5);
	  driver.findElement(By.xpath("//*[@id=\"sorting-selector\"]/option[3]")).click();
	  String currentprice=driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/main/div[3]/div[1]/div/div[3]/div/div/ol/li/div/article/div[2]/div[2]/div[1]/div/div[3]/div[1]/div/p")).getText();
	  String expectedprice="trivago.in - Compare hotel prices worldwide";
	  System.out.println(currentprice);
	  if(currentprice.equals(expectedprice)) {
		  System.out.println("price Matched");
	  }
	  else {
		  System.out.println("price not Matched");
	  }
	  driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[1]/main/div[3]/div[1]/div/div[3]/div/div/ol/li/div/article/div[2]/div[2]/div[1]/div/div[3]/div[2]/button/span/span[1]")).click();
	  driver.findElement(By.xpath("//*[@id=\"contentContainer\"]/div[3]/ol/li[1]/div[2]/a/div/div[2]/div")).click();
	  driver.findElement(By.xpath("//*[@id=\"hotelNavBar\"]/div/ul/li[2]/button/span")).click();
	  driver.findElement(By.xpath("//*[@id=\"ChildRoom-Ch8I2vnABhACIA4ojuUhMARAAUoJN0QxTl8xMDBQUJgFEgIIARoGEAIoBDAB\"]/div/div[4]/div[2]/div/div[1]/button/div")).click();
	  WebElement txtBoxl=driver.findElement(By.xpath("//*[@id=\"Fullname\"]"));
	  txtBoxl.sendKeys("Shanmugam");
	  
	  
  }
  @BeforeClass
  public void beforeClass() {
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--remote-allow-origins=*");
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver(co);
	  driver.get("https://www.trivago.in/");
	  driver.manage().window().maximize();
  }
  
  @AfterClass
  public void afterClass() {
//	  driver.close();
  }
  
}
		
		