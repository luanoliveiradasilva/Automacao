package WebDriver.object;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FuncRegistrar {
	
	private static WebDriver driver;

	/**
	 * M�todo para retornar o webdriver, permitindo a <b> intera��o com os elementos
	 * </b> do navegador.
	 * 
	 * @return
	 * @author Luan
	 * 
	 */
	public static WebDriver browser() {
		return driver;
	}

	/*
	 * Clicar no bot�o registrar.
	 */
	public void clicarMenuRegistrar() throws Exception{		
		WebElement validarPagina = driver.findElement(By.name("REGISTRO"));
		validarPagina.click();		
	}
	
	
}
