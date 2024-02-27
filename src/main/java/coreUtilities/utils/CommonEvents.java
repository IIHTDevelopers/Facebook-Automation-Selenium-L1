package coreUtilities.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Function;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.CaptureElement;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

/***
 * @author Sudhansu Sekhar Panda
 * This class is responsible to perform all generic or commonly used operations
 *
 */
public class CommonEvents 
{
	public WebDriver driver;

	public CommonEvents(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	/**
	 * This method is useful to generate the timestamp in ddMMYYYYHHmmss format
	 * 
	 * @return Timestamp in String format
	 */
	public String getTimeStamp() {
		return new SimpleDateFormat("ddMMYYYYHHmmss").format(new Date());
	}
	
	/**
	 * This method is used to convert our by type element to webelement
	 * @param by
	 * @return WebElement
	 */
	public WebElement getWebElement(By by)
	{
		return driver.findElement(by);
	}
	
	/**
	 * This method is useful to retrieve the text from the web element
	 * @param by - {@link By} type
	 * @return String
	 */
	public String getText(By by)
	{
		return "";
	}

	/**
	 * This method is useful to click on the given web element	
	 * @param by - {@link By} type
	 * @return {@link CommonEvents}
	 */
	public CommonEvents click(By by)
	{
		return null;

	}

	/***
	 * This method is useful to enter the value inside the text box.
	 * @param by - {@link By} type
	 * @param textToBeEntered - {@link String} type: Any input which must be a string data type
	 * @return {@link CommonEvents}
	 */
	public CommonEvents sendKeys(By by, String textToBeEntered)
	{
		return null;

	}
	
/***
	 * This method is useful to select the desired option from the drop down by the visible text.
	 * @param by - {@link By} type
	 * @param option - {@link String} type: the option which needs to be selected for the respective drop down
	 * @return {@link CommonEvents}
	 */
	public CommonEvents selectByVisibleText(By by, String option)
	{
		return null;

	}

	/***
	 * This method is useful to select the desired option from the drop down by the visible text.
	 * @param by - {@link By} type
	 * @param value - {@link String} type: the option which needs to be selected for the respective drop down
	 * @return {@link CommonEvents}
	 */
	public CommonEvents selectByValue(By by, String value)
	{
		return null;

	}

	/**
	 * This method is useful to clear the text box before entering any value to the desired text box	
	 * @param by - {@link By} type
	 * @return {@link CommonEvents}
	 */
	public CommonEvents clear(By by)
	{
		return null;

	}

	/**
	 * This method is useful to retrieve the tag name for the respective web element from DOM
	 * @param by - {@link By} type
	 * @return String
	 */
	public String getTagName(By by)
	{
		return "";

	}

	/***
	 * This method is useful to navigate to the desired application url
	 * @param url
	 * @return {@link CommonEvents}
	 * @throws Exception 
	 */
	public CommonEvents navigateTo(String url) throws Exception
	{
		return null;
	}
	

	

}
