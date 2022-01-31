package tests;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebElement;
import page.GooglePage;


public class TestNgBusqueda {
	
	private WebDriver driver;
	GooglePage googlePage;
	String url = "https://www.google.com/";
  
	   @BeforeClass
	  public void beforeClass() {
			googlePage = new GooglePage(driver);
			driver = googlePage.conection();
			googlePage.visit(url);
	  }
	  	
	@Test
  public void f() throws InterruptedException {
		 Thread.sleep(2000);
		 googlePage.busqueda();
		 Assert.assertEquals("ole - Buscar con Google", driver.getTitle());
		 List<WebElement> pagina= driver.findElements(By.tagName("h3"));
		 for(WebElement e : pagina) {
			  System.out.println(e.getText());		
		 }
	}
	
	  @AfterClass
	  public void AfterClass() {
	  //driver.quit();
	  }


}
