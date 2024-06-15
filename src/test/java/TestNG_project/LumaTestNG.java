package TestNG_project;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Page_object.Create_account;
import Page_object.Homepage;
import Page_object.MenPage;
import Page_object.MenRykerItemPage;
import Page_object.MenShoppCartUpdate;
import Page_object.RewandPaymentpg;
import Page_object.Shippg_Addrs;
import Page_object.SignOutpage;
import Page_object.TopsPage;
import Page_object.jackets_jk;
import Page_object.myaccoutpage;
import Page_object.oliviaJKpage;
import Page_object.shoppingcartpage;
import Page_object.womenpage;
import Page_object.womensubcategory;

public class LumaTestNG {
	
	
	
		WebDriver driver;
		JavascriptExecutor js;
		Homepage HP;
		Create_account  CA;
		myaccoutpage MAP;
		womenpage WP;
		womensubcategory WS;
		jackets_jk JK;
		oliviaJKpage OJK;
		shoppingcartpage SCP;
		MenPage MP;
		TopsPage TP;
		MenRykerItemPage MRP;
		MenShoppCartUpdate MS ;
		Shippg_Addrs SA;
		SignOutpage SOP;
		RewandPaymentpg RP;
		@BeforeSuite
		 public void setUp() {

		 driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(5));
		 
		
	HP=new Homepage(driver);
	CA=new Create_account (driver);
	MAP=new myaccoutpage (driver);
	WP=new womenpage(driver);
	WS=new womensubcategory(driver);
	JK =new jackets_jk(driver);
	OJK=new oliviaJKpage(driver);
	SCP=new shoppingcartpage(driver);
	MP=new MenPage(driver);
	TP=new TopsPage(driver);	
	MRP=new MenRykerItemPage(driver);
	MS=new MenShoppCartUpdate(driver);	
	SA=new Shippg_Addrs(driver);
	SOP=new SignOutpage (driver);	
	RP=new RewandPaymentpg(driver);
		} 

	@Test (priority=1)
	public void createanAccount() throws InterruptedException
	{
		

	js=(JavascriptExecutor)driver;
		
	HP.clickCreatAcct();


	CA.ScrolltoSignininformation();
	CA.enterFname();
	CA.enterLname();
	CA.enterEmail();
	CA.enterPword();
	CA.enterCPword();	
	CA.clickCABtn();

	}
	@Test (priority=2)
	public void verifypopUp() throws InterruptedException
	{

		String popUp=CA.gettext1();
			String exp="There is already an account with this email address. If you are sure that it is your email address, click here to get your password and access your account.";
		    Assert.assertEquals(exp,popUp);

	}

	@Test(priority=3)
	public void signin() throws InterruptedException {
		CA.Signin();
		CA.enteremail();
		CA.enterpw();
		CA.clickbtn();
	}
	@Test(priority=4)
	public void verifysearchfunction() throws InterruptedException
	{
	MAP.searchbtn();
	MAP.click();
	}

	@Test(priority=5)
	public void  verifylinkwomen() throws InterruptedException
	{
		String popUp=WP.gettext();
		String exp="Search results for: 'women'";
	    Assert.assertEquals(exp,popUp);
	    
		WP.womenlink();

	}
	@Test(priority=6)
	public void verifsubcategory() {

		String Women=WS.gettext();
		String exp="Women";
	    Assert.assertEquals(exp,Women);    
	    WS.jackets();
	}
	@Test(priority=7)
	public void verifyJKitem() {
	JK.jacketsJK();
	String item=JK.gettext();
	String exp="Olivia 1/4 Zip Light Jacket";
	Assert.assertEquals(exp,item);    
	}
	@Test(priority=8)
	public void verifyinvalidSizeColorQty() throws InterruptedException {
		
	OJK.clear();

	OJK.click();
		String size=OJK.gettext();
	    String exp="This is a required field.";
	    Assert.assertEquals(exp,size);    

	    String color=OJK.gettext1();
	    String exp1="This is a required field.";
	    Assert.assertEquals(exp1,color); 

	  
		String quantity=OJK.gettext2();
	    String exp2="Please enter a valid number in this field.";
	    Assert.assertEquals(exp2,quantity);
	}
	@Test(priority=9)
	public void verifysizecolourinvQyt() throws InterruptedException {
		
	OJK.size();
	OJK.color();
	OJK.clearqty();
	OJK.sendqty();
	OJK.addcart();



		String errortext=OJK.gettext3();
		
	    String exp3="Please enter a quantity greater than 0.";
	    Assert.assertEquals(exp3,errortext);
	}

	@Test(priority=10)
	public void verifyselectedItems() throws InterruptedException {
		OJK.quantity();
		OJK.sendkeys();
		OJK.addcart1();
		}

	@Test(priority=11)
	public void verifAlertmsg() 
	{
		
		 String alert=OJK.gettext4();
		    String exp4="You added Olivia 1/4 Zip Light Jacket to your shopping cart.";
		    Assert.assertEquals(exp4,alert);   
		    }
	@Test(priority=12)
	public void  verifyScartPrice() throws InterruptedException
	{
	OJK.shoppingcart();
	String price=OJK.gettext5();
	String exp="$77.00";
	Assert.assertEquals(exp,price);

	OJK.viewcart();
	}

	@Test(priority=13)
	public void verifywishlistLSC() throws InterruptedException 
	{
		SCP.whishlist();

	String alert= SCP.gettext0();
	String exp="Olivia 1/4 Zip Light Jacket has been moved to your wish list.";
	Assert.assertEquals(exp,alert);

	SCP.Men();
	}
	@Test(priority=14)
	public void Menpage() throws InterruptedException {
		
		String title= MP.gettext();
		String exp="Men";
		Assert.assertEquals(exp,title);
	  MP.tops();

	}



	@Test(priority=15)
	public void verifyitemcolor() throws InterruptedException {
		TP.color();
		TP.blue();
		String textblue=TP.gettext1();
	    String exp="Blue";
		Assert.assertEquals(exp,textblue);
	}

	@Test(priority=16)
	public void verifylinkERINRECOMMENDS() throws InterruptedException
	{
	TP.Recommends();
	TP.yes();
	String ERtext=TP.gettext2();
	String exp="Erin Recommends";
	Assert.assertEquals(exp,ERtext);

	}
	@Test(priority=17)
	public void verifySortBy() throws InterruptedException {

	TP.sort();


	}
	@Test(priority=18)
	public void verifypageItems() throws InterruptedException
	{
		String PI=TP.gettext3();
		String exp="8";
		Assert.assertEquals(exp,PI);
		TP.material();

		TP.polyster();
		
		TP.item();
	}
	@Test(priority=19)
	public void verifyAddingMenlinks() throws InterruptedException 
	{
		
		//verifyingdetailsscqty
			MRP.size();
			MRP.color();
			MRP.qty();
			MRP.button();
		//navigatepage
	        driver.navigate().back();
			MRP.material();
			MRP.organiccotten();
		    MRP.item();
			//verifyingdetailsscqty
			MRP.size1();
			MRP.color1();
		    MRP.qty1();
	        MRP.button1();
			
		//xpath for addcartand view
				MRP.showcart();
				MRP.viewcart();
				
	}
	@Test(priority=20)
	public void verifyUpdateShoppingcart() throws InterruptedException {
		
		MS.update();
		
		MS.qty();
		
		MS.keys();
		
	}
	@Test(priority=21)
	public void verifySubtotal() throws InterruptedException {
	MS.update1();
	String Subtol=MS.gettext0();
	String exp="$127.00";
	Assert.assertEquals(exp,Subtol);
		
	}	

	@Test(priority=22)
	public void verifyEditbtn() throws InterruptedException {

		MS.editbutton();
		
		MS.itemsize();
		MS.itemcolor();
		MS.updatecart();
	String UpdatePage=MS.gettext1();
	String exp="Bruno Compete Hoodie was updated in your shopping cart.";
	Assert.assertEquals(exp,UpdatePage);

	}

	@Test(priority=23)
	public  void verifydeleteBtn() throws InterruptedException 
	{
		MS.deletbtn();
		String Item=MS.gettext2();
		String exp="Shopping Cart";
		Assert.assertEquals(exp,Item);

		}
	@Test(priority=24)
	public void verifyproceedtocheckout() throws InterruptedException
		{
	MS.PTCO();

		String  Shippadd=MS.gettext3();
		String exp="Shipping Address";
		Assert.assertEquals(exp,Shippadd);
	}

	@Test (priority=25)
	public void verifyShippingForm() throws InterruptedException {
	  //newadds
	//shippingoption
	SA.Soption();
	//nextbtn
	SA.btnnext();

	}

	@Test(priority=26)

	public void verifyplaceorderbtn() throws InterruptedException 
	{
	RP.POrder();

	String PO= RP.gettext1();
	String exp="Thank you for your purchase!";
	Assert.assertEquals(exp,PO);
	}
	@Test(priority=27)
	public void verifySignOut() throws InterruptedException
	{
		SOP.Pwrapper();
		SOP.SignOut();
		}

	@AfterSuite

	public void closeBrowser() throws InterruptedException
	{
		
		driver.close();
	}


	}


