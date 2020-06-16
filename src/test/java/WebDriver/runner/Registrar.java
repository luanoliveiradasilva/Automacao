package WebDriver.runner;

import org.junit.Test;

import WebDriver.Enum.EnumBrowser;
import WebDriver.common.ExecutionDriver;

public class Registrar extends ExecutionDriver {

	public Registrar() {
		executionBrowser(EnumBrowser.CHROME);
	}

	@Test
	public void registro() {
		
	}

}
