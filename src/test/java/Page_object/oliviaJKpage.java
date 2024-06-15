package Page_object;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class oliviaJKpage {
	
	WebDriver driver;
	WebDriverWait wait;

	    
	    public  oliviaJKpage(WebDriver wd)
		{
	   	 driver=wd;
	  	 wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	      PageFactory.initElements(driver,this);
		}

	    @FindBy(xpath="//input[@id='qty']")WebElement qty;
		@FindBy(id="product-addtocart-button")WebElement addtocart;
		
		@FindBy(xpath="//div[@id='super_attribute[143]-error']")WebElement size;
	    @FindBy(xpath="//div[@id='super_attribute[93]-error']") WebElement color;
	    @FindBy(xpath="//div[@id='qty-error']")WebElement qty1;
	   
	    
	    //invalid qty
	    @FindBy(xpath="//div[@class='swatch-attribute size']/child::div[1]/child::div[1]") WebElement size1;
	  @FindBy(xpath="//div[@class='swatch-attribute color']/child::div[1]/child::div[1]") WebElement color1;
	  @FindBy(xpath="//input[@id='qty']") WebElement Cqty;
	  @FindBy(xpath="//input[@id='qty']") WebElement Sqty;
	  @FindBy(xpath="//button[@title='Add to Cart']")WebElement addTC ;
	  @FindBy(xpath="//div[@id='qty-error']")WebElement errortext;
	    
	  //valid
	  @FindBy(xpath="//input[@id='qty']")WebElement CQty ;
	  @FindBy(xpath="//input[@id='qty']")WebElement  SK;
	  @FindBy(id="product-addtocart-button")WebElement addTC1 ;

	  @FindBy(xpath="//div[@role='alert']")WebElement msg;
	  
	  //shoppingcart
	  
	  @FindBy(xpath="//div[@class='minicart-wrapper']") WebElement minicart;
	@FindBy(xpath="//span[@class='minicart-price']") WebElement price;
	@FindBy(xpath="//a[@class='action viewcart']")WebElement VC;
	  
	   //invalidSCQ 
	    public void clear()
		{
		    WebElement qantity=wait.until(ExpectedConditions.visibilityOf(qty));   	

			qty.clear();

		}
		public void click() 
		{
			addtocart.click();
		}

		public String gettext() 
		{
			return size.getText();
		}

		public String gettext1() 
		{
			return color.getText();
		
		}
		public String gettext2() 
		{
			return qty1.getText();
		}

		//invalidqty
		 public void size()
			{
			    WebElement size=wait.until(ExpectedConditions.visibilityOf(size1));   	

				size1.click();
			}
			public void color() 
			{
				color1.click();
			}
			 public void clearqty()
				{
					Cqty.clear();
				}
				public void sendqty() 
				{
					Sqty.sendKeys("0");
				}
				public void addcart() 
				{
					addTC.click();
				}
				
				public String gettext3() 
			{
				return errortext.getText();
			}

				//valid
				
				public void quantity() {
				    WebElement qty=wait.until(ExpectedConditions.visibilityOf(CQty));   	

					  CQty.clear();
				  }
				  public void sendkeys() {
					  SK.sendKeys("3");
				  }
				  
				  public void addcart1() {
					  addTC1.click();
				  }

				  public String gettext4()
				  {
					  return msg.getText();
			  }
	//shoppingcart
	public void shoppingcart() {
	    WebElement shoppcart=wait.until(ExpectedConditions.visibilityOf(minicart));   	

		minicart.click();
		
	}
	public String gettext5() {
		return price.getText();
	}
	public void viewcart() {
	    WebElement viewcart=wait.until(ExpectedConditions.visibilityOf(VC));   	

		VC.click();
	}


	}

