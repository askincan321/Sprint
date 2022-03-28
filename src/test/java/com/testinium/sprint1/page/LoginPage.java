package com.testinium.sprint1.page;

import com.testinium.sprint1.methods.Methods;
import org.openqa.selenium.By;

import java.util.concurrent.ThreadLocalRandom;


public class LoginPage {

    Methods methods;
    String thirdProduct;

    public LoginPage() {
        methods = new Methods();
    }

    public void login() {
        methods.click(By.xpath("//div[@class='menu-top-button login']"));
        methods.sendKeys(By.id("login-email"), "askincan321@gmail.com");
        methods.sendKeys(By.id("login-password"), "Lx.NhQ929g,dcQ_");
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));

        methods.waitBySeconds(20); // Doğrulamayı Yapabilmek için konuldu.
        // Anasayfa açılışı , giriş butonuna tıklanış , E-Mail Password Girişi , Oturum Açılışının Gerçekleşmesi.

        methods.sendKeys(By.id("search-input"), "Oyuncak");
        methods.click(By.cssSelector("#search > span"));
        // Arama Çubugunda Aratma

        methods.scrollWithaction(By.cssSelector(".product-cr:nth-child(7)"));
        methods.click(By.cssSelector(".product-cr:nth-child(7) [class=\"hover-menu\"] [class=\"add-to-favorites\"] [class = \"fa fa-heart\"]"));
        methods.click(By.cssSelector(".product-cr:nth-child(8) [class=\"hover-menu\"] [class=\"add-to-favorites\"] [class = \"fa fa-heart\"]"));
        methods.click(By.cssSelector(".product-cr:nth-child(9) [class=\"hover-menu\"] [class=\"add-to-favorites\"] [class = \"fa fa-heart\"]"));
        methods.click(By.cssSelector(".product-cr:nth-child(10) [class=\"hover-menu\"] [class=\"add-to-favorites\"] [class = \"fa fa-heart\"]"));
        // 7. Satırdaki ürüne gidip 4 adet favorilere ekleme

        thirdProduct = methods.getAttribute(By.cssSelector(".product-cr:nth-child(9)"), "id");
        //3. elementin verisini tutma.

       /** methods.click(By.cssSelector("#header-bottom > div > div.logo-text > a > img"));
        methods.click(By.cssSelector("#mainNav > div.nav-content > div > div.lvl1catalog > a"));
        methods.click(By.cssSelector("#landing-point > div:nth-child(4) > a:nth-child(2) > img"));
        methods.click(By.cssSelector("#content > div > div > div.product-filter > div > div.sort > select > option:nth-child(6)"));
        methods.click(By.cssSelector("#mainNav > div.nav-content > ul > li.book.has-menu.active > div.lvl2.js-bookCr > ul > li:nth-child(3) > span"));
        **/
        // Sayfalar arası geçiş filitreleme .
        methods.click(By.cssSelector("#header-bottom > div > div.logo-text > a > img"));
        methods.click(By.cssSelector("#mainNav > div.nav-content > div > div.lvl1catalog > a"));
        methods.click(By.cssSelector("#landing-point > div:nth-child(4) > a:nth-child(2) > img"));
        methods.click(By.cssSelector("#content > div > div > div.product-filter > div > div.sort > select"));
        methods.click(By.cssSelector("#content > div > div > div.product-filter > div > div.sort > select > option:nth-child(6)"));
        methods.click(By.cssSelector("#mainNav > div.nav-content > ul > li.book.has-menu.active > div.lvl2.js-bookCr > ul > li:nth-child(3) > span"));
        methods.waitBySeconds(2);
        methods.click(By.cssSelector("#mainNav > div.nav-content > ul > li.book.has-menu.active > div.lvl2.js-bookCr > ul > li:nth-child(3) > div > div.open-menu-ct.bookAllCategories > div > ul:nth-child(3) > li:nth-child(14) > a"));

        int randomNum = ThreadLocalRandom.current().nextInt(2, 16);
        methods.scrollWithaction(By.cssSelector(String.format(".product-cr:nth-child(%d)", randomNum)));
        methods.click(By.cssSelector(String.format(".product-cr:nth-child(%d) [class = hover-menu] [class = add-to-cart] [class = \"fa fa-shopping-cart\"]", randomNum)));
        // Random Kısım (Burada yardım aldım).
        methods.waitBySeconds(3);







    }
}

