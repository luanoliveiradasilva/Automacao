package WebDriver.Enum;

public enum EnumSite {
	
	NEWTOUR("http://newtours.demoaut.com/");
	
	String site;
	
	private EnumSite(String site) {
		this.site = site;
	}

	public String getSite() {
		return site;
	}
}
