import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
//import java.util.List;
import java.util.concurrent.TimeUnit;
//import org.junit.After;
//import org.junit.Before;
import org.junit.Test;

public class TestSAT {
	
    @Test
    public void saTransfer() {
		
        
		System.setProperty("webdriver.gecko.driver", "/home/tests/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080/form/send");
    		
		
		//login
        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"email-input\"]"));   
        firstName.sendKeys("maher.bouzid@flow-wallet.com");      	           

        WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[1]/div/div/input"));
        password.sendKeys("Maher345$");
	   
        WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]"));
        login.click();
         
        // Transfer operation       
        try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        WebElement amount = driver.findElement(By.xpath("//*[@id=\"send-input\"]"));
        amount.sendKeys(String.valueOf(100));
        
        /* List<WebElement> buttons = driver.findElements(By.xpath("//*[@class=\"vs-component vs-button button is-link w-full vs-button-primary vs-button-filled\"]"));
        for (WebElement next : buttons) {
            if (next.getText().equals("Next")) {
                //System.out.println("Button found");
            	Actions actions = new Actions(driver);
            	actions.moveToElement(next).click().build().perform();
                break;
            }
        }*/
        
        WebElement next = driver.findElement(By.xpath("//*[@class=\"vs-component vs-button button is-link w-full vs-button-primary vs-button-filled\"]"));        
        Actions actions = new Actions(driver);
        actions.moveToElement(next).click().build().perform();
        
        // Choose recipient from your connections
        try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        WebElement recipient = driver.findElement(By.cssSelector(".hide > div:nth-child(1) > div:nth-child(1)"));
        recipient.click();
         
                
       /* List<WebElement> buttons2 = driver.findElements(By.xpath("//*[@class=\"vs-component vs-button button is-link w-full vs-button-primary vs-button-filled\"]"));
        for (WebElement next2 : buttons2) {
            if (next2.getText().equals("Next")) {
                //System.out.println("Button found");
            	Actions actions = new Actions(driver);
            	actions.moveToElement(next2).click().build().perform();
                break;
            }
        }*/
        
        WebElement next1 = driver.findElement(By.xpath("//*[@class=\"vs-component vs-button button is-link w-full vs-button-primary vs-button-filled\"]"));        
        Actions actions1 = new Actions(driver);
        actions1.moveToElement(next1).click().build().perform();
        
        // Enter passcode step
        
        try {
			TimeUnit.SECONDS.sleep(3);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        WebElement passcode = driver.findElement(By.xpath("//*[@id=\"passcode-input\"]"));
        passcode.sendKeys("Maher345$");
        
        WebElement confirm = driver.findElement(By.xpath("//*[@class=\"vs-component vs-button button is-success w-full vs-button-primary vs-button-filled\"]")); 
        confirm.click();
        //driver.quit();


     } 
	
 
}
