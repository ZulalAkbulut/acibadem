package stepDefinitions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.lang3.ObjectUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.US03Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;
import java.util.Random;

import static utilities.ReusableMethods.*;

public class US03StepDefinitions {
    US03Page us03Page = new US03Page();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();


    @Given("Kullanici Anasayfaya gider.")
    public void kullanici_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("acibademUrl"));
    }

    @When("Kullanici Doktorlar sekmesine gider.")
    public void kullanici_doktorlar_sekmesine_gider() {
        // us03Page.doktorlarSekmesi.click();
        clickWithTimeOut(us03Page.doktorlarSekmesi, 2);

        clickWithTimeOut(us03Page.doktorlarSekmesi, 5);
    }

    @When("Kullanici Doktorlar sekmesini gorur.")
    public void kullanici_doktorlar_sekmesini_gorur() {
        System.out.println(us03Page.doktorlarSayfasi.getText());
        Assert.assertEquals("Doktorlar", us03Page.doktorlarSayfasi.getText());

        Assert.assertEquals(us03Page.doktorlarSayfasi.getText(), "Doktorlar");
    }

    @Then("Kullanici sayfayi asagiya kaydirir.")
    public void kullanici_sayfayi_asagiya_kaydirir() {
        jse.executeScript("window.scrollTo(0,600)");
        actions.sendKeys(Keys.PAGE_DOWN, Keys.PAGE_DOWN).build().perform();
    }

    @Given("Kullanici Lokasyon butonuna tiklar.")
    public void kullanici_lokasyon_butonuna_tiklar() {

        clickWithTimeOut(us03Page.DrLokasyonSecme, 3);
    }

    @When("Kullanici istedigi Lokasyonu secer.")
    public void kullanici_istedigi_lokasyonu_secer() {
        // selectRandomTextFromDropdown();
        Select select =new Select(us03Page.DrLokasyonSecme);
        List<WebElement> lokasyonlarListe= select.getOptions();
        Random random = new Random();
        int optionIndex = 1 + random.nextInt(lokasyonlarListe.size()-1);
        select.selectByIndex(optionIndex);
        select.getFirstSelectedOption().click();
        clickWithTimeOut(us03Page.doktorlarSayfasi,2);
    }


    @Given("Kullanici Tibbi Birim butonuna tiklar.")
    public void kullanici_tibbi_birim_butonuna_tiklar() {
        clickWithTimeOut(us03Page.DrTibbiBirimSecme,2);
    }

    @Given("Kullanici Tibbi Birim secer.")
    public void kullanici_tibbi_birim_secer() {
        Select select =new Select(us03Page.DrTibbiBirimSecme);
        List<WebElement> lokasyonlarListe= select.getOptions();
        Random random = new Random();
        int optionIndex = 1 + random.nextInt(lokasyonlarListe.size()-1);
        select.selectByIndex(optionIndex);
        select.getFirstSelectedOption().click();
        clickWithTimeOut(us03Page.doktorlarSayfasi,2);
    }

   /* @Given("Kullanici sayfayi asagiya kaydirir.")
    public void kullanici_sayfayi_asagiya_kaydirir() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    */

    @Given("Kullanici Unvan butonuna tiklar.")
    public void kullanici_unvan_butonuna_tiklar() {
        clickWithTimeOut(us03Page.DrUnvanSecme,2);
    }

    @Given("Kullanici Unvan secer.")
    public void kullanici_unvan_secer() {
        Select select =new Select(us03Page.DrUnvanSecme);
        List<WebElement> lokasyonlarListe= select.getOptions();
        Random random = new Random();
        int optionIndex = 1 + random.nextInt(lokasyonlarListe.size()-1);
        select.selectByIndex(optionIndex);
        select.getFirstSelectedOption().click();
        clickWithTimeOut(us03Page.doktorlarSayfasi,2);
    }

    @Given("Kullanici istedigi doktoru secer.")
    public void kullanici_istedigi_doktoru_secer() {
        clickWithTimeOut(us03Page.DoktorSecme,2);
    }


}
