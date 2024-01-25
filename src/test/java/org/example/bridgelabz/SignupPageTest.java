package org.example.bridgelabz;

import org.example.base.TestBase;
import org.example.pages.SignupPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignupPageTest extends TestBase {
    SignupPage signupPage;
public SignupPageTest(){
    super();
}
@BeforeMethod
public void setup(){
    initialization();
    signupPage=new SignupPage();
}
    @Test
    public void m2(){
        signupPage.login();
    }

@Test
    public void mySignupTest() throws InterruptedException {
    signupPage.SignupPage(props.getProperty("name"),props.getProperty("mobile"),props.getProperty("password"),props.getProperty("confirmPassword"));
}


}
