import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestNetworkWebsite extends BaseTest {


    HomePage homePage;
    ProductPage productPage;


    @Test
    @Order(1)
    public void search_product(){

        homePage = new HomePage(driver);
        System.out.println("Page: "+driver.getCurrentUrl());
        productPage = new ProductPage(driver);
        homePage.searchBar().search("ceket");
        Assertions.assertTrue(productPage.isOnProductPage(), "Not on the Network Page");


    }

    @Test
    @Order(2)
    public void scroll_page(){

        productPage.scrollpage();


    }

    @Test
    @Order(3)
    public void select_product(){

        productPage.selectproduct(0);

    }

    @Test
    @Order(4)
    public void go_to_cart(){

      productPage.gotocart();

    }


    @Test
    @Order(5)
    public void user_information(){

        productPage.userinformation();


    }

    @Test
    @Order(6)
    public void remove_product(){

        productPage.remove_product();

    }


}
