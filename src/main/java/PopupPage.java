import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PopupPage extends BasePage
{
    @FindBy(css = ".mf-modal-iframe.mf-modal-iframe-middle.mf-animate.mf-loaded")
    WebElement iframe;

    @FindBy(css = ".mf-modal-container .mf-modal-close")
    WebElement close;

    @FindBy(css = ".btn.secondary")
    WebElement buttonPrihvati;

    public PopupPage(ChromeDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void clickOnPopup ()
    {
        driver.switchTo().frame(iframe);
        close.click();
    }

    public void clickPrihvati()
    {
    buttonPrihvati.click();
    }
}
