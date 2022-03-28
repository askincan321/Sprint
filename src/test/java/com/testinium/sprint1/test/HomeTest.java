package com.testinium.sprint1.test;

import com.testinium.sprint1.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

public class HomeTest {

    Methods methods;
    public HomeTest(){methods = new Methods();}

    public void home(){
        methods.waitBySeconds(5);
        Assert.assertTrue(methods.isElementVisible(By.xpath("//div[@class='logo-icon'")));



    }
}
