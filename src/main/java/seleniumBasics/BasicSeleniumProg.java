package seleniumBasics;

public class BasicSeleniumProg {

	public static void main(String[] args) {
		BaseUtil bu= new BaseUtil();
		bu.init_Browser("Firefox");
		//System.out.println("Firefox browser opened successfully");
		bu.launchURL("https://www.facebook.com/");
		//System.out.println("URL launch successfully");
		String title = bu.getPageTitle();
		System.out.println(title);
		
		bu.closeBrowser();

	}

}
