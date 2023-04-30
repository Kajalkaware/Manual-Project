package SeleniumProject.SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Unit test for simple App
 */
public class SignUpTest {
    
	@org.testng.annotations.Test
	public void show() {
	
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\kawar\\OneDrive\\Desktop\\SoftwareTesting\\Driver\\Firefox\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();   
	    driver.get("https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	    
	    driver.findElement(By.id("ap_email")).sendKeys("kawarekajal4938@gmail.com");
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys("Kaju@1210");
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.cssSelector(".hm-icon-label")).click(); 
        
        String title =driver.getTitle();
        System.out.println(title);
        System.out.println(driver.getCurrentUrl());
        
        
        if(title.equals(title)) {
        System.out.print("Correct Title");
        
        }
        else
        {
        System.out.print("Not Correct title");
        }
        
        System.out.print(driver.getCurrentUrl());
        }
       
      
	
		
	}