package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import pages.US08Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

public class US08StepDefinitions {
    US08Page us08Page = new US08Page();


    @Given("Kullanici acibadem sitesine gider")
    public void kullaniciSitesineGider() {
        Driver.getDriver().get(ConfigReader.getProperty("acibademUrl"));
    }

    @Then("Kullanici menu butonunu tiklar")
    public void kullaniciMenuButonunuTiklar() {
        us08Page.menu.click();
    }

    @Then("Kullanici acilan menuyu asagi kaydirir")
    public void kullaniciAcilanMenuyuAsagiKaydirir() {

    }

    @Then("Kullanici FOR INTERNATIONAL PATIENTS butonu tiklar")
    public void kullaniciButonuTiklar() {
        us08Page.internationalPatients.click();
    }

    @Then("Kullanici acilan sayfada istenen bilgileri girer")
    public void kullaniciAcilanSayfadaIstenenBilgileriGirer() {
        Driver.getDriver().get(ConfigReader.getProperty("acibademinternationalUrl"));
    }

    @Then("Kullanici acilan cookies kapatir")
    public void kullaniciAcilanCookiesKapatir() {
        // ReusableMethods.hooverByJS(us08Page.cookies);
        us08Page.cookies.click();
    }

    @Then("Kullanici {string} kutusuna isim girer")
    public void kullaniciKutusunaIsimGirer(String str) {
        us08Page.name.sendKeys("Tom");
    }

    @Then("Kullanici {string} kutusuna soyisim girer")
    public void kullaniciKutusunaSoyisimGirer(String str) {
        us08Page.lastName.sendKeys("Hanks");
    }

    @Then("Kullanici {string} kutusuna mail adresi girer")
    public void kullaniciKutusunaMailAdresiGirer(String str) {
        us08Page.email.sendKeys("tomkank8s@yahoo.com");
    }

    @Then("Kullanici {string} kutusuna telefon numarasi girer")
    public void kullaniciKutusunaTelefonNumarasiGirer(String str) {
        us08Page.phoneNumber.sendKeys("98760543");
    }

    @Then("Kullanci Country menusunden ulke secer")
    public void kullanciCountryMenusundenUlkeSecer() {
        Select select = new Select(us08Page.country);
        select.selectByValue("154");
        //value="154" Nederlands
    }

    @Then("Kullanici Treatment Units menusunden bolum secer")
    public void kullaniciTreatmentUnitsMenusundenBolumSecer() {
        Select select = new Select(us08Page.treatmentUnits);
        select.selectByVisibleText("Dentistry");
    }

    @Then("Kullanici Message kutusuna mesaji girer")
    public void kullaniciMessageKutusunaMesajiGirer() {
        us08Page.message.sendKeys("I want to be treated ");
    }

    @Then("Kullanici Checkbox u isaretler")
    public void kullaniciCheckboxUIsaretler() {
        us08Page.checkBox.click();
    }

    @Then("Kayit yapildigini dogrula")
    public void kayitYapildiginiDogrula() {

    }


    @Then("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int arg0) throws InterruptedException {
        Thread.sleep(2000);
    }


}



