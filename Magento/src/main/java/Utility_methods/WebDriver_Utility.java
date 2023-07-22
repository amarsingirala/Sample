package Utility_methods;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;




public class WebDriver_Utility {
	WebDriver driver;
	
	public void maximize()
	{
		driver.manage().window().maximize();
	}
	
	public void minimize()
	{
		driver.manage().window().minimize();
	}
	
	public void close()
	{
		driver.close();
	}
	
	public void quite()
	{
		driver.quit();
	}
	
	public void forward()
	{
		driver.navigate().forward();
	}
	
	public void back()
	{
		driver.navigate().back();
	}
	
	public void refresh()
	{
		driver.navigate().refresh();
	}
	
	public void Dimension(int width, int height)
	{
		Dimension d=new Dimension(width, height);
		driver.manage().window().setSize(d);
	}
	
	public void position(int x,int y)
	{
	    Point p=new Point(x, y);
		driver.manage().window().setPosition(p);
	}
	
	public void xpath(String key)
	{
		driver.findElement(By.xpath(key));
	}
	
	public void moveTo(WebElement ele)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	public void rightclick(WebElement ele)
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele).contextClick().build().perform();
	}
	
	public void doubleclick()
	{
		Actions act=new Actions(driver);
		act.doubleClick();
	}
	
	public void draganddrop(WebElement ele1, WebElement ele2)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(ele1, ele2).perform();
	}
	
	public void Scrolling(int x, int y)
	{
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollby("+x+","+y+");");
	}
	public void doprdownByindex(WebElement ele, int index_value)
	{
		Select s=new Select(ele);
		s.selectByIndex(index_value);
	}
	public void dropdownByvalue(WebElement ele, String value)
	{
		Select s=new Select(ele);
		s.selectByValue(value);
	}
	public void dropdownBytext(WebElement ele, String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public void Screenshot(String path) throws Throwable
	{
		TakesScreenshot sh=(TakesScreenshot)driver;
		File src=sh.getScreenshotAs(OutputType.FILE);
		File dist=new File(path);
		Files.copy(src, dist);
		
	}
	

	


}
