package Com.Vtiger.CRM.Generic.Listener;

import Com.Vtiger.CRM.BaseClass.BaseClass;
import Com.Vtiger.CRM.Generic.UtilityClasses.UtilityClass;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.util.Date;

public class ListenerImplemenntation implements ITestListener, ISuiteListener {

    public ExtentReports report;
    public ExtentTest test;

    @Override
    public void onStart(ISuite suite) {
        ISuiteListener.super.onStart(suite);
        String time=new Date().toString().replace(" ","_").replace(":","_");
        ExtentSparkReporter spark=new ExtentSparkReporter("./ExtentReport/ExtentReport_"+time+".html");
        spark.config().setReportName("Vtiger CRM Automation Report");
        spark.config().setDocumentTitle("Vtiger CRM Automation Report");
        spark.config().setTheme(Theme.STANDARD);

        report=new ExtentReports();
        report.attachReporter(spark);
        report.setSystemInfo("OperatingSystem","Windows 10");
        report.setSystemInfo("Browser","Chrome");
    }
    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
        test = report.createTest(result.getMethod().getMethodName());
        test.log(Status.INFO, result.getMethod().getMethodName() + " Test Case Started");
        UtilityClass.setTest(test);
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.log(Status.FAIL,result.getMethod().getMethodName()+" Test Case Failed");
        String MethodName=result.getMethod().getMethodName();
        TakesScreenshot Edriver=(TakesScreenshot) BaseClass.staticdriver;
        String path=Edriver.getScreenshotAs(OutputType.BASE64);
        String time=new Date().toString().replace(" ","_").replace(":","_");
        test.addScreenCaptureFromBase64String(path,MethodName+"_"+time);

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.log(Status.SKIP,result.getMethod().getMethodName()+" Test Case Skipped");
        ITestListener.super.onTestSkipped(result);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS,result.getMethod().getMethodName()+" Test Case Passed");
        ITestListener.super.onTestSuccess(result);
    }



    @Override
    public void onFinish(ISuite suite) {
        ISuiteListener.super.onFinish(suite);
        report.flush();
    }
}
