package Page_object;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class womensubcategory {
	
	WebDriver driver;
	WebDriverWait wait;

	    public  womensubcategory(WebDriver wd)
		{
	   	 driver=wd;
	  	 wait=new WebDriverWait(driver,Duration.ofSeconds(10));

			PageFactory.initElements(driver,this);
		}
		
	    @FindBy(xpath="//span[@class='base']")WebElement text1;
		@FindBy(xpath="//div[@class='categories-menu']/descendant::li[2]/child::a") WebElement jackets;

	    public String gettext()
	   	{
	   		return text1.getText();
	   	}
	    
	    
	    public void jackets() {
		
	    jackets.click();

	    }
	    
	    
	}

