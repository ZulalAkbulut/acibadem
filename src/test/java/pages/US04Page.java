package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class US04Page {
    public US04Page() {
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(linkText = "MEDİKAL TEKNOLOJİLER")
    public WebElement MedikalButton;
    @FindBy (xpath = "//select[@id='location']")
    public WebElement lokasyonclick;
    @FindBy (xpath = "//select//option[.='Bakırköy Hastanesi']")
    public WebElement lokasyon;
    //select//option[.='Bakırköy Hastanesi']
    @FindBy (xpath = "//select[@id='unit']")
    public WebElement birimclick;

    @FindBy (xpath = "//select//option[.='Kardiyoloji']")
    public WebElement birim;
    @FindBy(xpath = "//select[@id='technologyType']")
    public WebElement cihauturuclick;
    @FindBy(xpath = "//select//option[.='Tanı']")
    public WebElement cihauturu;
    @FindBy(xpath = " //div[@class='summary']")
    public WebElement dogrulama;
    @FindBy (xpath = "//select//option[.='Maslak Hastanesi']")
    public WebElement lokasyonMaslak;
    @FindBy (xpath = "//select//option[.='Nöroloji']")
    public WebElement birim2;


    //span[@class='image container 0']
    @FindBy (xpath = "//span[@class='image container 0']")
    public WebElement norolojiTumCihaz;

        //img[@class='technology-lazy-load-img-cancelled']

    @FindBy (xpath = "//img[@class='technology-lazy-load-img-cancelled']")
    public List< WebElement> locasyondakiTumCihaz;


    @FindBy(xpath = "//div[@class='menu']")
    public WebElement menu;

    @FindBy(xpath ="(//a[@title='FİYAT SOR'])[1]")
    public WebElement Fiyat;

    @FindBy(xpath = "//input[@id='AskPriceContactForm_Firstname']")
    public WebElement adiniz;

    @FindBy(xpath = "//input[@id='AskPriceContactForm_Lastname']")
    public WebElement soyadiniz;

    @FindBy(xpath = "//input[@id='AskPriceContactForm_Email']")
    public WebElement eposta;

    @FindBy(xpath = "//input[@id='AskPriceContactForm_Phone']")
    public WebElement telefon;
    @FindBy(xpath = "//select[@class='dropdown form-control']")
    public WebElement sube;
    @FindBy(xpath = "//option[@value='Bakırköy Hastanesi']")
    public WebElement subesecimi;
    @FindBy(xpath = "//select[@name='AskPriceContactForm.InsuranceStatus']")
    public WebElement sigorta;
    @FindBy(xpath = "//option[@value='Var']")
    public WebElement sigortadurumu;
    @FindBy(xpath = "//input[@id='insuranceNameCheck']")
    public WebElement sigortabilgi;
    @FindBy(xpath = "//textarea[@id='AskPriceContactForm_Message']")
    public WebElement mesaj;
    @FindBy(xpath = "//input[@id='KvkkFiyat']")
    public WebElement kvkk;
    @FindBy(xpath = "//input[@class='hasPlaceHolder numberMask'])[2]")
    public WebElement guvenlikkodu;
    @FindBy(xpath = "///button[@type='submit'])[2]")
    public WebElement gonderbutonu;

    @FindBy(xpath = "//div[@id='sentModal']")
    public WebElement verify;
}
