package org.example.pages;

import org.example.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage extends TestBase {
@FindBy(name="ctl00$phBody$SignUp$txtName")
    WebElement name;
@FindBy(name="ctl00$phBody$SignUp$txtEmail")
    WebElement mobile;

@FindBy(name="ctl00$phBody$SignUp$btnContinue")
    WebElement continueBtn;
@FindBy(name="ctl00$phBody$SignUp$txtPassword")
    WebElement password;

@FindBy(name="ctl00$phBody$SignUp$txtConfirmPwd")
    WebElement confirmPassword;

@FindBy(id="ctl00_phBody_SignUp_btnSubmit")
    WebElement signUp;
@FindBy(xpath = "//a[@class='btn btn-block  themebackground text-white loginlink']")
WebElement login;
public SignupPage(){
    PageFactory.initElements(driver,this);
}
public LoginPage login(){
    login.click();
    return new LoginPage();

}

public void SignupPage(String name1,String mobile1,String password1,String confirmPassword1 ) throws InterruptedException {
name.sendKeys(name1);
mobile.sendKeys(mobile1);
Thread.sleep(20000);
continueBtn.click();
password.sendKeys(password1);
confirmPassword.sendKeys(confirmPassword1);
signUp.click();

}
}
