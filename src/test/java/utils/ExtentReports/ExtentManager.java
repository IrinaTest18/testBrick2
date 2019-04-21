package utils.ExtentReports;

import com.relevantcodes.extentreports.ExtentReports;

//OB: ExtentReports extent instance created here. That instance can be reachable by getReporter()

public class ExtentManager
{
    private static ExtentReports extent;

    public synchronized static ExtentReports getReporter(){
        if(extent == null){
            //Set HTML reporting file location
//            String workingDir = System.getProperty("user.dir");
//            extent = new ExtentReports(workingDir+"\\ExtentReports\\ExtentReportResults.html", true);
            extent = new ExtentReports("C:\\Users\\MichaelY\\Documents\\GitHub\\testBrick2_ssh\\src\\test\\Screenshots\\MyReport.html",true);
        }
        return extent;
    }
}
