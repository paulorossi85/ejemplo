package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
	private WebDriver driver;
    public BasePage(WebDriver driver){
        this.driver = driver;
    }
	
	public WebDriver conection () {
		
		System.setProperty("webdriver.chrome.driver", "/home/prossi/eclipse-workspace/SeleniumPOMSimple/chromedriver");
        driver = new ChromeDriver();
        return driver;
	}
	
	public void visit(String url){
        driver.get(url);
    }
	
	public  void click(By locator){
        driver.findElement(locator).click();
    }
    
    public  void sendKeys(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }
	
}
