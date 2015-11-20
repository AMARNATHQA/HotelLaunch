package com.hotel.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class genericUtils {
	
	public static WebDriver driver=null;
	
	public void clickWebElement(WebElement we){
		we.click();
	}
	
	public void mouseHoverOnWebElementActions(WebElement we){
		Actions  actObj=new Actions(driver);
		actObj.moveToElement(we).build().perform();
	}
	
	public void dragAndDropActions(WebElement src,WebElement dest){
		Actions  actObj=new Actions(driver);
		actObj.dragAndDrop(src, dest).build().perform();
	}
	
	public void explicitwait(WebElement we,int timeVal){
	    WebDriverWait wait	=new WebDriverWait(driver,timeVal);
	   wait.until(ExpectedConditions.visibilityOf(we));
	}

	public void ValidateTextEnter(WebElement we){
		
	}
	
	public void checkBoxClick(){}
	
	public void mouseHoverOnWebElementJavaScript(){}
	
	public void dragAndDropActionsJavaScript(){}
	
	public void stringToInt(){}
	
	
}
