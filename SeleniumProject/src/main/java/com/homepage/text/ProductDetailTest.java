package com.homepage.text;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ProductDetailTest {

	
	@Test
	public void display() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kawar\\OneDrive\\Desktop\\SoftwareTesting\\Driver\\Firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();   
	    driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	    
	    driver.findElement(By.id("ap_email")).sendKeys("kawarekajal4938@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Kaju@1210");
		driver.findElement(By.id("signInSubmit")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("i phone 12");
        driver.findElement(By.cssSelector("#nav-search-submit-button")).click();
        driver.findElement(By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_4'] span[class='a-size-medium a-color-base a-text-normal']")).click();
        driver.findElement(By.cssSelector("div[class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_1'] div[class='a-section aok-relative s-image-fixed-height']")).click();
        driver.findElement(By.id("add-to-cart-button")).click();
        Thread.sleep(2000);
        System.out.println(driver.findElement(By.id("productTitle")).getText());

        
	}
	
}