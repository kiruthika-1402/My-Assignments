package week1.day1;

public class Browser {
	
	public String BrowserName(String browserName) {
		System.out.println("Browser launched successfully");
		return browserName;
		
	}
	 public void loadUrl() {
		
		 System.out.println("Application url loaded successfully");

	}
	
	public static void main(String[] args) {
		
		Browser b = new Browser();
		
		b.BrowserName("chrome");
		b.loadUrl();
		
		
		
		
		
	}
	private void launchBrowser(String string) {
		// TODO Auto-generated method stub
		
	}

}
