package stepDefinitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.US02Page;

import static utilities.Driver.driver;

public class US02StepDefinitions {

    US02Page us02Page = new US02Page();

    @Then("Kulanici anasayfadaki hastaneler butonunu tiklar")
    public void kulanici_anasayfadaki_hastaneler_butonunu_tiklar() {
        us02Page.hastanelerButonu.click();
    }


    @And("Kullanici istedigi lokasyon turunu secer")
    public void kullaniciIstedigiLokasyonTurunuSecer() throws InterruptedException {
        if (!us02Page.lokasyonHastaneButonu.isSelected()){
            us02Page.lokasyonHastaneButonu.click();
        }

        Thread.sleep(2000);
    }

    @And("Kullanici aradigi hastaneyi secer")
    public void kullaniciAradigiHastaneyiSecer() {
        us02Page.arananHastane.click();

    }

    @And("Kullanici hastane bilgilerini gorur")
    public void kullaniciHastaneBilgileriniGorur() {
        String istenenKelime="Adana Hastanesi";
        String actualTitle=driver.getTitle();
        Assert.assertTrue(actualTitle.contains(istenenKelime));

    }
}
