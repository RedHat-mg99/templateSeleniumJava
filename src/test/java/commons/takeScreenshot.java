package commons;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class takeScreenshot {

    public WebDriver driver;
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");

    public static void captureScreenshot(WebDriver driver, String name) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File theDir = new File("./Output/Screenshots/");
        if (!theDir.exists()) {
            theDir.mkdirs();
        }
        FileHandler.copy(source, new File("./Output/Screenshots/" + /*result.getName()*/ name + dateFormat.format(new Date()) + ".png"));
    }
}
