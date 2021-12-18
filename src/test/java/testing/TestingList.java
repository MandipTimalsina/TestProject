package testing;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.support.PageFactory;

import pages.PageList;
import utils.BrowserFactory;

public class TestingList {

	WebDriver driver;
	
	@Before
	public void initBrowser() {		
		driver = BrowserFactory.init();	
	}	
	
	@Test
	public void testTODOLIST() throws InterruptedException {	
		
		PageList todolistpage = PageFactory.initElements(driver, PageList.class);
		todolistpage.ClickToggleAllButton();
		Thread.sleep(2000);
		todolistpage.ClickToggleAllButton();
		Thread.sleep(2000);
		todolistpage.ClickSingleListFoodButton();
		Thread.sleep(2000);
		todolistpage.ClickRemoveButton();
		Thread.sleep(2000);
		todolistpage.ClickToggleAllButton();
		Thread.sleep(2000);
		todolistpage.ClickRemoveButton();
		Thread.sleep(2000);
	}
	
	@After
	public void tearDown() {
		BrowserFactory.tearDown();
	}
}
