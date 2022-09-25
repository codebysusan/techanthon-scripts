import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Techathon2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("https://jqueryui.com/datepicker/#date-range");
	    Thread.sleep(5000);
	    Date dt = new Date();
	    Calendar calendar = Calendar.getInstance();
	    calendar.setTime(dt);
	    calendar.add(Calendar.DATE, 5);
	    dt = calendar.getTime();
	    String departdate = new SimpleDateFormat("dd/mm/yyyy").format(dt);

	    //enter Journy date in the field
	    WebElement depart = driver.findElement(By.id("from"));
	    depart.sendKeys(departdate);

	    Date dt1 = new Date();
	    Calendar calendar1 = Calendar.getInstance();
	    calendar1.setTime(dt1);
	    calendar1.add(Calendar.DATE, 6);
	    dt1 = calendar1.getTime();
	    String returndate = new SimpleDateFormat("dd/mm/yyyy").format(dt1);

		driver.close();

	}

}
