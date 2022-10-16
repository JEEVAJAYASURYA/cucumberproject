package org.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static Actions a;
	public static Robot r;
	public static Alert b;
	public static JavascriptExecutor js;
	public static void launchChrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	public static void winMax() {
		driver.manage().window().maximize();

	}
	public static void launchUrl(String url) {
		driver.get(url);
	}
	public static void printTitle() {
		System.out.println(driver.getTitle());

	}
	public static void printCurrentTitle() {
		System.out.println(driver.getCurrentUrl());

	}
	public static void passValue(WebElement ele,String value) {
	ele.sendKeys(value);
	}
	public static void buttonClick(WebElement elu) {
		elu.click();

	}
	public static void closeUrl() {
		driver.close();

	}
	public static void quiteUrl() {
		driver.quit();

	}
	public static void printGetText(String url) {
		System.out.println(url);

	}
	public static void printGetAttribute(String url) {
		System.out.println(url);

	}
	public static void moveToElement(WebElement f) {
		a= new Actions(driver);
		a.moveToElement(f).perform();

	}
	public static void moveToOracle(WebElement r) {
		a.moveToElement(r).perform();

	}
	public static void moveToSql(WebElement g) {
		
a.moveToElement(g).click().perform();
	} 
	public static void doubleClick(WebElement e) {
		a=new Actions(driver);
		a.doubleClick(e).perform();

	}
	public static void contextClick(WebElement e) {
		a=new Actions(driver);
		a.contextClick(e).perform();

	}
	public static void dragAndDrop(WebElement src,WebElement des) {
		a=new Actions(driver);
		a.dragAndDrop(src, des);

	}
	public static void down() throws AWTException {
		r=new Robot();
		for (int i = 0; i < 3; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
			
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);

	}
	public static void simpleAlert() {
		b=driver.switchTo().alert();
		System.out.println(b.getText());
		b.accept();

	}
	public static void confirmAlert() {
		b=driver.switchTo().alert();
		System.out.println(b.getText());
		b.accept();

	}
	public static void promptAlert() {
		b=driver.switchTo().alert();
		System.out.println(b.getText());
		b.sendKeys("shalini");
		b.accept();

	}
	public static void executeScriptMethod(String s,WebElement url) {
		js=(JavascriptExecutor)driver;
		js.executeScript(s, url);
		System.out.println(url);
		

	}
	public static void scrollMethod(String s,WebElement url) {
		
		js=(JavascriptExecutor)driver;
		js.executeScript(s, url);
	}
	public static void navigateRefresh() {
		driver.navigate().refresh();

	}
	public static void forward() {
		driver.navigate().forward();

	}
	public static void back() {
		driver.navigate().back();

	}
	public static void url(String src) {
		driver.navigate().to(src);

	}
	public static void frame(String url) {
		driver.switchTo().frame(url);

	}
	public static  String getData(int row,int cellu) throws IOException {
		File f = new File("C:\\Users\\HP\\eclipse-workspace\\EtsyProject\\src\\test\\resources\\TestData\\TOOLS.xlsx");
		FileInputStream fin = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fin);
		Sheet s = w.getSheet("surya");
		Row r = s.getRow(row);
		Cell c = r.getCell(cellu);
		int cell = c.getCellType();
		String value="";
		if (cell==1) {
			 value = c.getStringCellValue();
		}
		else if (DateUtil.isCellDateFormatted(c)) {
			Date d = c.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd/MMM/YYYY");
			 value = sim.format(d);
			
		}
		else {
			double d = c.getNumericCellValue();
			long l=(long)d;
			 value = String.valueOf(d);
		}
return value;
	}
	public static void screenShot(String name) throws IOException {
		TakesScreenshot t = (TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\HP\\Documents\\workspace\\HotelsCom\\target\\Screenshot"+name+".jpg");
		FileUtils.copyFile(src, des);
		
	
	}

}
