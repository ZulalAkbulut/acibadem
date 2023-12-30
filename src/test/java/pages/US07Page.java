package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.NoSuchElementException;

public class US07Page {
    public US07Page() {

        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath = "//tbody//tr//td")
    public WebElement iletisimSekmesi;

   // @FindBy(xpath = "//a[.='İLETİŞİM']")
    //public  WebElement homePageIletisimButton;

    @FindBy (xpath = "//a[@title='Canlı Destek']")
    public WebElement canlidestek;


    @FindBy (xpath = "html/body/div//form/main/div//input")
    public WebElement namebutton;
    //(//*[@id='100val-field_1.3.10--input'])

    @FindBy (xpath = "html/body/div//form/main/div//input[@name='email']")
    public WebElement emailbutton;
//(//*[@id='101val-field_1.3.10--input'])

    @FindBy (xpath = "html/body/div//form/main/div//textarea")
    public WebElement messagebutton;
//(//*[@id='102val-field_1.3.10--input'])

    @FindBy (className = "Start chat")
    public WebElement startchatbutton;

    @FindBy (xpath = "html/body/div//main/div/div/div[@class='styles__Message-sc-46lcwk-0 cobzBX]")
    public WebElement mesajGonderildi;

    @FindBy (id = "webWidget")            //  xpath = "//iframe[@id='webWidget']"
    public WebElement MessageBox;

    @FindBy (xpath = "//*[@id='Embed']/div/div/div/div/div/div/form/main/div[2]/div[3]/div/div")
    public WebElement uyari;

    @FindBy (xpath = "//button[@class='sc-htpNat cKUwht']")
    public WebElement startLiveSupport;
    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static void verifyElementDisplayed(WebElement element) {
        try {
            Assert.assertTrue("Element not visible: " + element, element.isDisplayed());
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            Assert.fail("Element not found: " + element);
        }
    }


}
