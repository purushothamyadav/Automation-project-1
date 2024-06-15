package Page_object;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	 WebDriver driver;
	 WebDriverWait  wait ;
	//public static void main(String[] args) {
		
		

		
		 
		     public Homepage(WebDriver wd)
			{
		    	 driver=wd;
				PageFactory.initElements(driver,this);
		   	 wait=new WebDriverWait(driver,Duration.ofSeconds(10));

			}
			
			//RepositoryBy Class
		     
		    //CreatAcct 
		    @FindBy (linkText="Create an Account") WebElement CA;
		    @FindBy (linkText="Sign In") WebElement SI;
		    public void clickCreatAcct() throws InterruptedException {
		        WebElement creataccount=wait.until(ExpectedConditions.visibilityOf(CA));   	

		    	CA.click();
		    }
		    
		    public void clickSignin()  {
		        WebElement Signin=wait.until(ExpectedConditions.visibilityOf(SI));   	

		    	SI.click();

		    }

		
	}


