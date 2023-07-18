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

    @FindBy(css = "#product-529556 h4")
    WebElement getResult;

    @FindBy(css = "#product-529520 .item__bottom__cart")
    WebElement addToCartSamsung;

    @FindBy(css = "#header__center__login__and__cart .icon-number")
    WebElement getCartNumberOfProduct;

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

    public void AddToCartSamsung()
    {
        addToCartSamsung.click();
    }
    public String getCart()
    {
       return getCartNumberOfProduct.getText();
    }
}

