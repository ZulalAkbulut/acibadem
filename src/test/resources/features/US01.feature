Feature: Kullanici randevu alir ve iptal eder

  @ZulalUS01
  Scenario: Kullanici randevu alir ve iptal eder
    Given Kullanici acibadem anasayfaya gider
    Then Kullanici uye girisi yapar
    And Kullanici randevular butonunu tiklar
    And Kullanici hastane secer
    And Kullanici servis secer
    And Kullanici doktor secer
    And Kullanici randevu tarih ve saati secer
    And Kullanici onayla butonuna basar
    And Kullanici randevunuz basariyla alinmistir yazisini gorur
    Then Kullanici randevularim butonunu tiklar
    And Kullanici iptal etmek istedigi randevunun iptal et butonunu tiklar
    And Kullanici evet butonunu tiklar



