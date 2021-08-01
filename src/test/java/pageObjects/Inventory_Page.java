package pageObjects;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import base.BasePage;

public class Inventory_Page extends BasePage {
	String locator = "//*[@class='inventory_item']";
	@FindBy(id = "shopping_cart_container") WebElement trolley_button; 
	public Inventory_Page() throws IOException {
		super();
	}
	
	public Inventory_Page selectHighToLowPrice(String value) throws IOException {
		Select drpPriceFilter = new Select(driver.findElement(By.className("product_sort_container")));
		drpPriceFilter.selectByValue(selectSortingType(value));
		
		return new Inventory_Page();
   }
	
   public String selectSortingType(String sortType){
	   String value="";
	   switch(sortType){
	   case("high to low"):
		   value="hilo";
	       break;
	   case("low to high"):
		   value="lohi";
	       break;
	   case("A to Z"):
		   value="az";
	       break;
	   case("Z to A"):
		   value="za";
	       break;
	   }
	   return value;
   }
   
   public void addFirstAndLastItemToCart() throws InterruptedException{
	   int totalCountOfItemsOnPage = driver.findElements(By.xpath(locator)).size();
	   addItemToInventory(1);
	   addItemToInventory(totalCountOfItemsOnPage);
   }
   
   public void addItemToInventory(int itemCount) throws InterruptedException{
	   driver.findElement(By.xpath(String.format(locator+"["+itemCount+"]//button[.='Add to cart']"))).click();
   }
   
   public void clickOnTrolleyButton() throws InterruptedException, IOException {
		waitAndClickElement(trolley_button);
	   
   }
}
