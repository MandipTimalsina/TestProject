package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PageList {
	
WebDriver driver;
	
	public PageList(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//body/div[3]/input[3]") WebElement ToggleAllButton;
	@FindBy(how = How.XPATH, using = "//input[@name='todo[0]']") WebElement SingleListFoodButton;
	@FindBy(how = How.XPATH, using = "//a[3]/span") WebElement Important407Button;
	@FindBy(how = How.XPATH, using = "//body/a[1]") WebElement YesToDeleteImportant407Button;
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']") WebElement RemoveButton;
	
	public void ClickToggleAllButton() {
		
		ToggleAllButton.click();
	}
	
	public void ClickImportant407Button() {
		
		Important407Button.click();
	}
	
	public void ClickSingleListFoodButton() {
		
		SingleListFoodButton.click();
	}
	
	public void ClickYesToDeleteImportant407() {
		
		YesToDeleteImportant407Button.click();
	}
	
	public void ClickRemoveButton() {
		
		RemoveButton.click();
	}

}
