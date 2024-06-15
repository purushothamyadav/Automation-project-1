package Page_object;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shippg_Addrs {
	
	WebDriver driver;
	WebDriverWait wait;

	    public  Shippg_Addrs (WebDriver wd)
		{
	   	 driver=wd;
	 	 wait=new WebDriverWait(driver,Duration.ofSeconds(10));

			PageFactory.initElements(driver,this);
		}
	    @FindBy(xpath="//li[@id='opc-shipping_method']/descendant::div[6]/child::table/child::tbody/child::tr[1]/child::td[1]")WebElement Soption;

	    @FindBy(xpath="//button[@data-role='opc-continue']")WebElement next;

	    
	    public void Soption() {
		    WebElement SO=wait.until(ExpectedConditions.visibilityOf(Soption));   	

	    	Soption.click();
	    }
	    public void btnnext() {
	    	next.click();
	    }
	    
	    
	    
	    
	    
	}

