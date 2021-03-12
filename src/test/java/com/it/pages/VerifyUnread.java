package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerifyUnread extends BasePage {
    @FindBy(xpath = "//i[@onclick='I_Mbox.ctrlMarkRead(this);']")
    public WebElement delMark;

    //    @FindBy(xpath = "//span[@class='sbj']/*[1]")
//    private WebElement getTheme;
//
    public void xp2() {
        delMark.click();
    }

}
