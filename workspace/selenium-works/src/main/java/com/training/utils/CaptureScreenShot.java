package com.training.utils;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureScreenShot {

	private WebDriver driver;

	public CaptureScreenShot(WebDriver driver) {
		this.driver = driver;
	}

	public void screenShot() throws IOException {
		String path = "/Volumes/Kanchan/MyTrainings/sapient-fresher-2020-sep/screenshot/";
		String fileName = "";

		GregorianCalendar gc = new GregorianCalendar();
		int date = gc.get(Calendar.DATE);
		int minute = gc.get(Calendar.MINUTE);
		int second = gc.get(Calendar.SECOND);

		fileName = Integer.valueOf(date).toString() + "-" + Integer.valueOf(minute).toString() + "- "
				+ Integer.valueOf(second).toString() + ".png";

		TakesScreenshot takeScreenshot = (TakesScreenshot) driver;

		File file = takeScreenshot.getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(file, new File(path + fileName));

	}

	public void screenShot(String fileName) throws IOException {
		String path = "/Volumes/Kanchan/MyTrainings/sapient-fresher-2020-sep/screenshot/";
		TakesScreenshot takeScreenshot = (TakesScreenshot) driver;
		File file = takeScreenshot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(path + fileName));
	}

}
