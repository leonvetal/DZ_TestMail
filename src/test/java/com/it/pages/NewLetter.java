package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewLetter extends BasePage {

    @FindBy(xpath = "//p[@class='make_message']/*[1]")
    public WebElement btnNewLet;

    @FindBy(xpath = "//textarea[@name='to']")
    public WebElement sendTo;

    @FindBy(xpath = "//input[@tabindex='5']")
    public WebElement sendTheme;

    @FindBy(xpath = "//textarea[@tabindex='10']")
    public WebElement sendBody;

    @FindBy(xpath = "//p[@class='send_container']/*[1]")
    public WebElement send;

    @FindBy(xpath = "//li[@class='sn_menu_item ']/*[1]")
    public WebElement verMail;


//public String getXpass() {
//    return unRead.getText();
//}


    public void let1(String email) {
        sendTo.clear();
        sendTo.sendKeys(email);
    }

    public void let2(String theme, String body) {
        sendTheme.clear();
        sendTheme.sendKeys(theme);
        sendBody.clear();
        sendBody.sendKeys(body);
        send.click();
    }

    public void verify() {
        verMail.click();


    }


}
