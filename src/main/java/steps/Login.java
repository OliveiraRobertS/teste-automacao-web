package steps;

import cucumber.api.java.en.When;
import pages.LoginPage;

public class Login {
	
	public LoginPage loginPage = new LoginPage();
	
	@When("que eu entrei no sistema")
	public void que_eu_entrei_no_sistema() {
		loginPage.login();
	}

}
