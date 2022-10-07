import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchBar extends BasePage {

    By searchbarlocator = By.id("search");



    public SearchBar(WebDriver driver) {
        super(driver);
    }

    public void search(String text) {
        type(searchbarlocator, text);
        click(searchbarlocator);

    }
}
