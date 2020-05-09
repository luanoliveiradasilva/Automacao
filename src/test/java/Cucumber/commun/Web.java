package Cucumber.commun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.pt.Dado;

public class Web {

	private static WebDriver driver;

	/**
	 * Método para retornar o webdriver, permitindo a <b> interação com os elementos
	 * </b> do navegador.
	 * 
	 * @return
	 * @author Luan
	 * 
	 */
	public static WebDriver browser() {
		return driver;
	}

	@Dado("que abro o navegador {string}")
	public void queAbroONavegador(String navegador) {
		try {

			if(navegador.equals("Chrome")) {
				 System.setProperty("webdriver.chrome.driver", "../Automacao/resource/drivers/chromedriver.exe");
				driver = new ChromeDriver();
			}
			driver.manage().window().maximize();

		} catch (Exception e) {
			System.out.println("Não foi possível abrir " + navegador + "\n " + e);
		}
	}

	@Dado("e que estou na pagiba web {string}")
	public void eQueEstouNaPagibaWeb(String site) {
		try {
			if (site != null) {
				driver.get(site);
			} else {
				System.out.println("Site invalido!");
			}
		} catch (Exception e) {

			System.out.println("Não foi possível localizar o seu site. ");
		}
	}

}
