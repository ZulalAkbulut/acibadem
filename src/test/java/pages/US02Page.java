package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class US02Page {
    public US02Page() {
        PageFactory.initElements(Driver.getDriver(),this);}


    @FindBy(xpath = "//ul//li[2]")
    public WebElement hastanelerButonu;

    @FindBy(xpath = "(//*[@class='user-layout'])[4]")
    public WebElement lokasyonHastaneButonu;

    @FindBy(xpath = "(//*[@class='image container copyrightPath'])[1]")
    public WebElement arananHastane;


}
