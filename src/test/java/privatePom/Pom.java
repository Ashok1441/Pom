package privatePom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	
	
	 	@FindBy(name="uid") private WebElement userName;
	    @FindBy(name="password") private WebElement password; 
	    @FindBy(name="btnLogin") private WebElement login;
	    
public Pom() {
	PageFactory.initElements(Login.driver, this);
	}
	    
public WebElement getUserName() {
	return userName;
	
}

public void setUserName(String un) {
	userName.sendKeys(un);
}

public WebElement getPassword() {
	return password;
	
}

public void setPassword(String pwd) {
	password.sendKeys(pwd);
}

public void loginBtn() {
	login.click();
}
	    public void loginToApp(String un, String pwd) {
	    	userName.sendKeys(un);
	    	password.sendKeys(pwd);	
	    	login.click();
	    }
	    
	    
	    
}
