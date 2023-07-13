import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage
{
    @FindBy(css = "#header__center__searchbox .search-container input")
    WebElement search;

    @FindBy(css = "div[id='header__center__searchbox'] div i[class='fa fa-search']")
    WebElement lupa;

    public HomePage(ChromeDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public void inputSearch(String text)
    {
        search.sendKeys(text);
        lupa.click();
    }
}

