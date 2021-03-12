package com.it.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage extends BasePage{
	@FindBy(xpath = "//span[@class='sn_menu_title']")
	private WebElement lbmail;

    @FindBy(xpath = "//i[@class='m']")
    public WebElement unReadDash;



    public String getMailUser() {
        return lbmail.getText();
    }

    public String getValUnr() {
        return unReadDash.getAttribute("onclick");

    }

}
