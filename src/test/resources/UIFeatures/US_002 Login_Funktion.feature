Feature: Als a User soll ich mich bei meinem Konto anmelden

  Background:
    When Der User open Lidl-StartSite "Lidl_Startseite" link
    And Der User klickt auf Mein Konto-Button.

  Scenario: TC_001 Der User kann sich mit gueltigen Daten anmelden.
    And Der User gibt eine gueltige "Email_adresse" in das Email-Handynummer-Textfeld ein.
    And Der User klickt auf Weiter-Button.
    And Der User gibt ein gueltiges "Passwort" in das Paswort-Textfeld ein.
    Then Der User sieht "erfolgreiche_Login_Meldung" Meldung.

  Scenario: TC_002 Der User darf sich nicht mit ungueltiger Email_Adresse anmelden.
    When Der User open Lidl-StartSite "Lidl_Startseite" link

    And Der User gibt eine ungueltige "ungueltige_Email_Adresse" in das Email-Handynummer-Textfeld.
    And Der User klickt auf Weiter-Button.
    Then Der User sieht "fehler_EmailOderPhone" Meldung.

  Scenario: TC_003 Der User darf sich nicht mit ungueltigem Passwort anmelden.
    When Der User open Lidl-StartSite "Lidl_Startseite" link

    And Der User gibt eine gueltige "email_adresse" in das Email-Handynummer-Textfeld.
    And Der User klickt auf Weiter-Button.
    And Der User gibt ein ungueltiges "ungueltiges_Passwort" in das Paswort-Textfeld ein.
    Then Der User sieht "falsches_Passwort" Meldung.



