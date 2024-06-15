package Page_object;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RewandPaymentpg {

	

	
	WebDriver driver;
	WebDriverWait wait;

	    public  RewandPaymentpg (WebDriver wd)
		{
	   	 driver=wd;
	 	 wait=new WebDriverWait(driver,Duration.ofSeconds(20));

			PageFactory.initElements(driver,this);
		}

	    @FindBy(xpath="//button[@class='action primary checkout']")WebElement placeorder;
	   
	    @FindBy(xpath="//div[@class='page-title-wrapper']/child::h1")WebElement messg;


	public void POrder() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", placeorder);
	    wait.until(ExpectedConditions.visibilityOf(placeorder));   	

		placeorder.click();
	}
	public  String gettext1() 
	{
	return messg.getText();
	}



	}












