package WebDriver.Enum;

public enum EnumBrowser {
	
	CHROME("../Automacao/resource/drivers/chromedriver.exe");
	
	String browser;
	
	private EnumBrowser(String browser) {
		this.browser = browser;
	}

	public String getBrowser() {
		return browser;
	}
	
}
