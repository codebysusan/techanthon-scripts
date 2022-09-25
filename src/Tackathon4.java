import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tackathon4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://webdesignerwall.com/wdw-snippet/table-with-add-and-delete-and-edit-actions");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/button")).click();
		driver.findElement(By.id("name[3]")).sendKeys("abc");
		driver.findElement(By.id("department")).sendKeys("xyz");
		driver.findElement(By.id("phone")).sendKeys("1234567890");
		driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[1]/td[4]/a[2]/i")).click();
		driver.findElement(By.id("/html/body/div/div/table/tbody/tr[1]/td[1]")).sendKeys("xyz");
		driver.findElement(By.xpath("/html/body/div/div/table/tbody/tr[1]/td[4]/a[3]/i")).click();
		
		
		driver.close();

	}

}
