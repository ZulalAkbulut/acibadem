package stepDefinitions;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import pages.US07Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.driver;
import static utilities.ReusableMethods.*;


public class US07StepDefinitions {

    US07Page us07Page = new US07Page();

    @When("Kullanici iletisim sekmesine tiklar")
    public void kullaniciIletisimSekmesineTiklar() throws InterruptedException {
        ReusableMethods.waitFor(5);
        us07Page.iletisimSekmesi.click();
    }


    @When("Kullanici Canli Destek butonuna tiklar")
    public void kullaniciCanliDestekButonunaTiklar() {
        us07Page.canlidestek.click();
    }


    @And("Kullanici mesaj sayfasinin ciktigini dogrular")
    public void kullaniciMesajSayfasininCiktiginiDogrular() throws InterruptedException {
        Thread.sleep(9999);
        driver.switchTo().defaultContent();
        Thread.sleep(9999);
        String handle = Driver.getDriver().getWindowHandle();
        System.out.println(handle);
        driver.switchTo().frame(us07Page.MessageBox);
        System.out.println(us07Page.MessageBox.isDisplayed());
    }

    @And("Kullanici Name kutusuna tiklar")
    public void kullaniciNameKutusunaTiklar() {
        us07Page.namebutton.click();
    }

    @And("Kullanici bir isim yazar")
    public void kullaniciBirIsimYazar() {
        us07Page.namebutton.sendKeys("Kubra");
    }

    @And("Kullanici Email kutusuna tiklar")
    public void kullaniciEmailKutusunaTiklar() {
        us07Page.emailbutton.click();
    }

    @And("Kullanici Email yazar")
    public void kullaniciEmailYazar() {
        us07Page.emailbutton.sendKeys("fkbr96@gmail.com");
    }

    @And("Kullanici Message kutusuna tiklar")
    public void kullaniciMessageKutusunaTiklar() {
        us07Page.messagebutton.click();
    }

    @And("Kullanici mesajini yazar")
    public void kullaniciMesajiniYazar() {
        us07Page.messagebutton.sendKeys("Merhaba");
    }

    @And("Kullanici canli destegi baslat butonunu gorur")
    public void kullaniciCanliDestegiBaslatButonunuGorur() {
        System.out.println(us07Page.startLiveSupport.isDisplayed());
    }

    @And("Kullanici canli destegi baslat butonuna tiklar")
    public void kullaniciCanliDestegiBaslatButonunaTiklar() {
        us07Page.startLiveSupport.click();
    }

    @Then("Kullanici canli destegin baslatildigini dogrular")
    public void kullaniciCanliDesteginBaslatildiginiDogrular() {
        us07Page.mesajGonderildi.isDisplayed();
        System.out.println("Canli destek baslatildi");
    }

    @Then("Kullanici {string} yazisinin ciktigini dogrular")
    public void kullaniciYazisininCiktiginiDogrular(String arg0) {
        waitFor(2);
        us07Page.uyari.isDisplayed();
        System.out.println("Enter a valid email address.");
    }
}