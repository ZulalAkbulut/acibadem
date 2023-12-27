package stepDefinitions;


import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US09Page;
import utilities.Driver;
import utilities.ReusableMethods;


public class US09StepDefinitions {
    US09Page page=new US09Page();

    @Then("Yol Tarifi Alın linkinin tiklanabilir oldugunu dogrular")
    public void yolTarifiAlınLinkininTiklanabilirOldugunuDogrular() {
        ReusableMethods.scroll(page.yoltarifi);
        Assert.assertTrue(page.yoltarifi.isDisplayed()&& page.yoltarifi.isEnabled());
        ReusableMethods.waitFor(2);
        ReusableMethods.click(page.yoltarifi);
        ReusableMethods.waitFor(2);
    }
    @Then("Yol Tarifi Alın linkinin Google Maps'e yonlendirdigini dogrular")
    public void yolTarifiAlınLinkininGoogleMapsEYonlendirdiginiDogrular() {
        ReusableMethods.switchToWindow(1);
        Assert.assertTrue( Driver.getDriver().getCurrentUrl().contains("google"));
        ReusableMethods.scroll(page.tumunuKabulEtGoogle);
        ReusableMethods.click(page.tumunuKabulEtGoogle);
        String url=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(url.contains("maps"));
    }
}
