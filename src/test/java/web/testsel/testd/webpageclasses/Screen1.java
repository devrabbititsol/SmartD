package web.testsel.testd.webpageclasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import com.utilities.BaseClass;import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

@SuppressWarnings("unused")
public class Screen1 extends BaseClass {
	
	public static String primaryInfo  = "{\"user_id\":7,\"is_generate\":false,\"is_execute\":false,\"is_web\":true,\"project_url\":\"https://www.devrabbit.com/\",\"report_upload_url\":\"http://192.168.1.144:80/UploadReportFile\",\"project_name\":\"TestSel\",\"project_description\":\"ds\",\"project_id\":271,\"module_name\":\"TestD\",\"module_description\":\"sdf\",\"sub_module_id\":0,\"module_id\":419,\"testcase_name\":\"TC1\",\"testcase_id\":452,\"testset_id\":0,\"executed_timestamp\":2010471972,\"browser_type\":\"chrome\"}";

	public static String projectName = "testsel";
	public WebDriver driver;
	public ExtentReports reports;
	public ExtentTest test;
	public static final int datasetsLength = 1;

	public Screen1(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//LI[@id='menu-item-1476']/A[1]")	
	private WebElement	Contact_307622A;
	public String clkAContact_307622() {
		waitForExpectedElement(driver, Contact_307622A);		
		String text = Contact_307622A.getText();
		Contact_307622A.click();
		return text;
	}

}