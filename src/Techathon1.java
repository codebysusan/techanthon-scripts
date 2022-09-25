import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Techathon1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Selenium1\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		FileInputStream fis = new FileInputStream("E:\\Hachathon.xlsx");
//		XSSFWorkbook workbook = new XSSFWorkbook(fis);
//		XSSFSheet sheet = workbook.getSheetAt(0);
//		
//		Row row = sheet.getRow(0);
//		Cell cell = row.getCell(0);
//		System.out.println(cell);
//		System.out.println(sheet.getRow(0).getCell(0));
		driver.get("https://www.globalsqa.com/samplepagetest/");
		driver.findElement(By.name("file-553")).sendKeys("C:\\\\Users\\\\om\\\\Pictures\\\\images(36).png");
		

		driver.findElement(By.id("g2599-name")).sendKeys("abc");
		driver.findElement(By.id("g2599-email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("g2599-website")).sendKeys("www.abc.com");
		driver.findElement(By.id("g2599-experienceinyears")).sendKeys("1-3");
		driver.findElement(By.name("g2599-expertise[1]")).click();
		driver.findElement(By.xpath("//*[@id=\"contact-form-2599\"]/form/button")).click();
		
		driver.findElement(By.id("contact-form-comment-g2599-comment")).sendKeys("This is testing");

		driver.close();
	}

}
