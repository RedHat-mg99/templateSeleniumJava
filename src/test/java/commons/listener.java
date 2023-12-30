package commons;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener {
    public WebDriver driver;
    
    public void onTestStart(ITestResult result){
        System.out.println("Testcase is Starting...");
    }

    public void onTestSuccess(ITestResult result){
        System.out.println("Testcase is Successfully");
    }

    public void onTestFailure(ITestResult result){
        System.out.println("Test Failed - Screenshot captured...");
    }

    public void onTestSkipped(ITestResult result){
        System.out.println("Test Failed - Testcase skipped...");
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result){
        System.out.println("Test Failure with Success Percentage...");
    }

    public void onTestFailureWithTimeout(ITestResult result){
        System.out.println("Test Failure with Timeout - Screenshot captured...");
    }

    public void onFinish(ITestResult result){
        System.out.println("On Test Finished");
    }

    public void onStart(ITestResult result){
        System.out.println("On Test Started");
    }

}
