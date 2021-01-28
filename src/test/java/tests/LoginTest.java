package tests;

import org.testng.annotations.Test;

import baseTest.BaseTest;
import data.Data;
import pages.HomePage;
import pages.LoginPage;
import utils.Xls_Reader;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
	
public class LoginTest extends BaseTest {
	LoginPage lp;
	Data d;
	HomePage hp;
	
  public LoginTest() throws IOException {
		super();	
	}

  @BeforeMethod
  public void beforeMethod() throws IOException {
	  openBrowser();
	  openAmazon();
	  lp= new LoginPage();
	  d = new Data();
	  hp = new HomePage();
  }

  @AfterMethod
  public void afterMethod() {
	  closeBroser();
  }
  @Test
  public void logInTest() throws IOException {
	hp = lp.login(d.correctEmail, d.correctPassword);
  }

}
