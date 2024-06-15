package Page_object;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignOutpage {

	WebDriver driver;
	WebDriverWait wait;

	    
	    public  SignOutpage (WebDriver wd)
		{
	   	 driver=wd;
	 	 wait=new WebDriverWait(driver,Duration.ofSeconds(10));

			PageFactory.initElements(driver,this);
		}
	    @FindBy(xpath="//div[@class='panel wrapper']/descendant::ul[1]/child::li[2]/child::span")WebElement panelwrapper;

	    @FindBy(xpath="//div[@class='panel wrapper']/descendant::ul[2]/child::li[3]/child::a")WebElement signoutbtn;
		


	public void Pwrapper() {
	    WebElement PW=wait.until(ExpectedConditions.visibilityOf(panelwrapper));   	

		panelwrapper.click();
	}
	 public void SignOut() {
		 signoutbtn.click();
	 }
	}

