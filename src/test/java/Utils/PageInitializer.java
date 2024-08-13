package Utils;

import pages.LoginPage;

public class PageInitializer {

    public static LoginPage loginPage;

    public static void initializeObjects(){
        loginPage = new LoginPage();
    }

}