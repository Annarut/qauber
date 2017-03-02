import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFox {

	public static void main(String[] args) {
		FirefoxDriver fd = new FirefoxDriver();
		fd.get("http://testwave.qabidder.net/#/page/register-sa");

		String title = fd.getTitle();
		System.out.println(title);
		
		String url = fd.getCurrentUrl();
		System.out.println(url);
		
		
		WebElement nameTextBox = fd.findElement(By.xpath("html/body/div[2]/div/div/div[1]/div/div[2]/form/div[1]/input"));
		nameTextBox.sendKeys("Anna");
		
		WebElement emailTextBox = fd.findElement(By.xpath("html/body/div[2]/div/div/div[1]/div/div[2]/form/div[2]/input"));
		emailTextBox.sendKeys("qatest.er1214@mailinator.com");
        
		WebElement passwordTextBox = fd.findElement(By.xpath(".//*[@id='id-password']"));	
        passwordTextBox.sendKeys("123456test");
        
        WebElement retypePasswordTextBox = fd.findElement(By.xpath("html/body/div[2]/div/div/div[1]/div/div[2]/form/div[4]/input"));
        retypePasswordTextBox.sendKeys("123456test");
        
        WebElement continueRegistrationButton = fd.findElement(By.xpath("html/body/div[2]/div/div/div[1]/div/div[2]/form/button"));
        continueRegistrationButton.click();
        
        WebElement signInButton = fd.findElement(By.xpath("html/body/div[2]/div/div/div[1]/div/div[2]/a"));
        signInButton.click();
        
        
	}

}
