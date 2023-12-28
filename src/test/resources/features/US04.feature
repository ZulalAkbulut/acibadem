@US04_TC01
Feature: US04 Select the device on the medical technologies page
  Background: acibadem sitesine giris
    Given acibadem sitesine gidilir
    When medikal teknolojiler butonuna tiklanir

@tc01
    Scenario:

    And  Lokasyon Seciniz butonunu tikla
    And  Lokasyon  Bakirköy Hastanesi secilir
    And Tibbi Birim Seciniz butonuna tiklanir
    And Tibbi birim secilir Kardiyoloji
    And Cihaz Turu seciniz tiklanir
    And Cihaz turu secilir Tanı
    Then Sayfada cihazin goruldugu dogrulanir
    And sayfa kapatilir
@tc02
  Scenario: Acilan sayfada secilen lokasyonda bulunan tum cihazlar gorulebilmelidir.
    And  Lokasyon Seciniz butonunu tikla
    And Lokasyon olarak Maslak secilir
    Then Maslak locasyonundaki tum cihazlarin goruntulendigini dogrular


  @tc03
  Scenario: Acilan sayfada secilen birimde olan tum cihazlar gorulmeli
    And Tibbi Birim Seciniz
    And Tibbi birim olarak Nöroloji secilir
    Then Tum cihazlarin gorundugunu dogrular