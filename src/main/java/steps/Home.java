package steps;

import cucumber.api.java.en.And;
import pages.HomePage;

public class Home {
	
	public HomePage homePage = new HomePage();
	
	@And("clique no menu Accouts")
	public void e_clique_no_menu_Accouts() throws InterruptedException {
		Thread.sleep(5000);
		homePage.accountClick();
		
	}
	
	@And("clique no menu Suppliers")
	public void e_clique_no_menu_Suppliers() throws InterruptedException {
		homePage.suppliers();
	}

}
