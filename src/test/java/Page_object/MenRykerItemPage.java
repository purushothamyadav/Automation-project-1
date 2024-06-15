package Page_object;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MenRykerItemPage {
	
	WebDriver driver;
		WebDriverWait wait;

	    public   MenRykerItemPage(WebDriver wd)
		{
	   	 driver=wd;
	 	 wait=new WebDriverWait(driver,Duration.ofSeconds(10));

			PageFactory.initElements(driver,this);
		}
	    
	 
	    

	    @FindBy(xpath="//div[@class='swatch-attribute size']/child::div[1]/child::div[4]") WebElement size;
	    @FindBy(xpath="//div[@class='swatch-attribute color']/child::div[1]/child::div[3]") WebElement color;
	    @FindBy(xpath="//input[@id='qty']") WebElement qty;
	    @FindBy(id="product-addtocart-button")WebElement button;
	    
	    
	  //navigatepage
	  		
	  		@FindBy(xpath="//div[@class='filter-options']/child::div[6]/child::div[1]")WebElement material;
	 
	  		@FindBy(xpath="//div[@class='filter-options']/child::div[6]/child::div[2]/child::ol/child::li[8]")WebElement organiccotten;
	  	
	  		@FindBy(xpath="//ol[@class='products list items product-items']/child::li[3]/child::div/child::div/child::strong/child::a") WebElement item;
	  		
	  		//verifyingdetailsscqty
	  		@FindBy(xpath="//div[@class='swatch-attribute size']/child::div[1]/child::div[4]")WebElement size1;
			
	  		@FindBy(xpath="//div[@class='swatch-attribute color']/child::div[1]/child::div[3]")WebElement color1;
		
	  		@FindBy(xpath="//input[@id='qty']")WebElement qty1;
			
		    @FindBy(id="product-addtocart-button")WebElement button1;
			
	    
		  //xpath for addcartand view
		    @FindBy(xpath="//a[@class='action showcart']")WebElement showcart;
			
		    @FindBy(xpath="//a[@class='action viewcart']")WebElement viewcart;

	    
	    public void size()
	    {
		    WebElement S=wait.until(ExpectedConditions.visibilityOf(size));   	

	    	size.click();
	    }
	    public void color() {
	    	color.click();
	    }
	    public void qty() {
	    	qty.click();
	    }
	    
	    
	    public void button() {
	    	button.click();
	    }
	    
	    
	    
	    public void material()
	    {
		    WebElement M=wait.until(ExpectedConditions.visibilityOf(material));   	

	    	material.click();
	    }
	    
	    public void organiccotten() {
	    	organiccotten.click();
	    }
	    public void item() {
	    	item.click();
	    }
	    
	    
	    public void size1() {
	    	size1.click();
	    }
	    public void color1() {
	    	color1.click();
	    }
	    public void qty1() {
	    	qty1.click();
	    }
	    
	    
	    public void button1() {
	    	button1.click();
	    }

	public void showcart() {
		showcart.click();
	}
	public void viewcart() {
		viewcart.click();
	}
	}

