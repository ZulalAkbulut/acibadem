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



}
