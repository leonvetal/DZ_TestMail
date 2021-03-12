package com.it.tests;

import com.it.letter.Unread;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {
    @Test
    public void test() throws InterruptedException {


        app.login.login(validUser);
        Thread.sleep(2000);
        Assert.assertEquals(app.dashboard.getMailUser(), validUser.email);
//        driver.quit();
        app.newletter.btnNewLet.click();
//        Thread.sleep(2000);
        app.newletter.let1(validUser.email);
        app.newletter.let2(validLetter);
        Thread.sleep(2000);
        app.newletter.verify();
//       Assert.assertEquals(app.unrHelper.unRead.getText(),validUnread.subj);
        Assert.assertEquals(app.dashboard.getValUnr(),validUnread.xp);
        Thread.sleep(2000);
        app.unrHelper.xp2();

    }
}
