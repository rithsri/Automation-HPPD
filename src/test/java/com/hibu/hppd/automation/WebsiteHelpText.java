package com.hibu.hppd.automation;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebsiteHelpText {
	
	private WebDriver driver;
	
	
	  @BeforeClass
	  public void openBrowser() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D://Softwares/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://hibu--config03.cs15.my.salesforce.com/001e000000wzbsM"); //001e000000wzbsM  001e000000xDPza
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			  driver.findElement(By.id("username")).sendKeys("hemalatha.bondalapati@hibu.com.config03");
			  driver.findElement(By.name("pw")).sendKeys("Hemalatha@123");
			  WebElement login = driver.findElement(By.id("Login"));
			  login.click(); 
			  /*		driver.findElement(By.id("emc")).sendKeys("73364");
				driver.findElement(By.id("save")).click();*/
			  Thread.sleep(1000); 
			  driver.findElement(By.name("customer_dashboard")).click();
			  Thread.sleep(30000);
			  ArrayList<String> newWindowHandle = new ArrayList<String> (driver.getWindowHandles());
			  driver.switchTo().window(newWindowHandle.get(1));	    
			  String title = driver.getTitle();
			  System.out.println("switched to ----"+title);
			  driver.findElement(By.xpath("//*[@id='overview-wrapper']/div/div[3]/div[1]/div/div[1]/div[1]/a/span")).click();
			  Thread.sleep(4000);
	  }
