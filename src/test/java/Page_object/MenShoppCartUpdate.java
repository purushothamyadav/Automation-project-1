package Page_object;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenShoppCartUpdate {

	

	
	WebDriver driver;
	WebDriverWait wait;

	    public   MenShoppCartUpdate(WebDriver wd)
		{
	   	 driver=wd;
	 	 wait=new WebDriverWait(driver,Duration.ofSeconds(10));

			PageFactory.initElements(driver,this);
		}

	//updatesc
	  @FindBy(xpath="//button[@title='Update Shopping Cart']")WebElement update;

	  @FindBy(xpath="//tbody[@class='cart item']/child::tr/child::td[3]/descendant::label/child::input")WebElement qty;

	  @FindBy(xpath="//tbody[@class='cart item']/child::tr/child::td[3]/descendant::label/child::input")WebElement keys;

	  
	  @FindBy(xpath="//button[@title='Update Shopping Cart']")WebElement update1;
	  @FindBy( xpath="//table[@class='data table totals']/child::tbody/child::tr[1]/child::td[1]")WebElement subtotal;
	  
	//editBTN
	  @FindBy(xpath="//table[@id='shopping-cart-table']/child::tbody[2]/child::tr[2]/descendant::div/child::a[2]")WebElement editbtn;
		
		@FindBy(xpath="//div[@class='swatch-attribute size']/child::div[1]/child::div[2]")WebElement  size ;
		
		@FindBy(xpath="//div[@class='swatch-attribute color']/child::div[1]/child::div[2]")WebElement color;
		
		@FindBy(xpath="//button[@title='Update Cart']")WebElement cart;
		
		
		//gettext
		@FindBy(xpath="//div[@class='message-success success message']")WebElement Text;
	  
		//deletebtn
		 @FindBy(xpath="//table[@id='shopping-cart-table']/child::tbody[2]/child::tr[2]/child::td/child::div/descendant::a[3]")WebElement delete;
		 @FindBy(xpath="//h1[@class='page-title']")WebElement messg;
	  //proceed to check out
		 @FindBy(xpath="//button[@data-role='proceed-to-checkout']")WebElement proceedtocheckout;
		 @FindBy(xpath="//div[@class='step-title']")WebElement messg1;
		 
	public void update() {
	    wait.until(ExpectedConditions.visibilityOf(update));   	

		update.click();
	}
	public void qty() {
		wait.until(ExpectedConditions.visibilityOf(qty));
		qty.clear();
	}


	public void keys() {
		wait.until(ExpectedConditions.visibilityOf(qty));
		qty.sendKeys("2");
	}

	public void update1() {
		wait.until(ExpectedConditions.visibilityOf(update1));
		update1.click();
	}

	public String gettext0() {
		wait.until(ExpectedConditions.visibilityOf(subtotal));
		return subtotal.getText();
	}

	//editbtn
	public void editbutton() {
	    wait.until(ExpectedConditions.visibilityOf(editbtn));   	

		editbtn.click();
	}

	public void itemsize() 
	{
		size.click();
	}

	public void itemcolor() {
		color.click();
	}

	public void updatecart() {
		cart.click();
	}

	public String gettext1() {
		return Text.getText();
	}

	//delete

	public void deletbtn() {
		delete.click();
	}
	public String gettext2() {
	return messg.getText();
	}

	//checkout

	public void PTCO() {

		proceedtocheckout.click();
	} 

	public String gettext3() {
		return messg1.getText();
	}
	}

