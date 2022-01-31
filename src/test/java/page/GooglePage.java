package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GooglePage extends BasePage {
	private By btnBuscar = By.cssSelector("center:nth-child(1) > .gNO89b");
	private By nameText = By.name("q");
	private String texto = "ole";
	
	public GooglePage(WebDriver driver) {
		
		super(driver);	
	}

public void busqueda () {
	
	sendKeys(texto,nameText); 
	click(btnBuscar);
}


}
