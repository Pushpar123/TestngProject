package page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ValidateAllTheMonths {
	WebDriver driver;

	public ValidateAllTheMonths(WebDriver driver) {
		this.driver = driver;

	}

	// Validate Months Element
	@FindBy(how = How.NAME, using = "due_month")
	WebElement VALIDATE_MONTHS;

	public void CheckBoxAll() {
		By bydata = By.xpath("//*[@id=\"extra\"]/select[3]");
		WebElement dropdown = driver.findElement(bydata);
		Select select = new Select(dropdown);
		List<WebElement> options = select.getOptions();
		// Check all
		if (null != options && options.size() == 13) {
			Assert.assertTrue(true);
		} else {
			Assert.fail("all months are not in the combo box");
		}
		String[] months = new String[] { "Non", "Jan", "Feb", "March", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
				"Nov", "Dec" };
		// Check all individual months
		for (WebElement dropDownElement : options) {
			for (String data : months) {
				if (data.equalsIgnoreCase(dropDownElement.getText())) {
					Assert.assertTrue(true);
				} else {
					Assert.fail("invalid Month");
				}
			}

		}

	}

}
