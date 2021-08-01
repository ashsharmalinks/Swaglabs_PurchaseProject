package Utilities;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import pageObjects.Cart_Page;
import pageObjects.CheckOutComplete_Page;
import pageObjects.CheckOutOverView_Page;
import pageObjects.CheckOut_Page;
import pageObjects.Inventory_Page;
import pageObjects.Purchase_Page;

public class DriverFactory {
	public static WebDriver driver;
	public static Purchase_Page purchasePage;
	public static Inventory_Page inventoryPage;
	public static Cart_Page cartPage;
	public static CheckOut_Page checkOutPage;
	public static CheckOutOverView_Page checkOutOverviewPage;
	public static CheckOutComplete_Page checkOutCompletePage;

	@SuppressWarnings("deprecation")
	public WebDriver getDriver() {
		try {
			// Read Config
			Properties p = new Properties();
			FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resource\\properties\\config.properties");
			p.load(fi);
			String browserName = p.getProperty("browser");

			switch (browserName) {

			case "firefox":
				// code
				if (null == driver) {
					System.setProperty("webdriver.gecko.driver", Constant.GECKO_DRIVER_DIRECTORY);
					DesiredCapabilities capabilities = DesiredCapabilities.firefox();
					capabilities.setCapability("marionette", true);
					driver = new FirefoxDriver();
				}
				break;

			case "chrome":
				// code
				if (null == driver) {
					System.setProperty("webdriver.chrome.driver", Constant.CHROME_DRIVER_DIRECTORY);
					// CHROME OPTIONS
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				}
				break;

			case "ie":
				// code
				if (null == driver) {
					DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
					System.setProperty("webdriver.ie.driver", Constant.IE_DRIVER_DIRECTORY);
					capabilities.setCapability("ignoreZoomSetting", true);
					driver = new InternetExplorerDriver(capabilities);
					driver.manage().window().maximize();
				}
				break;
			}
		} catch (Exception e) {
			System.out.println("Unable to load browser: " + e.getMessage());
		} finally {
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			purchasePage = PageFactory.initElements(driver, Purchase_Page.class);
		 	inventoryPage = PageFactory.initElements(driver,Inventory_Page.class);
		 	cartPage = PageFactory.initElements(driver,Cart_Page.class);
		 	checkOutPage = PageFactory.initElements(driver,CheckOut_Page.class);
		 	checkOutOverviewPage = PageFactory.initElements(driver,CheckOutOverView_Page.class);
		 	checkOutCompletePage = PageFactory.initElements(driver,CheckOutComplete_Page.class);
		}
		return driver;
	}
}
