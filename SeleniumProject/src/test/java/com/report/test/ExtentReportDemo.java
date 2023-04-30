package com.report.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo {

	ExtentReports extent;	
    @BeforeTest
    public void Config() {
   	 
   	 String path = System.getProperty("C:\\Users\\kawar\\Desktop\\KajalST\\SeleniumProject")+"\\reports\\index.html";
   	 ExtentSparkReporter reporter = new ExtentSparkReporter (path);
   	 reporter.config().setReportName("Web Automation Results");
   	 reporter.config().setDocumentTitle("Test Result");
   	 
   	 extent = new ExtentReports();
   	 extent.attachReporter(reporter);
   	 extent.setSystemInfo("Tester", "Kajal Kaware");
   	 
    }
     @Test
     
     public void AmazonProjectResult() throws InterruptedException{
   	  
   	ExtentTest test = extent.createTest ("AmazonProjectResult");
   	System.setProperty("webdriver.gecko.driver", "C:\\Users\\kawar\\OneDrive\\Desktop\\SoftwareTesting\\Driver\\Firefox\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();   
    driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
    
    driver.findElement(By.id("ap_email")).sendKeys("kawarekajal4938@gmail.com");
	driver.findElement(By.id("continue")).click();
	driver.findElement(By.id("ap_password")).sendKeys("Kaju@1210");
	driver.findElement(By.id("signInSubmit")).click();
	driver.findElement(By.cssSelector(".hm-icon-label")).click();
	Thread.sleep(1000);
    System.out.println(driver.findElement(By.cssSelector("div[id='hmenu-customer-name'] b")).getText());
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".nav-sprite.hmenu-close-icon")).click();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".nav-a[href='/gp/goldbox?ref_=nav_cs_gb']")).click();
    System.out.println(driver.findElement(By.cssSelector(".nav-a[href='/gp/goldbox?ref_=nav_cs_gb']")).getText());
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".nav-a[href='/b/?_encoding=UTF8&ld=AZUSSOA-sell&node=12766669011&ref_=nav_cs_sell']")).click();
    System.out.println(driver.findElement(By.cssSelector(".heading.align-start.font-size-medium.color-squid-ink.ember.font-heavy")).getText());
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".nav-a[href='/gp/buyagain?ie=UTF8&ref_=nav_cs_buy_again']")).click();
    System.out.println(driver.findElement(By.cssSelector("h1[class='a-spacing-medium']")).getText());
    Thread.sleep(1000);
    driver.findElement(By.id("nav-your-amazon-text")).click();
    System.out.println(driver.findElement(By.cssSelector(".a-size-large.a-spacing-base")).getText());
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".nav-a[href='/gift-cards/b/?ie=UTF8&node=2238192011&ref_=nav_cs_gc']")).click();
    System.out.println(driver.findElement(By.cssSelector("div:nth-child(1) div:nth-child(1) div:nth-child(1) h1:nth-child(1)")).getText());
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".nav-a[href='/gp/browse.html?node=16115931011&ref_=nav_cs_registry']")).click();
    System.out.println(driver.findElement(By.cssSelector(".a-link-normal.gr-btn.gr-btn--rounded.gr-text.gr-text--sm.gr-hero__cta.gr-home-btn.a-button-primary")).getText());
    Thread.sleep(1000);
    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("i phone 12");
    driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
    driver.findElement(By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_4'] span[class='a-size-medium a-color-base a-text-normal']")).click();
    driver.findElement(By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1'] div[class='a-section aok-relative s-image-fixed-height']")).click();
    driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();


}
	
	
}