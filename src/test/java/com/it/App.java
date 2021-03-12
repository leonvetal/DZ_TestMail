package com.it;

import com.it.helpers.*;
import com.it.pages.NewLetter;

public class App {
    public CommonHelper common;
    public LoginHelper login;
    public DashboardHelper dashboard;
    public NewLetterHelper newletter;
    public UnrHelper unrHelper;

    public App() {
        this.common = new CommonHelper();
        this.login = new LoginHelper();
        this.dashboard = new DashboardHelper();
        this.newletter = new NewLetterHelper();
        this.unrHelper = new UnrHelper();

    }


}
