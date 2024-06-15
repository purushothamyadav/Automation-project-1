package Page_object;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class MenPage {

	WebDriver driver;
	WebDriverWait wait;

	public  MenPage (WebDriver wd)
		{
	   	 driver=wd;
	  	 wait=new WebDriverWait(driver,Duration.ofSeconds(10));

			PageFactory.initElements(driver,this);
		}
		
		//mentitle
		@FindBy(xpath="//h1[@class='page-title']") WebElement men;
		@FindBy(xpath="//ol[@class='items']/child::li[1]/child::a") WebElement tops;
	public String gettext() 
	{
		return men.getText();
	}
	public void tops() {
	    WebElement TOPS=wait.until(ExpectedConditions.visibilityOf(tops));   	

		tops.click();
	}



	}	

