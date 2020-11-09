package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCatogaryPage;
import page.ValidateAllTheMonths;
import util.BrowserFactory;

public class AddCatogaryTest {

	WebDriver driver;

    @Test(priority = 1)
	public void ValidUserShouldBeAbleToAddCatogary() throws InterruptedException {
		driver = BrowserFactory.startBrowser();
		AddCatogaryPage addcatogaryPage = PageFactory.initElements(driver, AddCatogaryPage.class);

		addcatogaryPage.addcatogarynameboxbutton("PUSHPA");
		addcatogaryPage.clickonaddcatogarybutton();
		BrowserFactory.tearDown();

	}

	@Test(priority = 2)
	public void ValidUserShouldBeAbleToAddCatogaryseeexitname() throws InterruptedException {
		ValidateAllTheMonths validateallthemonthsPage = PageFactory.initElements(driver, ValidateAllTheMonths.class);

		driver = BrowserFactory.startBrowser();
		validateallthemonthsPage.CheckBoxAll();
		BrowserFactory.tearDown();
	}
}
