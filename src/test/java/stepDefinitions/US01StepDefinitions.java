package stepDefinitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.ui.Select;
import pages.US01Page;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.List;
import java.util.Set;

import static utilities.Driver.driver;

public class US01StepDefinitions {

    US01Page us01Page = new US01Page();

    @Given("Kullanici acibadem anasayfaya gider")
    public void kullanici_acibadem_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("acibademUrl"));

    }


    @Then("Kullanici uye girisi yapar")
    public void kullaniciUyeGirisiYapar() throws InterruptedException {
        us01Page.acibademOnlineButonu.click();
        String ilkSayfaWindowHandleDegeri = driver.getWindowHandle();
        System.out.println(ilkSayfaWindowHandleDegeri);

        Set<String> windowHandleseti = driver.getWindowHandles();
        System.out.println(windowHandleseti);
        String ikinciSayfaWindowHandleDegeri = "";
        for (String each : windowHandleseti
        ) {
            if (!each.equals(ilkSayfaWindowHandleDegeri)) {
                ikinciSayfaWindowHandleDegeri = each;
            }
        }
        driver.switchTo().window(ikinciSayfaWindowHandleDegeri);


        us01Page.emailButonu.sendKeys(ConfigReader.getProperty("acibadememail") + Keys.TAB);
        us01Page.sifreButonu.sendKeys(ConfigReader.getProperty("acibademsifre"));
        us01Page.uyelikGirisButonu.click();
        Thread.sleep(2000);

    }

    @And("Kullanici randevular butonunu tiklar")
    public void kullaniciRandevularButonunuTiklar() throws InterruptedException {

        us01Page.randevularButonu.click();
        Thread.sleep(2000);
    }

    @And("Kullanici hastane secer")
    public void kullaniciHastaneSecer() throws InterruptedException {

        us01Page.hastanelerButon.click();
        Thread.sleep(2000);
        us01Page.hastaneIsmi.click();
    }


    @And("Kullanici servis secer")
    public void kullaniciServisSecer() throws InterruptedException {
        us01Page.servislerButonu.click();
        Thread.sleep(2000);
        us01Page.servisIsmi.click();
        Thread.sleep(2000);


    }

    @And("Kullanici doktor secer")
    public void kullaniciDoktorSecer() throws InterruptedException {
        us01Page.doktorButonu.click();
        Thread.sleep(2000);
        us01Page.doktorIsmi.click();
    }


    @And("Kullanici randevu tarih ve saati secer")
    public void kullaniciRandevuTarihVeSaatiSecer() throws InterruptedException {
        us01Page.ileriTarihIkonu.click();
        Thread.sleep(2000);
        us01Page.tarihVeSaat.click();
        Thread.sleep(2000);
    }

    @And("Kullanici onayla butonuna basar")
    public void kullaniciOnaylaButonunaBasar() throws InterruptedException {
        us01Page.randevuOnayButonu.click();
        Thread.sleep(2000);

    }

    @And("Kullanici randevunuz basariyla alinmistir yazisini gorur")
    public void kullaniciRandevunuzBasariylaAlinmistirYazisiniGorur() throws InterruptedException {
        WebElement actualYazi = us01Page.randevuAlinmistirYazisi;
        Assert.assertTrue(actualYazi.isDisplayed());
        Thread.sleep(2000);

    }

    @Then("Kullanici randevularim butonunu tiklar")
    public void kullaniciRandevularimButonunuTiklar() throws InterruptedException {
        us01Page.randevuOnaySonrasiRandevularimButonu.click();
        Thread.sleep(2000);
    }

    @And("Kullanici iptal etmek istedigi randevunun iptal et butonunu tiklar")
    public void kullaniciIptalEtmekIstedigiRandevununIptalEtButonunuTiklar() throws InterruptedException {
        us01Page.randevuIptalButonu.click();
        Thread.sleep(2000);


    }

    @And("Kullanici evet butonunu tiklar")
    public void kullaniciEvetButonunuTiklar() {
        us01Page.iptalEvetButonu.click();

    }

}










