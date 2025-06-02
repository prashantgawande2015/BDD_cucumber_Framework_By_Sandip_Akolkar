package com.qa.util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

/**
 * This class has common method to capture screenshot & return it into 'byte' format
 * to embed into 'cucumber reports'
 */




/**
 * this method will capture screenshot & return it in 'byte' format to 
 * embed in cucumber format
 * 
 */
public class CaptureScreenshot {
	public static byte[] captureImage(WebDriver driver) {

		TakesScreenshot srcShot = (TakesScreenshot) driver;

		byte[] srcFile = srcShot.getScreenshotAs(OutputType.BYTES);

		return srcFile;

	}
	
}
