import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class CreateOffers {
	
	@Test
    public void CreateOffersMAT() {
		
	    System.setProperty("webdriver.gecko.driver", "/home/tests/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		
		/********** user1 creates offer ********/
		
		driver.get("http://localhost:8080/form/send");
		

        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"email-input\"]"));   
        firstName.sendKeys("test1@flow.com");      	           

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
			TimeUnit.SECONDS.sleep(3);
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
			TimeUnit.SECONDS.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        driver.close();
        
        
        
        

        /*********** user 2 creates offer ***********/
        

        WebDriver driver2 = new FirefoxDriver();

		driver2.get("http://localhost:8080/form/send");
		

        WebElement firstName2 = driver2.findElement(By.xpath("//*[@id=\"email-input\"]"));   
        firstName2.sendKeys("test2@flow.com");      	           

        WebElement password2 = driver2.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[1]/div/div/input"));
        password2.sendKeys("Test123/");
	   
        WebElement login2 = driver2.findElement(By.xpath("//*[@id=\"login\"]"));
        login2.click();
        
        
       try {
			TimeUnit.SECONDS.sleep(9);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
                   
        WebElement showAssets2 = driver2.findElement(By.xpath("//*[@role=\"presentation\"]"));
        showAssets2.click();
        
        WebElement assetUL2= driver2.findElement(By.xpath("//ul[@role=\"listbox\"]"));
        List<WebElement> assetsList2=assetUL2.findElements(By.tagName("li"));
        for (WebElement li2 : assetsList2) {
        if (li2.getText().equals("EUR")) {
        	try {
             li2.click();
             break;
           } catch(StaleElementReferenceException e) {
             }
        } 
        }
                
        WebElement amount2 = driver2.findElement(By.xpath("//*[@id=\"send-input\"]"));
        amount2.sendKeys(String.valueOf(200));
        
         
        WebElement next2 = driver2.findElement(By.xpath("//*[@class=\"vs-component vs-button button is-link w-full vs-button-primary vs-button-filled\"]"));        
        Actions actions2 = new Actions(driver2);
        actions2.moveToElement(next2).click().build().perform();
        

        actions2.moveToElement(next2).click().build().perform();

        //choose recipient
        
        WebElement recipient2 = driver2.findElement(By.xpath("//*[@id=\"pk\"]"));
        recipient2.sendKeys("test100");
        

        WebElement search2 = driver2.findElement(By.xpath("/html/body/div[3]/div/div[3]/div[2]/div/div/div[2]/div[2]/div[1]/div[3]/div/div[2]/div[2]/div/button")); 
        search2.click();
           
        actions2.moveToElement(next2).click().build().perform();

     
        try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        WebElement passcode2 = driver2.findElement(By.xpath("//*[@id=\"passcode-input\"]"));
        passcode2.sendKeys("Test123/");
        
        WebElement confirm2 = driver2.findElement(By.xpath("//*[@class=\"vs-component vs-button button is-success w-full vs-button-primary vs-button-filled\"]")); 
        confirm2.click();
        
        try {
			TimeUnit.SECONDS.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        driver2.quit();
     }

	

}
