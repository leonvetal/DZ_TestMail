package com.it.helpers;

import com.it.letter.Letter;
import com.it.pages.NewLetter;

public class NewLetterHelper extends NewLetter {
    //    public void NLClick() {
//        btnNewLet.click();
//    }
    public void let2(Letter letter) {
        let2(letter.theme,letter.body);
    }
}
