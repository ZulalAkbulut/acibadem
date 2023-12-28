Feature: Kullanici lokasyona uygun hastane secer

  @ZulalUS02
  Scenario: Kullanici lokasyona uygun hastane secer

    Given Kullanici acibadem anasayfaya gider
    Then Kulanici anasayfadaki hastaneler butonunu tiklar
    And Kullanici istedigi lokasyon turunu secer
    And Kullanici aradigi hastaneyi secer
    And Kullanici hastane bilgilerini gorur

