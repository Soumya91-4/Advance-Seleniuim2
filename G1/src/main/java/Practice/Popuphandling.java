package Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popuphandling {

	

	@SuppressWarnings("null")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C://driver//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://192.169.81.88:8086/Account/Login/?ReturnUrl=%2F");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.name("Username")).sendKeys("N002");
		driver.findElement(By.name("Password")).sendKeys("@csy123");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement component = driver.findElement(By.linkText("Lookups"));
        js.executeScript("arguments[0].scrollIntoView(true)",component);
        component.click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("Project Management")).click();
        driver.findElement(By.linkText("Task Types")).click();
        Thread.sleep(6000);
        driver.findElement(By.className("button-inner")).click();
        Thread.sleep(4000);
        driver.findElement(By.name("TaskType")).sendKeys("Aaaa2");
        driver.findElement(By.name("TaskTypeDesc")).sendKeys("aa2");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@id=\"ProWorks_Lookups_TaskTypeDialog8_Toolbar\"]/div/div[1]/div/div[1]/div/span")).click();
        Thread.sleep(15000);
       // driver.findElement(By.xpath("/html/body/div[5]/div[1]/button/i")).click();
     //   WebElement Tasktype=driver.findElement(By.linkText("Task type2"));
        JavascriptExecutor js1=(JavascriptExecutor)driver;
        WebElement component1 = driver.findElement(By.linkText("Aaaa2"));
        js1.executeScript("arguments[0].scrollIntoView(true)",component1);
        Thread.sleep(4000);
        WebElement component2 = null;
		if(component2==driver.findElement(By.linkText("Aaaa2")))
        		{
        	component2.click();
        	
        		}
        else {
        	System.out.println("Task type not found");
        }
        
        
        

	}

}
