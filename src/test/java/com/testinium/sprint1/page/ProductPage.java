package com.testinium.sprint1.page;

import com.testinium.sprint1.driver.BaseTest;
import com.testinium.sprint1.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage extends BaseTest {

    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage() {
        methods = new Methods();
    }

    public void valueControlTest() {
        methods.sendKeys(By.xpath("//*[@id='search']/span"), "Oyuncak");
        String value = methods.getValue(By.id("search-input"));
        System.out.println("Alınan text:" + value);
        logger.info("Alınan text:" + value);
        Assert.assertEquals("Oyuncak", value);

        //methods.sendKeys(By.id("search-input"), "Oyuncak");
    }

    public void textControlTest() {
        String text = methods.getText(By.cssSelector(".common-sprite"));
        System.out.println("Alınan text:" + text);
        logger.info("Alınan text:" + text);
        methods.waitBySeconds(10);
    }

    public void scrollAndSelect() {
        methods.sendKeys(By.id("search-input"), "Oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        methods.click(By.cssSelector(".pr-img-link"));
        methods.scrollWithaction(By.cssSelector("#review-reply-button"));
        methods.waitBySeconds(3);
        methods.click(By.cssSelector("#content > div > div > div.product-filter > div > div.sort > select > option:nth-child(6)"));
        methods.waitBySeconds(5);
    }

    public void attributeTest(){
        String attribute = methods.getAttribute(By.cssSelector(".logo-text>a>img"),"title");
        System.out.println("Alınan text:"+ attribute);
        logger.info("Alınan text:"+attribute);
        methods.waitBySeconds(3);
    }

    public void addFav(){
        methods.sendKeys(By.id("search-input"), "Oyuncak");
        methods.click(By.cssSelector("#search > span"));
        methods.scrollWithaction(By.xpath("/html/body/div[5]/div/div/div[3]/div[4]/div[2]/div[7]"));
        methods.click(By.xpath("/html/body/div[5]/div/div/div[3]/div[4]/div[2]/div[8]/div[2]/div[3]/a[5]/i"));
        methods.click(By.xpath("/html/body/div[5]/div/div/div[3]/div[4]/div[2]/div[1]/div[2]/div[3]/a[4]/i"));
    }

    public void checkFav(){
        methods.click(By.id("/html/body/div[1]/div[2]/div/div[2]/ul/li[1]/div/ul/li/div/ul/li[1]/a"));
        String text = methods.getText(By.xpath("/html/body/div[5]/div/div[2]/div[1]/div[3]/div[2]/div/div[3]/div[1]/div[2]/a/span"));
        methods.selectByText(By.cssSelector("select#review-sort-selection"),"Oyuncak Müzesinde");
    }
}
