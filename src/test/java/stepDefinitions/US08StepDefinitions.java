package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import pages.US08Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static utilities.Driver.driver;

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
    @Then("Kullanici FOR INTERNATIONAL PATIENTS butonu tiklar")
    public void kullaniciButonuTiklar() {
        us08Page.internationalPatients.click();
        String ilkSayfaHandle = driver.getWindowHandle();
        Set<String> pencereler = driver.getWindowHandles();
        for (String w:pencereler) {
            if (!w.equals(ilkSayfaHandle)){
                driver.switchTo().window(w);
            }
        }
    }
    @Then("Kullanici acilan cookies kapatir")
    public void kullaniciAcilanCookiesKapatir() {
        ReusableMethods.click(us08Page.cookies);
    }
    @Then("Kullanici {string} kutusuna isim girer")
    public void kullaniciKutusunaIsimGirer(String str) {
        us08Page.name.sendKeys("Tom");
    }
    @Then("Kullanici {string} kutusuna soyisim girer")
    public void kullaniciKutusunaSoyisimGirer(String str) {
        us08Page.lastName.sendKeys("Kankas");
    }
    @Then("Kullanici {string} kutusuna mail adresi girer")
    public void kullaniciKutusunaMailAdresiGirer(String str) {
        us08Page.email.sendKeys("tomkanka8s@yahoo.com");
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
  @Then("Kullanici Send butonunu tiklar")
  public void kullaniciSendButonunuTiklar() {
      us08Page.sendButton.click();
  }

  @Then("Kayit yapildigini dogrula")
  public static void kayitYapildiginiDogrula() {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      System.out.println("allert mesaji "+alertText);
      String expectedAlertText = "Thank You. We have received your message.";
      assertEquals(expectedAlertText, alertText);
      alert.accept();
  }
    @Then("Kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int str) throws InterruptedException {
        Thread.sleep(2000);
    }

// Negatif Test
    @Then("Kullanici Name kutusunu bos birakir")
    public void kullaniciNameKutusunuBosBirakir() {
        us08Page.name.sendKeys("");
    }


    @Then("Kullanici {string} kutusuna mail adresini com uzantisi olmadan girer")
    public void kullaniciKutusunaMailAdresiniComUzantisiOlmadanGirer(String str) {
        us08Page.email.sendKeys("tomkank8s@yahoo");
    }

    @Then("Hatayi dogrula")
    public void hatayiDogrula() {

    }



}



