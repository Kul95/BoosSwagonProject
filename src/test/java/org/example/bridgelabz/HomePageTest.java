package org.example.bridgelabz;

import org.example.base.TestBase;
import org.example.pages.HomePage;
import org.example.pages.LoginPage;
import org.example.pages.MyAccount;
import org.example.pages.SignupPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    LoginPage loginPage;
    SignupPage signupPage;
    HomePage homePage;
    MyAccount myAccount;

    public HomePageTest(){
        super();
    }


    @BeforeMethod
    public void setHomePage1() throws InterruptedException {
        initialization();
        signupPage=new SignupPage();
       // loginPage=new LoginPage();
        loginPage=signupPage.login();
        myAccount=loginPage.setLoginBtn(props.getProperty("mobile"),props.getProperty("password"));
        homePage=myAccount.setMyAccount();
    }
    @Test
    public void setHomePage() throws InterruptedException {
       homePage.homePage1();
    }

}
