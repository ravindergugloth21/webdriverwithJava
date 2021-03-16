
public class EndToEndMailTest {

	public static void main(String[] args) {
		{
			Assert.assertEquals("Home Page | Mail Travel",driver.getTitle());
		   driver.findElement(By.cssSelector("button[aria-label='Accept Cookies']")).click();
		   driver.findElement(By.cssSelector("button[class='sailthru-overlay-close']")).click();
		   driver.findElement(By.cssSelector("input[id='searchtext_freetext_search_form']")).sendKeys("India");
		   driver.findElements(By.cssSelector("div[class='nbf_button']")).get(0).click();
		   driver.findElements(By.cssSelector("button[class='nbf_tpl_text more-info-button button-main  button-text']")).get(0).click();
		  //Days
		  String days=driver.findElement(By.cssSelector("div[class='nbf_tpl_pagesection_vertical_norwd days-ctr']>span")).getText();
		  System.out.println(days);
		  String price=driver.findElement(By.cssSelector("span[class='heading-md bold pin-price-normal']")).getText();
		  System.out.println(price);
		  String phonenumber=driver.findElement(By.cssSelector("a[class='InfinityNumber vertical-align-middle heading-xl bold']")).getText();
		  System.out.println(phonenumber);
		  driver.findElement(By.cssSelector("a[href='#itinerary_title']")).click();
		  //driver.findElements(By.cssSelector("div[class='nbf_button nbf_tpl_pms_book_button'] ")).get(1).click();
		 String  actualPath="li[id='itin_iter_1_itinerary-day-container']";
		 String firstPath="li[id='itin_iter_";
		String secondPath="_itinerary-day-container']";
		for(int i=1;i<=10;i++)
		{
			String cssPath= firstPath+i+secondPath;
			WebElement element=driver.findElement(By.cssSelector(cssPath));
			element.click();
			String daystext=element.getText();
		System.out.println(daystext);	
		}
		//we need isselected for the date
		String expecteddate=driver.findElement(By.cssSelector("div[class='nbf_tpl_pms_calendar_day_available nbf_tpl_pms_calendar_box nbf_pms_tpl_calendar_selecteddate']")).getText();
		 //we need to assert this date to matching text on the acceptance criteria 9
		driver.findElements(By.cssSelector("div[class='nbf_fancyimg_pms_add_button nbf_fg_pms_button_text nbf_bg_pms_button nbf_fg_pms_button_text ']")).get(1).click();
	driver.findElements(By.cssSelector("div[class='nbf_fancy_nbf_tpl_pms_add_product']")).get(2).click();
	Select roomselection=new Select(driver.findElement(By.cssSelector("select[id='room-0-numselect']")));

	roomselection.selectByIndex(1);
	driver.findElement(By.cssSelector("div[class='nbf_fancy_nbf_tpl_pms_book_room nbf_fg_pms_button_text ']")).click();
	driver.findElement(By.cssSelector("div[class='nbf_button nbf_tpl_pms_button']")).click();

	driver.findElement(By.cssSelector("select[id='pax-a-title-1']")).click();
	Select title=new Select(driver.findElement(By.cssSelector("select[id='pax-a-title-1']")));

	title.selectByIndex(1);

	driver.findElement(By.cssSelector("input[name='pax-a-first-1']")).sendKeys("Ravi");
	driver.findElement(By.cssSelector("input[name='pax-a-last-1']")).sendKeys("Gugloth");
	driver.findElement(By.cssSelector("select[name='pax-a-dobd-1']")).click();
	Select db=new Select(driver.findElement(By.cssSelector("select[name='pax-a-dobd-1']")));
	db.selectByIndex(21);
	driver.findElement(By.cssSelector("select[id='pax-a-dobm-1']")).click();
	Select monthdb=new Select(driver.findElement(By.cssSelector("select[id='pax-a-dobm-1']")));
	monthdb.selectByIndex(4);
	driver.findElement(By.cssSelector("select[id='pax-a-doby-1']")).click();
	Select yeardb=new Select(driver.findElement(By.cssSelector("select[id='pax-a-doby-1']")));
	yeardb.selectByIndex(35);
	///

	driver.findElement(By.cssSelector("select[id='pax-a-title-2']")).click();
	Select title1=new Select(driver.findElement(By.cssSelector("select[id='pax-a-title-2']")));

	title1.selectByIndex(1);

	driver.findElement(By.cssSelector("input[name='pax-a-first-2']")).sendKeys("RaviRaj");
	driver.findElement(By.cssSelector("input[name='pax-a-last-2']")).sendKeys("Sabhawat");
	driver.findElement(By.cssSelector("select[name='pax-a-dobd-2']")).click();
	Select db1=new Select(driver.findElement(By.cssSelector("select[name='pax-a-dobd-2']")));
	db1.selectByIndex(21);
	driver.findElement(By.cssSelector("select[id='pax-a-dobm-2']")).click();
	Select monthdb1=new Select(driver.findElement(By.cssSelector("select[id='pax-a-dobm-2']")));
	monthdb1.selectByIndex(4);
	driver.findElement(By.cssSelector("select[id='pax-a-doby-2']")).click();
	Select yeardb1=new Select(driver.findElement(By.cssSelector("select[id='pax-a-doby-2']")));
	yeardb1.selectByIndex(28);


	driver.findElement(By.cssSelector("input[id='contact-mobile']")).sendKeys("0745888888");
	driver.findElement(By.cssSelector("input[id='contact-email']")).sendKeys("ravi@gugloth@gmail.com");
	driver.findElement(By.cssSelector("input[id='contact-address1']")).sendKeys("126, Manor House");
	driver.findElement(By.cssSelector("input[id='contact-city']")).sendKeys("London");
	driver.findElement(By.cssSelector("input[id='contact-postcode']")).sendKeys("IG7 5NP");


	driver.findElement(By.cssSelector("div[class='nbf_fancy_paxButton nbf_fg_pms_button_text ']")).click();

	driver.findElement(By.cssSelector("span[id='reassurance-bar-iter_4_top-bar-text']")).click();
	driver.findElement(By.cssSelector("select[name='vars[title]']")).click();
	Select signuptitle=new Select(driver.findElement(By.cssSelector("select[name='vars[title]']")));
	signuptitle.selectByIndex(0);
	driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Ravinder");
	driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Gugloth");
	driver.findElement(By.cssSelector("input[placeholder='E-mail Address']")).sendKeys("ravindergugloth21@gmail.com");
	driver.findElement(By.cssSelector("input[placeholder='Postcode']")).sendKeys("IG7 5NP");
	driver.findElement(By.cssSelector("input[id='agree']")).click();
	driver.findElement(By.cssSelector("input[id='sign-up']")).click();


	}

}