/*	  
	  @BeforeMethod
	  public void login() throws InterruptedException {
		  driver.findElement(By.id("username")).sendKeys("hemalatha.bondalapati@hibu.com.config03");
		  driver.findElement(By.name("pw")).sendKeys("Hemalatha@123");
		  WebElement login = driver.findElement(By.id("Login"));
		  login.click(); 
		  		driver.findElement(By.id("emc")).sendKeys("73364");
			driver.findElement(By.id("save")).click();
		  Thread.sleep(1000); 
		  driver.findElement(By.name("customer_dashboard")).click();
		  Thread.sleep(30000);
		  ArrayList<String> newWindowHandle = new ArrayList<String> (driver.getWindowHandles());
		  driver.switchTo().window(newWindowHandle.get(1));	    
		  String title = driver.getTitle();
		  System.out.println("switched to ----"+title);
		  driver.findElement(By.xpath("//*[@id='overview-wrapper']/div/div[3]/div[1]/div/div[1]/div[1]/a/span")).click();
		  Thread.sleep(4000);
	  }*/
	
  @Test(priority=1)
  public void kpiData() throws InterruptedException, IOException{
	  //driver.findElement(By.xpath("//*[@id='overview-wrapper']/div/div[3]/div[1]/div/div[1]/div[1]/a/span")).click();
	  //Thread.sleep(4000);
	  WebElement ele=driver.findElement(By.cssSelector("div.row.section.summary"));
	  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", ele);
	  Thread.sleep(1000);
	  File src1= ((TakesScreenshot)driver). getScreenshotAs(OutputType.FILE);	
	  FileUtils. copyFile(src1, new File("D:/Selenium/"+ System.currentTimeMillis() +"KPIData.png"));
	  
	  Assert.assertEquals("Hibu Performance Dashboard - Website", driver.getTitle());
  }  
  
  @Test(priority=2)
  public void crossProductUplift() throws InterruptedException, IOException{
	  //driver.findElement(By.xpath("//*[@id='overview-wrapper']/div/div[3]/div[1]/div/div[1]/div[1]/a/span")).click();
	  //Thread.sleep(4000);
	  WebElement ele=driver.findElement(By.cssSelector("div.row.section.cross_product"));
	  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", ele);
	  Thread.sleep(1000);
	  File src1= ((TakesScreenshot)driver). getScreenshotAs(OutputType.FILE);	
	  FileUtils. copyFile(src1, new File("D:/Selenium/"+ System.currentTimeMillis() +"CrossProductUplift.png"));	  
	  Assert.assertEquals("div", ele.getTagName());
  }
  
  @Test(priority=3)
  public void monthlyActivitySummary() throws InterruptedException, IOException{
	  ///driver.findElement(By.xpath("//*[@id='overview-wrapper']/div/div[3]/div[1]/div/div[1]/div[1]/a/span")).click();
	  //Thread.sleep(4000);
	  WebElement ele=driver.findElement(By.cssSelector("div.row.section.performance_monthly"));
	  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", ele);
	  Thread.sleep(1000);
	  File src1= ((TakesScreenshot)driver). getScreenshotAs(OutputType.FILE);	
	  FileUtils. copyFile(src1, new File("D:/Selenium/"+ System.currentTimeMillis() +"MonthlyActivitySummary.png"));	  
	  Assert.assertEquals("div", ele.getTagName());
  }
  
  @Test(priority=4)
  public void websitePerformance() throws InterruptedException, IOException{
	  //driver.findElement(By.xpath("//*[@id='overview-wrapper']/div/div[3]/div[1]/div/div[1]/div[1]/a/span")).click();
	  //Thread.sleep(4000);
	  WebElement ele=driver.findElement(By.cssSelector("div.row.section.overview"));
	  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", ele);
	  Thread.sleep(1000);
	  File src1= ((TakesScreenshot)driver). getScreenshotAs(OutputType.FILE);	
	  FileUtils. copyFile(src1, new File("D:/Selenium/"+ System.currentTimeMillis() +"websitePerformance.png"));	  
	  Assert.assertEquals("div", ele.getTagName());
  }
  
  @Test(priority=5)
  public void mostVisited() throws InterruptedException, IOException{
	  //driver.findElement(By.xpath("//*[@id='overview-wrapper']/div/div[3]/div[1]/div/div[1]/div[1]/a/span")).click();
	  //Thread.sleep(4000);
	  WebElement ele=driver.findElement(By.cssSelector("div.row.section.most_visited"));
	  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", ele);
	  Thread.sleep(1000);
	  File src1= ((TakesScreenshot)driver). getScreenshotAs(OutputType.FILE);	
	  FileUtils. copyFile(src1, new File("D:/Selenium/"+ System.currentTimeMillis() +"MostVisited.png"));	  
	  Assert.assertEquals("div", ele.getTagName());
  }
  
  @Test(priority=6)
  public void referringSites() throws InterruptedException, IOException{
	  //driver.findElement(By.xpath("//*[@id='overview-wrapper']/div/div[3]/div[1]/div/div[1]/div[1]/a/span")).click();
	  //Thread.sleep(4000);
	  WebElement ele=driver.findElement(By.cssSelector("div.row.section.referring_sites"));
	  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", ele);
	  Thread.sleep(1000);
	  File src1= ((TakesScreenshot)driver). getScreenshotAs(OutputType.FILE);	
	  FileUtils. copyFile(src1, new File("D:/Selenium/"+ System.currentTimeMillis() +"ReferringSites.png"));	  
	  Assert.assertEquals("div", ele.getTagName());
  }
	
  @Test(enabled=false)
  public void kpiText() throws InterruptedException, IOException{
	  
	  System.setProperty("webdriver.chrome.driver", "D://Softwares/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://hibu--config03.cs15.my.salesforce.com/001e000000wzbsM");
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	  driver.findElement(By.id("username")).sendKeys("hemalatha.bondalapati@hibu.com.config03");
	  driver.findElement(By.name("pw")).sendKeys("Hemalatha@123");
	  WebElement login = driver.findElement(By.id("Login"));
	  login.click(); 
/*	  driver.findElement(By.id("emc")).sendKeys("21229");
	  driver.findElement(By.id("save")).click();*/

	  Thread.sleep(2000);

	  driver.findElement(By.name("customer_dashboard")).click();
	  
	  Thread.sleep(30000);

	  ArrayList<String> newWindowHandle = new ArrayList<String> (driver.getWindowHandles());
/*	  String hi = driver.switchTo().window(newWindowHandle.get(0)).getTitle();
	  System.out.println(hi);*/
	  driver.switchTo().window(newWindowHandle.get(1));	    
	  String title = driver.getTitle();
	  System.out.println("switched to ----"+title);

	  driver.findElement(By.xpath("//*[@id='overview-wrapper']/div/div[3]/div[1]/div/div[1]/div[1]/a/span")).click();
	  Thread.sleep(4000);
	  WebElement ele=driver.findElement(By.cssSelector("div.row.section.summary"));
	  ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", ele);

	 // JavascriptExecutor js = (JavascriptExecutor) driver;
	 // js.executeScript("document.body.style.zoom='67%'");
		/*JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 400)", "");*/
		  Thread.sleep(1000);
	 // driver.findElement(By.cssSelector("div.row.section.summary")).click();
	  File src1= ((TakesScreenshot)driver). getScreenshotAs(OutputType.FILE);	
	  FileUtils. copyFile(src1, new File("D:/Selenium/"+ System.currentTimeMillis() +"KPIHelp.png"));
	  //FileUtils. copyFile(src, new File("D:/Selenium/NEWResults.png"));
	  Thread.sleep(3000);
	  driver.findElement(By.cssSelector("div.row.section.summary > div.row.no-margin > div.col-xs-12.text-right.section-icon > .icon-button")).click();
	  
	  /*WebElement we = driver.findElement(By.cssSelector("div.row.section.summary > div.row.no-margin > div.col-xs-12.text-right.section-icon > .icon-button >img"));
		// Scroll the browser to the element's X position
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+we.getLocation().x+")");
		// Click the element
		we.click();
*/
	  //driver.findElement(By.cssSelector("div.row.section.summary > div.row.no-margin > div.col-xs-12.text-right.section-icon > .icon-button")).click();
	  Thread.sleep(1000);
	  File src2= ((TakesScreenshot)driver). getScreenshotAs(OutputType.FILE);	
	  FileUtils. copyFile(src2, new File("D:/Selenium/"+System.currentTimeMillis()+"KPIHelp.png"));

	  
  }
}
