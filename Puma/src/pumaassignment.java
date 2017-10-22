import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class pumaassignment {
	
static {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}



public static void main(String[] args) throws InterruptedException {
	
	    WebDriver driver = new ChromeDriver();
		driver.get("https://in.puma.com/");
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.className("digimeg-nav-item"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
		driver.findElement(By.xpath("//a[text()='ByShoes']"));
		driver.findElement(By.xpath("//a[text()='Running']")).click();
		Thread.sleep(1000);
        driver.findElement(By.className("product-collection-image-60116")).click();
        driver.findElement(By.className("product-size-click")).click();
        driver.findElement(By.className("swatch-label2")).click();
        driver.findElement(By.className("add-to-cart-buttons")).click();
        driver.findElement(By.partialLinkText("https://in.puma.com/speed-ignite-netfit-men-s-running-shoes-18993701.html"));
        driver.findElement(By.className("price"));
        driver.findElement(By.name("cart[712182][qty]"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       
}
	
	
	
	

}
