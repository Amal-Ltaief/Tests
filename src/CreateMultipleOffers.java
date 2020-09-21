import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class CreateMultipleOffers {
	
	@Test
    public void CreateMultipleOffersMAT() {
		
	    		
		/********** First group creates offers **********/
		
		
		for (int i = 1; i <= 2; i = i + 1) {
			
		System.setProperty("webdriver.gecko.driver", "/home/tests/geckodriver/geckodriver");	
		WebDriver driver = new FirefoxDriver();
	    driver.get("http://localhost:8080/form/send");

        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"email-input\"]"));   
        firstName.sendKeys("test"+i+"@flow.com");      	           

        WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[1]/div/div/input"));
        password.sendKeys("Test123/");
	   
        WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]"));
        login.click();
        
        
       try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
                   
        WebElement showAssets = driver.findElement(By.xpath("//*[@role=\"presentation\"]"));
        showAssets.click();
        
        WebElement assetUL= driver.findElement(By.xpath("//ul[@role=\"listbox\"]"));
        List<WebElement> assetsList=assetUL.findElements(By.tagName("li"));
        for (WebElement li : assetsList) {
        if (li.getText().equals("EUR")) {
        	try {
             li.click();
             break;
           } catch(StaleElementReferenceException e) {
             }
        } 
        }
                
        WebElement amount = driver.findElement(By.xpath("//*[@id=\"send-input\"]"));
        amount.sendKeys(String.valueOf(300));
        
                     
        WebElement next = driver.findElement(By.xpath("//*[@class=\"vs-component vs-button button is-link w-full vs-button-primary vs-button-filled\"]"));        
        Actions actions = new Actions(driver);
        actions.moveToElement(next).click().build().perform();
        
        WebElement offer = driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[2]/section/div[1]"));
        offer.click();
        
        try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        actions.moveToElement(next).click().build().perform();
        
        try {
			TimeUnit.SECONDS.sleep(10);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        WebElement recipient = driver.findElement(By.xpath("//*[@id=\"pk\"]"));
        recipient.sendKeys("test100");
        

        WebElement search = driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/div/div[2]/div[2]/div/button")); 
        search.click();
           
        actions.moveToElement(next).click().build().perform();

     
        try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        WebElement passcode = driver.findElement(By.xpath("//*[@id=\"passcode-input\"]"));
        passcode.sendKeys("Test123/");
        
        WebElement confirm = driver.findElement(By.xpath("//*[@class=\"vs-component vs-button button is-success w-full vs-button-primary vs-button-filled\"]")); 
        confirm.click();
        
        try {
			TimeUnit.SECONDS.sleep(15);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        driver.close();
        
		}
        
      
        

        /*********** Second group creates offers ***********/
        
		for (int i = 3; i <= 4; i = i + 1) {
			
			System.setProperty("webdriver.gecko.driver", "/home/tests/geckodriver/geckodriver");	
			WebDriver driver = new FirefoxDriver();
		    driver.get("http://localhost:8080/form/send");

	        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"email-input\"]"));   
	        firstName.sendKeys("test"+i+"@flow.com");      	           

	        WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[1]/div/div/input"));
	        password.sendKeys("Test123/");
		   
	        WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]"));
	        login.click();
	        
	        
	       try {
				TimeUnit.SECONDS.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	                   
	        WebElement showAssets = driver.findElement(By.xpath("//*[@role=\"presentation\"]"));
	        showAssets.click();
	        
	        WebElement assetUL= driver.findElement(By.xpath("//ul[@role=\"listbox\"]"));
	        List<WebElement> assetsList=assetUL.findElements(By.tagName("li"));
	        for (WebElement li : assetsList) {
	        if (li.getText().equals("EUR")) {
	        	try {
	             li.click();
	             break;
	           } catch(StaleElementReferenceException e) {
	             }
	        } 
	        }
	                
	        WebElement amount = driver.findElement(By.xpath("//*[@id=\"send-input\"]"));
	        amount.sendKeys(String.valueOf(300));
	        
	                     
	        WebElement next = driver.findElement(By.xpath("//*[@class=\"vs-component vs-button button is-link w-full vs-button-primary vs-button-filled\"]"));        
	        Actions actions = new Actions(driver);
	        actions.moveToElement(next).click().build().perform();
	        
	        WebElement offer = driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div[2]/div/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[2]/section/div[1]"));
	        offer.click();
	        
	        try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        actions.moveToElement(next).click().build().perform();
	        
	        try {
				TimeUnit.SECONDS.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        WebElement recipient = driver.findElement(By.xpath("//*[@id=\"pk\"]"));
	        recipient.sendKeys("test100");
	        

	        WebElement search = driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/div/div[2]/div[2]/div/button")); 
	        search.click();
	           
	        actions.moveToElement(next).click().build().perform();

	     
	        try {
				TimeUnit.SECONDS.sleep(3);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        WebElement passcode = driver.findElement(By.xpath("//*[@id=\"passcode-input\"]"));
	        passcode.sendKeys("Test123/");
	        
	        WebElement confirm = driver.findElement(By.xpath("//*[@class=\"vs-component vs-button button is-success w-full vs-button-primary vs-button-filled\"]")); 
	        confirm.click();
	        
	        try {
				TimeUnit.SECONDS.sleep(15);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	        driver.close();
	        
			}
	}
}

