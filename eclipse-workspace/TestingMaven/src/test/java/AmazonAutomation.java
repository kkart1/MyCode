import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonAutomation {

	public static void main(String[] args) 
	{
		
		
		
		// TODO Auto-generated method stub
		
		System.setProperty("driver.chrome.webdriver", "C:\\Users\\karthick.kesavan\\Downloads\\chromedriver-win64 (1)\\chromedriver.exe");
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		WebElement element=driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("samsung");
		WebElement search=driver.findElement(By.id("nav-search-submit-button"));
		search.click();
		driver.quit();
	}

}
