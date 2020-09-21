import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.UUID;
import org.junit.Test;


public class RegistrationTest {
	
		
		
	    @Test
	    public void registration() {
	        
			System.setProperty("webdriver.gecko.driver", "/home/tests/geckodriver/geckodriver");
			WebDriver driver = new FirefoxDriver();
			driver.get("http://localhost:8080/pages/register?to=%2F");
			
            // Generate a random name
            final String randomName = randomName();
	        // Find the name form field
	        WebElement firstName = driver.findElement(By.name("name"));   
	        // Type the random name to the form
	        firstName.sendKeys(randomName);
	        
	        
            // Generate a random last name
            final String randomLastName = randomLastName();
	        // Find the last name form field
	        WebElement lastName = driver.findElement(By.name("last name"));
	        // Type the last name to the form
	        lastName.sendKeys(randomLastName);
	        	        
	        
	        // set email
	        final String randomEmail = randomEmail();	        
	        WebElement Email = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div[3]/div/input"));        
	        Email.sendKeys(randomEmail);
	        
	        // Click next button
	        WebElement next = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/div/div[2]/button"));
	        next.click();
	        
	       
	        
	        // Select country
	        WebElement selectCountry = driver.findElement(By.xpath("//*[@id=\"select\"]"));
	        selectCountry.click();

	       
	        	        
	        // Find the password form field
	        WebElement password = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div[2]/div/div[1]/div/div/input"));
	        //Type a password to the form. This needs not be unique.
	        password.sendKeys("Flow123/");
		    
	        // Find the confirm password form field
	        WebElement confPassword = driver.findElement(By.xpath("/html/body/div[3]/div/div/div[1]/div[2]/div/div[2]/div[2]/div/div[1]/div[3]/div[2]/div[1]/div/div/input"));
	        //Type again the password.
	        confPassword.sendKeys("Flow123/");
	        
	        // Click register button
	        WebElement register = driver.findElement(By.xpath("//*[@id=\"registerButton\"]"));
	        register.click();
	        
	        //driver.quit();
	        
	        
	        /* // Check the sign up succeeded by checking that the randomized
	        // email appears in the website's header bar.
	        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
	            public Boolean apply(WebDriver d) {
	                WebElement header = d.findElement(By.id("header-login"));
	                return header.getText().contains(randomEmail);
	            }
	        }); */
	        
	       
	        

	     }
		

	    private static String randomEmail() {
	        return "random-" + UUID.randomUUID().toString() + "@example.com";
	    }
	    
		private static String randomName() {
		    return "random-" + UUID.randomUUID().toString();
		}   
	    private static String randomLastName() {
			return "random-" + UUID.randomUUID().toString();
	    }
}
