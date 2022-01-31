package tests;

import org.testng.annotations.Test;

import page.GooglePage;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class BusquedaTest {
	private WebDriver driver;
	GooglePage googlePage;
	String url = "https://www.google.com/";
  
	 @BeforeClass
  public void beforeMethod() {
	googlePage = new GooglePage(driver);
	driver = googlePage.conection();
	googlePage.visit(url);
  
  }

  @Test
  public void f() {
	  googlePage.busqueda();
	  
  }
  
  @AfterClass
  public void AfterClass() {
  driver.quit();
  }

}
