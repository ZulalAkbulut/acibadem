package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US10Page {
    public US10Page() {
        PageFactory.initElements(Driver.getDriver(),this);}


    //*[@title='İLETİŞİM'][1]

    @FindBy(xpath = "//*[@title='İLETİŞİM'][1]") public WebElement iletisimLink;

    //div[@data-tab='tibbi-danisma']
    //  //h2[@id='#iletisim-formlari']
    @FindBy(xpath = "//h2[@id='#iletisim-formlari']") public WebElement iletisimSayfasiBasligi;

    @FindBy(xpath = "//div[@data-tab='tibbi-danisma']") public WebElement tibbiDanismaBaslik;

    @FindBy(css = "#MedicalAdviceContactForm_Firstname") public WebElement adinizKutusu;

    //  #MedicalAdviceContactForm_Lastname  soyadiniz
    @FindBy(css = "#MedicalAdviceContactForm_Lastname") public WebElement soyadinizKutusu;

    //  #MedicalAdviceContactForm_Email
    @FindBy(css = "#MedicalAdviceContactForm_Email") public WebElement email_Kutusu;

    //  #MedicalAdviceContactForm_Phone

    @FindBy(css = "#MedicalAdviceContactForm_Phone") public WebElement phone_Kutusu;


    //    //select[@id='MedicalAdviceContactForm_TreatmentUnit']//option   list  tibbi birim

    @FindBy(id= "MedicalAdviceContactForm_TreatmentUnit")
    public WebElement tibbiBirimDDM;

    //  //select[@name='MedicalAdviceContactForm.Subject']//option    konu
    @FindBy(xpath = "(//select[@id='selectSubject'])[2]")
    public WebElement konuDDM;


    //  #MedicalAdviceContactForm_Message   mesaj
    @FindBy(css = "#MedicalAdviceContactForm_Message") public WebElement mesaj_Kutusu;


    //  //input[@id='KvkkBireysel']
    @FindBy(xpath = "//input[@id='KvkkDanisma']") public WebElement KvkkBireyselKutusu;

    //  //input[@id='EtkDanisma']

    @FindBy(xpath = "//input[@id='EtkDanisma']") public WebElement etkDanismaKutusu;



    //div[@class='guvenlik-kodu-container']/img
    @FindBy(xpath = "//div[@class='guvenlik-kodu-container']/img")
    public WebElement guvenlikKodu;
    //*[@id="acibademcaptchaDanisma"]
    @FindBy(xpath = "//*[@id='acibademcaptchaDanisma']")
    public WebElement guvenlikKodu1;

    //  #MedicalAdviceContactForm_SecurityCode  guvenlik kodu alani   //input[@id='MedicalAdviceContactForm_SecurityCode']
    @FindBy(css = "#MedicalAdviceContactForm_SecurityCode")
    public WebElement guvenlikKoduKonteyner;



    //   (//button[.='GÖNDER'])[1]
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement gonderButton;


    //div/h2[.='Teşekkürler!']
    @FindBy(xpath = "//div[@id='sentModal']")
    public WebElement tesekkurlerYazisi;

    ///////////////////////////////////////////
    //   #ContactForm_Firstname-error

    @FindBy(css = "#ContactForm_Firstname-error")
    public WebElement firstnameError;
    @FindBy(xpath = "//pre[@style='word-wrap: break-word; white-space: pre-wrap;']")
    public WebElement firstnameErrorGenel;

    //  #ContactForm_Lastname-error
    @FindBy(css = "#ContactForm_Lastname-error")
    public WebElement lastnameError;
    @FindBy(xpath = "//pre[@style='word-wrap: break-word; white-space: pre-wrap;']")
    public WebElement lastnameErrorGenel;

    //  #ContactForm_Email-error
    @FindBy(css = "#ContactForm_Email-error")
    public WebElement emailError;

    @FindBy(xpath = "//pre[@style='word-wrap: break-word; white-space: pre-wrap;']")
    public WebElement emailErrorGenel;

    // #ContactForm_Phone-error
    @FindBy(css = "#ContactForm_Phone-error")
    public WebElement phoneError;

    @FindBy(xpath = "//pre[@style='word-wrap: break-word; white-space: pre-wrap;']")
    public WebElement phoneErrorGenel;

    // #ContactForm_Message-error
    @FindBy(css = "#ContactForm_Message-error")
    public WebElement messageError;

    @FindBy(xpath = "//pre[@style='word-wrap: break-word; white-space: pre-wrap;']")
    public WebElement messageErrorGenel;












}
