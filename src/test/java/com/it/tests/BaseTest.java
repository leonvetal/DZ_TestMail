package com.it.tests;

import com.it.App;
import com.it.letter.Letter;
import com.it.letter.LetterFactory;

import com.it.letter.Unread;
import com.it.letter.UnreadFactory;
import com.it.users.User;
import com.it.users.UserFactory;
import org.testng.annotations.AfterSuite;

public class BaseTest {
    protected User validUser = UserFactory.getValidUser();
    protected Letter validLetter = LetterFactory.getValidLetter();
    protected Unread validUnread = UnreadFactory.getValidUnread();
    protected App app = new App();

    @AfterSuite
    public void afterSuite() {
        app.common.stopApp();

    }
}
