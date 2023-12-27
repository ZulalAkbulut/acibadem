package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US09Page {
    public US09Page() {
        PageFactory.initElements(Driver.getDriver(),this);}

    //i[@class='icon route-way']  yoltarifi

    @FindBy(xpath = "//i[@class='icon route-way']")
    public WebElement yoltarifi;

     //  (//span[.='Tümünü kabul et'])[1]  google tumunukabul et butonu

    @FindBy(xpath = "(//span[.='Tümünü kabul et'])[1]")
    public WebElement tumunuKabulEtGoogle;


}
