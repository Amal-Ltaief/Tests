import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

public class TakeOffer1 {
	
	@Test
    public void takeOpenOffer() throws IOException {
		
		/* DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		Date dateobj = new Date();
		System.out.println(df.format(dateobj));*/
		
		/*PrintStream fileStream = new PrintStream("parallelOffers.txt");
		System.setOut(fileStream);*/
		
		Writer output = new BufferedWriter(new FileWriter("parallelOffers.txt", true));
		
		
	    System.setProperty("webdriver.gecko.driver", "/home/tests/geckodriver/geckodriver");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://localhost:8080/dashboard");
		
		
		//login
	    output.append("\n"+java.time.LocalDateTime.now()+" : [User 2 : logging .. ]");

        WebElement firstName = driver.findElement(By.xpath("//*[@id=\"email-input\"]"));   
        firstName.sendKeys("test2@flow.com");      	           

        WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/div/div[2]/div[1]/div/div/div[2]/div[1]/div/div/input"));
        password.sendKeys("Test123/");
	   
        WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]"));
        login.click();
        

        
       try {
			TimeUnit.SECONDS.sleep(15);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
        
        WebElement primaryOffer = driver.findElement(By.cssSelector("div.margins:nth-child(1) > div:nth-child(1) > section:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > table:nth-child(1) > tr:nth-child(3)"));
        primaryOffer.click();
        primaryOffer.click();
        
        try {
 			TimeUnit.SECONDS.sleep(5);
 		} catch (InterruptedException e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
        
        output.append("\n"+java.time.LocalDateTime.now()+" : User 2 chose the offer ..");


        WebElement passCode = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[1]/div/div[1]/div/div/input"));
        passCode.sendKeys("Test123/");
        
        WebElement confirmCode = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[2]/button"));
        confirmCode.click();
        
        try {
			TimeUnit.SECONDS.sleep(50);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        String url = driver.getCurrentUrl();
        
        
        if (url.contentEquals("http://localhost:8080/form/exchange/openoffers")) {       	
            output.append("\n"+java.time.LocalDateTime.now()+" : User 2 took the offer!");
        } else { 
            output.append("\n"+java.time.LocalDateTime.now()+" : User 2 : Error while taking the offer");

        	}      
        
        driver.close();
        output.append("\n"+java.time.LocalDateTime.now()+" : [USER 2 : Quit]");
        output.close();

        
		}
        
       
}
