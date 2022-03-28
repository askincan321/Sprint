package com.testinium.sprint1.test;

import com.testinium.sprint1.driver.BaseTest;
import com.testinium.sprint1.page.HomePage;
import com.testinium.sprint1.page.LoginPage;
import com.testinium.sprint1.page.ProductPage;
import org.junit.Test;

public class ProductTest extends BaseTest {

    @Test
    public void getTextTest(){
        HomePage homePage = new HomePage();
        LoginPage loginpage = new LoginPage();
        ProductPage productPage = new ProductPage();

        homePage.home();
        loginpage.login();
        productPage.textControlTest();


    }
    @Test
    public void productTest(){
        ProductPage productPage = new ProductPage();
        productPage.scrollAndSelect();
    }

    @Test
    public void addFav(){
        ProductPage productPage = new ProductPage();
        productPage.addFav();
    }


}
