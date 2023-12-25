@US05_TC01
Feature: US04 Select the device on the medical technologies page
  Background: acibadem sitesine giris

    Given acibadem sitesine gidilir
    When medikal teknolojiler butonuna tiklanir
    And Lokasyon Seciniz butonunu tiklanir
    And  Lokasyon secilir "<lokasyon>"
    And Tibbi Birim Seciniz butonuna tiklanir
    And Tibbi birim secilir "<birim>"
    And Cihaz Turu seciniz tiklanir
    And Cihaz turu secilir "<cihaz>"
    Then Sayfada cihazin goruldugu dogrulanir
    And sayfa kapatilir