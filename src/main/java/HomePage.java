import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Stack;

public class HomePage extends BasePage {

    SearchBar searchBar;




    public HomePage(WebDriver driver) {
        super(driver);
        searchBar = new SearchBar(driver);
    }

    public SearchBar searchBar() {
        return this.searchBar;


    }



}
