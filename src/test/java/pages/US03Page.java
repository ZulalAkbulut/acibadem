package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US03Page {
    public US03Page() {
        PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy (xpath = "(//*[@title='DOKTORLAR'])[1]")
    public WebElement doktorlarSekmesi;

    @FindBy (xpath = "//span[text()='Doktorlar']")
    public WebElement doktorlarSayfasi;
    //span[@class='m-nav__link-text']

    @FindBy (id="location")
    public WebElement DrLokasyonSecme;

    @FindBy (id="unit")
    public WebElement DrTibbiBirimSecme;

    @FindBy( id = "doctorType")
    public WebElement DrUnvanSecme;

    @FindBy (xpath = "(//img[@class='doctor-lazy-load-img-cancelled'])[2]")
    public WebElement DoktorSecme;



}
