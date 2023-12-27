Feature: US09 Yol Tarifi Alma
@09
  Scenario: Kullanıcı yol tarifi almak icin gerekli uygulamaya ulasir
    Given Kullanici "https://www.acibadem.com.tr/" webadresine gider
    When İLETİŞİM sekmesine tiklar
    Then Yol Tarifi Alın linkinin tiklanabilir oldugunu dogrular
    Then Yol Tarifi Alın linkinin Google Maps'e yonlendirdigini dogrular
