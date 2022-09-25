import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tachathon3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
		driver.findElement(By.id("iFrame")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div/div[1]/a[3]")).click();
		//driver.close();

	}

}
