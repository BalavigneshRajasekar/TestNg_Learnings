package regression;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Utilities extends SetupConfig {

	public void screenshot() {
		String s_sName = new Date().toString().replace(" ", "_").replace(":", "-");
		System.out.println(s_sName);
		File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotFile, new File(".//screenshots/" + s_sName + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("error" + e);
			e.printStackTrace();
		}

	}
}
