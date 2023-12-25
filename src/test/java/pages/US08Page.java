package pages;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import javax.xml.xpath.XPath;

public class US08Page {
    public US08Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@class='menu']")
    public WebElement menu;

    @FindBy(xpath = "//*[@class='international-patients']")
    public WebElement internationalPatients;

    @FindBy(xpath = "//*[@id='name']")
    public WebElement name;

    @FindBy(xpath = "//*[@id='last-name']")
    public WebElement lastName;

    @FindBy(xpath = "//*[@id='Mail']")
    public WebElement email;

    @FindBy(xpath = "//*[@id='phone']")
    public WebElement phoneNumber;

    @FindBy(xpath = "//*[@id='country']")
    public WebElement country;

    @FindBy(xpath = "//*[@id='treatment_units']")
    public WebElement treatmentUnits;

    @FindBy(xpath = "//*[@id='message']")
    public WebElement message;

    @FindBy(xpath = "//*[@id='gridCheck']")
    public WebElement checkBox;

    @FindBy(xpath = "//*[@class='cmplz-btn cmplz-accept']")
    public WebElement cookiesAccept;

 //  @FindBy(xpath = "//*[@id='second-form-button']")
 //  public WebElement sendButton;



}