package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US07Page {
    public US07Page() {

        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath = "(//*[@title='İLETİŞİM'])[1]")
    public WebElement iletisimSekmesi;
    //*[@id="active"]/a
    @FindBy(xpath = "//a[.='İLETİŞİM']")
    public  WebElement homePageIletisimButton;

    @FindBy (className = "scrollContent livechat")
    public WebElement canlidestek;


    @FindBy (xpath = "(//*[@id='29val-field_1.3.10--input'])")
    public WebElement namebutton;


    @FindBy (xpath = "(//*[@id='29val-field_1.3.10--input'])")
    public WebElement emailbutton;


    @FindBy (xpath = "(//*[@id='31val-field_1.3.10--input'])")
    public WebElement messagebutton;


    @FindBy (className = "Start chat")
    public WebElement startchatbutton;



}
