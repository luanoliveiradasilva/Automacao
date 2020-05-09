package WebDriver.common;

import javax.swing.JOptionPane;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import WebDriver.Enum.EnumBrowser;
import WebDriver.Enum.EnumSite;

public class ExecutionDriver {

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

	private void selecionarSite(EnumSite selectSite) throws Exception {
		try {
			if (selectSite.equals(selectSite.NEWTOUR)) {
				driver.get(selectSite.getSite());
			} else {
				System.out.println("Site invalido!");
			}
		} catch (Exception e) {
			System.out.println("Não foi possível localizar o seu site. ");
		}

	}

	public void executionBrowser(EnumBrowser browser) {
		try {
			switch (browser) {
			case CHROME:
				if (browser.values() != null) {
					System.setProperty("webdriver.chrome.driver", browser.getBrowser());
					driver = new ChromeDriver();
				}
				break;

			default:
				break;
			}

			driver.manage().window().maximize();
			selecionarSite(EnumSite.NEWTOUR);

		} catch (Exception e) {
			System.out.println("Não foi possível abrir " + browser + "\n " + e);
		}

	}

}
