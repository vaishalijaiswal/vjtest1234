package Common;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;


public class DriverUtil {
	/**
	 * Wait for element display in given seconds
	 * 
	 * @param locator
	 * @param seconds
	 * 
	 */
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	public static void waitElementDisplayedImplicitlyForSeconds(final By locator, int seconds) {
		new FluentWait<WebDriver>(driver).withTimeout(seconds, TimeUnit.SECONDS).pollingEvery(1, TimeUnit.SECONDS)
				.ignoring(WebDriverException.class).until(ExpectedConditions.visibilityOfElementLocated(locator));
	}

	public static void inputtext(final By locator, String text) {
		clearThetextField(locator);
		driver.findElement(locator).sendKeys(text);
	}

	public static void click(By locator) {
		driver.findElement(locator).click();
	}

	public static String getText(By locator) {
		return driver.findElement(locator).getText();
	}

	public static String getAttribute(String attr, By locator) {
		return driver.findElement(locator).getAttribute(attr);
	}

	public static WebElement findElementMethod(By locator) {
		return driver.findElement(locator);

	}

	public static String getSelectedOption(By locator) {
		Select selectText = new Select(findElementMethod(locator));
		String text = selectText.getFirstSelectedOption().getText();
		return text;

	}

	public static void selectOption(By locator, String text) {
		Select drpList = new Select(findElementMethod(locator));
		drpList.selectByVisibleText(text);
	}

	public static String getNextDay() {
		Date dt = new Date();

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dt);
		calendar.add(Calendar.DATE, 1);
		dt = calendar.getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
		String strDate = formatter.format(dt);

		return strDate;
	}

	public static void clearThetextField(final By locator) {

		findElementMethod(locator).sendKeys(Keys.CONTROL + "a");
		findElementMethod(locator).sendKeys(Keys.DELETE);
	}

	public static void checkCheckboxAs(By locator, String text) {
		
		if (text.equals("checked")) {
			if(!DriverUtil.driver.findElement(locator).isSelected())
			    DriverUtil.driver.findElement(locator).click();
		} else if (text.equals("unchecked")) {
			if(DriverUtil.driver.findElement(locator).isSelected())
				DriverUtil.driver.findElement(locator).click();
				System.out.print("box is unchecked");
		}
			
	}
}
