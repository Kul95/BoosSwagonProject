package org.example.pages;

import org.example.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {
    @FindBy(xpath = "//input[@id='inputbar']")
    WebElement search;
    @FindBy(xpath = "//input[@id='btnTopSearch']")
    WebElement searchClick;
    @FindBy(partialLinkText = "Indian Polity For Civil Services and Other State Examinations| 6th Revised Edition")
    WebElement clickBook;

    @FindBy(linkText = "Buy Now")
    WebElement clickBuyNow;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }
    public ShippingPage homePage1() throws InterruptedException {
        search.sendKeys("Indian Polity");
        Thread.sleep(2000);
        searchClick.click();
        clickBook.click();
        clickBuyNow.click();
        return new ShippingPage();
    }
}
