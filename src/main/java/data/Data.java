package data;

import utils.Xls_Reader;

public class Data {
	
	Xls_Reader d = new Xls_Reader("D:\\Selenium_workspace\\MavenAmazonpractice\\src\\main\\java\\resources\\amazon.xlsx");
	public  String correctEmail = d.getCellData("login","email",2);
	public  String correctPassword = d.getCellData("login", "password", 2);
		
	
	
}
