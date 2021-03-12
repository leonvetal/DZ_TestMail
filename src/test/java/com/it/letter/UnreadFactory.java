package com.it.letter;

import java.util.ResourceBundle;

public class UnreadFactory {
    static ResourceBundle resourceUnread = ResourceBundle.getBundle("unread");

    public static Unread getValidUnread() {
        return new Unread(resourceUnread.getString("xp")
                , resourceUnread.getString("subj"));
    }
}
