package com.it.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    @FindBy(name = "login")
    private WebElement inputlogin;

    @FindBy(name = "pass")
    private WebElement inputPassword;

	@FindBy(xpath = "//input [@tabindex='5']")
	private WebElement btnlogin;



	public void login(String username, String password) {
		inputlogin.clear();
		inputlogin.sendKeys(username);
		inputPassword.clear();
		inputPassword.sendKeys(password);
		btnlogin.click();

	}
}
