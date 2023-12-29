package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US06Page {
    public US06Page() {
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//div[@class='tabHeader']//span[text()='BİREYSEL']") public WebElement bireyselButon;

    @FindBy(id = "ContactForm_Firstname") public  WebElement bireyselAdKutusu;

    @FindBy(id="ContactForm_Lastname") public WebElement bireyselSoyadKutusu;

    @FindBy(id="ContactForm_Email") public WebElement bireyselEmailKutusu;

    @FindBy(id ="ContactForm_Phone") public WebElement bireyselTelefonNumarasiKutusu;

    @FindBy(id ="ContactForm_Message") public WebElement bireyselMesajKutusu;

    @FindBy(id ="KvkkBireysel") public WebElement kvkkMetniButonu;

    @FindBy(id ="EtkBireysel") public WebElement bilgilendirmeMetniButonu;

    @FindBy(xpath = "//div[@data-tab='fiyat-sor']") public WebElement fiyatSorBaslik;

    @FindBy(xpath = "//input[@name='AskPriceContactForm.Firstname']") public WebElement fiyatSorAdKutusu;

    @FindBy(xpath = "//input[@id='AskPriceContactForm_Lastname']") public WebElement fiyatSorSoyadKutusu;

    @FindBy(xpath = "//input[@name='AskPriceContactForm.Email']") public WebElement fiyatSoremail_Kutusu;


    @FindBy(id = "AskPriceContactForm_Phone") public WebElement fiyatSorphone_Kutusu;

    @FindBy(xpath= "//select[@id='AskPriceContactForm_HospitalName']")
    public WebElement fiyatSorSubeSecim;
    @FindBy(xpath = "//select[@id='selectSubject']")
    public WebElement fiyatSorSigortaDurum;

    @FindBy(css = "#AskPriceContactForm_Message") public WebElement fiyatSorMesaj_Kutusu;

    @FindBy(xpath = "//input[@id='KvkkFiyat']") public WebElement fiyatSorKvkkBireyselKutusu;

    @FindBy(xpath = "//input[@id='EtkFiyat']") public WebElement fiyatSorEtkDanismaKutusu;

/*
    @FindBy(id ="MedicalAdviceContactForm_Firstname") public WebElement tibbiDanismaAdKutusu;

    @FindBy(id ="MedicalAdviceContactForm_Lastname") public WebElement tibbiDanismaSoyadKutusu;

    @FindBy(id ="MedicalAdviceContactForm_Email") public WebElement tibbiDanismaEpostaKutusu;

    @FindBy(id="MedicalAdviceContactForm_Phone") public WebElement tibbiDanismaTelefonKutusu;
 */

    @FindBy(xpath = "//div[@class='tabHeader']//span[text()='YATIRIMCI']") public WebElement yatirimciButon;

    @FindBy(id = "InvestorContactForm_Firstname") public  WebElement yatirimciAdKutusu;

    @FindBy(id="InvestorContactForm_Lastname") public WebElement yatirimciSoyadKutusu;

    @FindBy(id="InvestorContactForm_Email") public WebElement yatirimciEmailKutusu;

    @FindBy(id ="InvestorContactForm_Phone") public WebElement yatirimciTelefonNumarasiKutusu;

    @FindBy(id ="InvestorContactForm_Message") public WebElement yatirimciMesajKutusu;

    @FindBy(id ="KvkkYatirimci") public WebElement yatirimciKvkkMetniButonu;

    @FindBy(id ="EtkYatirimci") public WebElement yatirimciBilgilendirmeMetniButonu;








}
