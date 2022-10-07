import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class ProductPage extends BasePage {

    By resultInfolocator = By.className("resultInfo");

    By productSizeLocator = By.xpath("//*[@id=\"product-137159\"]/div/div[1]/div/div/div");



    JavascriptExecutor js = (JavascriptExecutor)driver;
    WebElement saleprice;



    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public boolean isOnProductPage() {

        return isDisplayed(resultInfolocator);
    }

    public void scrollpage() {


        js.executeScript("window.scrollBy(0,17800)");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("//*[@id=\"pagedListContainer\"]/div[2]/div[2]/button")).click();
        System.out.println("Next Page: "+ driver.getCurrentUrl());

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        saleprice = driver.findElement(By.xpath("//*[@id=\"product-137159\"]/div/div[1]/a[2]/div/div[2]"));
        js.executeScript("arguments[0].scrollIntoView();",saleprice);

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        Actions actions = new Actions(driver);
        actions.moveToElement(saleprice).perform();

    }


    public void selectproduct(int i) {

        getAllproduct().get(i).click();


    }

    private List<WebElement> getAllproduct(){
        return findAll(productSizeLocator);

    }

    public void gotocart() {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);


        }

      driver.findElement(By.xpath("//*[@id=\"header__desktopBasket\"]/div/div[3]/a")).click();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);


        }
      driver.findElement(By.xpath("//*[@id=\"cop-app\"]/div/div[1]/div[1]/div[2]/div/div[2]/button")).click();



    }

    public void userinformation() {

        try {
            Thread.sleep(1700);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);


        }

            WebElement email = driver.findElement(By.xpath("//*[@id=\"n-input-email\"]"));
            email.sendKeys("ugurbdm@gmail.com");

            WebElement password = driver.findElement(By.xpath("//*[@id=\"n-input-password\"]"));
            password.sendKeys("ugurbadem");

            driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();

            driver.findElement(By.xpath("//*[@id=\"home\"]/div[4]/header/div/div/div[2]/a")).click();



    }

    public void remove_product() {

        driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div[3]/div[2]")).click();

        try {
            Thread.sleep(1600);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.findElement(By.xpath("//*[@id=\"header__desktopBasket\"]/div/div[2]/div/div[3]")).click();


        try {
            Thread.sleep(1600);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/button[2]")).click();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        driver.findElement(By.xpath("/html/body/div[2]/header/div/div/div[3]/div[2]")).click();







    }


}
