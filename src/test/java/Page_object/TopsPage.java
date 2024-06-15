package Page_object;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TopsPage {
	
	WebDriver driver;
	WebDriverWait wait;
	    public   TopsPage(WebDriver wd)
		{
	   	 driver=wd;
	     

	  	 wait=new WebDriverWait(driver,Duration.ofSeconds(10));

			PageFactory.initElements(driver,this);
		}

	//color
	    @FindBy(xpath="//div[@class='filter-options']/child::div[5]")WebElement color;
	   @FindBy(xpath="//div[@class='filter-options']/child::div[5]/descendant::div[6]")WebElement blue;
	    @FindBy(xpath="//ol[@class='items']/child::li[1]/child::span[2]")WebElement  textblue;
	  
	    //linkERINRECOMMENDS
	    @FindBy(xpath="//div[@class='filter-options']/child::div[6]")WebElement Recommends;
	     @FindBy(xpath="//div[@class='filter-options']/child::div[6]/child::div[2]/child::ol/child::li[1]/child::a")WebElement yes; 
	     @FindBy(xpath="//ol[@class='items']/child::li[2]/child::span[1]")WebElement ERtext;
	    
	     @FindBy(xpath="//select[@class='sorter-options']")WebElement sort;
	     @FindBy(xpath="//div[@class='toolbar toolbar-products']/child::p/child::span")WebElement pageitems;
	   
	     //menlink
	     @FindBy(xpath="//div[@class='filter-options']/child::div[6]/child::div[1]")WebElement material;
	 	
	     @FindBy(xpath="//div[@class='filter-options']/child::div[6]/child::div[2]/child::ol/child::li[6]")WebElement polyster;
	 	
	     @FindBy(xpath="//ol[@class='products list items product-items']/child::li[2]/child::div/child::div/child::strong/child::a")WebElement itemcrewneck;
	 	
	     
	     public void color() {
	    	    WebElement C=wait.until(ExpectedConditions.visibilityOf(color));   	

			color.click();
		}
		public void blue() {
			blue.click();
		}
			public String gettext1() {
				return textblue.getText();
		}

			
			public void Recommends() {
				Recommends.click();
			    WebElement R=wait.until(ExpectedConditions.visibilityOf(Recommends));   	

			}
			public void yes() {
				yes.click();
			}
				public String gettext2() {
					return ERtext.getText();
			}	
			
			
			public void sort() {
				Select SB= new Select(sort);
				
				 SB.selectByValue("price");
				
			}
			//menlinks
			
			public String gettext3() {
				return pageitems.getText();
			}
			public void material() {
			    WebElement M=wait.until(ExpectedConditions.visibilityOf(material));   	

				material.click();
				
			}
	      public void polyster() {
		  
			polyster.click();
		   }		
	     public void  item() {
	    	 itemcrewneck.click();
	     }


	}

