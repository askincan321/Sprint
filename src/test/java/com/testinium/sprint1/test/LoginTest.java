package com.testinium.sprint1.test;

import com.testinium.sprint1.driver.BaseTest;
import com.testinium.sprint1.page.LoginPage;
import org.junit.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest(){
        LoginPage loginPage = new LoginPage();

        loginPage.login();
    }
}
