package org.example.pages;

import org.example.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

@FindBy(name = "ctl00$phBody$SignIn$txtEmail")
    WebElement mobile;

@FindBy(name = "ctl00$phBody$SignIn$txtPassword")
    WebElement password;

@FindBy(id="ctl00_phBody_SignIn_btnLogin")
    WebElement loginBtn;

@FindBy(id="ctl00_imglogo")
WebElement logo;

public LoginPage(){
    PageFactory.initElements(driver,this);
}


public MyAccount setLoginBtn(String mobile2,String password2) throws InterruptedException {
    mobile.sendKeys(mobile2);
    password.sendKeys(password2);
    loginBtn.click();
    Thread.sleep(5000);
//    logo.click();
    return new MyAccount();
}
}
