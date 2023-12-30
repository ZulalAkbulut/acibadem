@US07n
Feature: US_07 Acibadem sayfasinda Canli Destege mesaj gonderememeli
  Scenario: TC_02 Kullanici Canli Destege mesaj gonderir
    Given Kullanici Anasayfaya gider.
    When Kullanici iletisim sekmesine tiklar
    When Kullanici Canli Destek butonuna tiklar
    And Kullanici mesaj sayfasinin ciktigini dogrular
    And Kullanici Name kutusuna tiklar
    And Kullanici bir isim yazar
    And Kullanici Message kutusuna tiklar
    And Kullanici mesajini yazar
    And Kullanici canli destegi baslat butonunu gorur
    And Kullanici canli destegi baslat butonuna tiklar
    Then Kullanici "Enter a valid email address." yazisinin ciktigini dogrular