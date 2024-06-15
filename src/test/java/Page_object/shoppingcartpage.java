package Page_object;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class shoppingcartpage {
	
	
	WebDriver driver;
	WebDriverWait wait;
	    public  shoppingcartpage (WebDriver wd)
		{
	   	 driver=wd;
	  	 wait=new WebDriverWait(driver,Duration.ofSeconds(10));


			PageFactory.initElements(driver,this);
		}
	    
	    @FindBy(xpath="//a[@class='use-ajax action towishlist action-towishlist']/child::span")WebElement whishlist;

	   @FindBy( xpath="//div[@role='alert']")WebElement alert;
	   //men
	   @FindBy(xpath="//ul[@class='ui-menu ui-widget ui-widget-content ui-corner-all']/child::li[3]")WebElement men;
	   
	   public void whishlist()
	   {	
		   WebElement WL=wait.until(ExpectedConditions.visibilityOf(whishlist));   	


		  whishlist .click();

	   }
	   
	 public String gettext0()
	 {
		return alert.getText();
	}

	 public void Men() {
		 WebElement M=wait.until(ExpectedConditions.visibilityOf(men));   	

		 men.click();
	 }

	}
	   
	 

