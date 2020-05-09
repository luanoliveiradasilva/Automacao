package WebDriver.runner;

import org.junit.Test;

import WebDriver.Enum.EnumBrowser;
import WebDriver.common.ExecutionDriver;

public class Teste extends ExecutionDriver {

	public Teste() {
		executionBrowser(EnumBrowser.CHROME);
	}

	@Test
	public void Teste() {

	}

}
