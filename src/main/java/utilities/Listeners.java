package utilities;

import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.IOException;

public class Listeners extends CommonOps implements ITestListener {

    /**
     * Invoked before running all the test methods belonging to the classes inside the &lt;test&gt;
     * tag and calling all their Configuration methods.
     *
     */
    public void onStart(ITestContext execution) {
        System.out.println("----------     Starting Execution     ----------");
    }

    /**
     * Invoked after all the test methods belonging to the classes inside the &lt;test&gt; tag have
     * run and all their Configuration methods have been called.
     *
     */
    public void onFinish(ITestContext execution) {
        System.out.println("----------     Ending Execution     ----------");
    }

    /**
     * Invoked each time before a test will be invoked. The <code>ITestResult</code> is only partially
     * filled with the references to class, method, start millis and status.
     *
     */
    public void onTestStart(ITestResult test) {
        System.out.println("----------     Starting Test: " + test.getName() + "     ----------");

        // Start recording video at every test start
        try {
            MonteScreenRecorder.startRecord(test.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Invoked each time a test succeeds.
     *
     */
    public void onTestSuccess(ITestResult test) {
        // Delete the file Video from local directory after test passed
        try {
            File file = new File("./test-recordings/" + test.getName() + ".avi");
            if (file.delete())
                System.out.println("----------     File deleted successfully     ----------");
            else
                System.out.println("----------     Failed to delete file     ----------");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("----------     Test: " + test.getName() + " Passed     ----------");
    }

    /**
     * Invoked each time a test fails.
     *
     */
    public void onTestFailure(ITestResult test) {
        // Save Screenshot in local folder
        TakesScreenshot ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file, new File("./ScreenShots/" + test.getName() + ".jpg"));
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        // Take ScreenShot for report
        saveScreenshot();

        System.out.println("----------     Test: " + test.getName() + " Failed     ----------");
    }

    /**
     * Invoked each time a test is skipped.
     *
     */
    public void onTestSkipped(ITestResult test) {
        System.out.println("----------     Skipping Test: " + test.getName() + "     ----------");
    }

    /**
     * Invoked each time a method fails but has been annotated with successPercentage and this failure
     * still keeps it within the success percentage requested.
     *
     */
    public void onTestFailedButWithinSuccessPercentage(ITestResult test) {
        // not implemented
    }

    /**
     * Invoked each time a test fails due to a timeout.
     *
     */
    public void onTestFailedWithTimeout(ITestResult result) {
        onTestFailure(result);
    }

    /**
     * take screen-shot
     *
     */
    @Attachment(value = "Page Screenshot", type = "image/png")
    public byte[] saveScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
