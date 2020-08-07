package Test;

import org.testng.annotations.Test;

import pages.LoginPage;
import pages.homePage;

public class GmailTest {
	
@Test

public void gmailrun() {
	

homePage Home = new homePage ();

Home.OpenBrowser();
Home.VerifyTitle();
Home.VerifyURL();
Home.signIn();


LoginPage Login = new LoginPage();

Login.loginDiploma();
Login.BrowserClose();

}

}









