package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class AddCatogaryPage {
	
	WebDriver driver;
    public AddCatogaryPage(WebDriver driver) {
     this.driver = driver;
    }
		// Element Library
		
		@FindBy(how = How.NAME, using = "categorydata")
		WebElement ADD_CATOGARY_CHECK_BUTTON;
		@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/input[2]")
		WebElement ADD_CATOGARY_CLICK_BUTTON;
		
	
       //Intractive Methods
	
	
	    public void addcatogarynameboxbutton(String addcatogary) {
		ADD_CATOGARY_CHECK_BUTTON.sendKeys(addcatogary);

	}
	    public void clickonaddcatogarybutton() {
	    	ADD_CATOGARY_CLICK_BUTTON.click();

	    }  
	    
	}
