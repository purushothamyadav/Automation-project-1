package Page_object;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class womenpage {

	WebDriver driver;
	    WebDriverWait wait;
	    public womenpage(WebDriver wd)
		{
	   	 driver=wd;
	  	 wait=new WebDriverWait(driver,Duration.ofSeconds(10));

			PageFactory.initElements(driver,this);
		}
		
		
		
		@FindBy(xpath="//h1[@class='page-title']") WebElement text;
	    @FindBy	(xpath="//ul[@id='ui-id-2']/child::li[2]")WebElement women;

		
		 public String gettext()
		{
			return text.getText();
		}
	    public void womenlink()
	{
		women.click();
	    WebElement Wlink=wait.until(ExpectedConditions.visibilityOf(women));   	

	}
	}

