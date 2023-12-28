package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US01Page {
    public US01Page() {
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@title='ACIBADEM ONLINE'] ")
    public WebElement acibademOnlineButonu;

    @FindBy(id="mat-input-0")
    public WebElement emailButonu;

    @FindBy(xpath = "//*[@id='mat-input-1']")
    public WebElement sifreButonu;

    @FindBy(xpath = "//*[@class='login-button mat-flat-button mat-primary']")
    public WebElement uyelikGirisButonu;

    @FindBy(xpath = "//*[@class='hospital-appointment-btn mat-stroked-button mat-basic']")
    public WebElement randevularButonu;

    @FindBy(xpath = "(//*[@class='mat-form-field-infix'])[2]")
    public WebElement hastanelerButon;

    @FindBy(xpath = "(//*[@class='mat-option-text'])[1]")
    public WebElement hastaneIsmi;

    @FindBy(xpath = "(//*[@class='mat-form-field-infix'])[3]")
    public WebElement servislerButonu;

    @FindBy(xpath = "(//*[@class='mat-option-text'])[6]")
    public WebElement servisIsmi;

    @FindBy(xpath = "(//*[@class='mat-form-field-infix'])[4]")
    public WebElement doktorButonu;

    @FindBy(xpath = "//*[@class='mat-option-text']")
    public WebElement doktorIsmi;

    @FindBy(xpath = "//*[@class='fc-icon fc-icon-right-single-arrow']")
    public WebElement ileriTarihIkonu;

    @FindBy(xpath = "(//*[@class='fc-content'])[9]")
    public WebElement tarihVeSaat;

    @FindBy(xpath = "//*[@class='appointmentConfirmButton mat-flat-button mat-primary']")
    public WebElement randevuOnayButonu;

    @FindBy(xpath = "//*[@class='mat-dialog-title ng-star-inserted']")
    public WebElement randevuAlinmistirYazisi;

    @FindBy(xpath = "//span[text()='Randevularım']")
    public WebElement randevuOnaySonrasiRandevularimButonu;

    @FindBy(xpath = "//span[text()='Randevuyu İptal Et']")
    public WebElement randevuIptalButonu;

    @FindBy(xpath = "//span[text()='Evet']")
    public WebElement iptalEvetButonu;




}
