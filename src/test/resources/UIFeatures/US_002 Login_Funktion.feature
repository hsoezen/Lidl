
Feature: Als a User soll ich mich bei meinem Konto anmelden

  Background:
    When Der User open Lidl-StartSite "Lidl_Startseite" link
    And Der User klickt auf Mein Konto-Button.
    And Der User klickt auf Zustimmen-Button.

  Scenario: TC_001 Der User kann sich mit gueltigen Daten anmelden.
    And Der User gibt eine gueltige "Email_Adresse" in das Email-Handynummer-Textfeld ein.
    And Der User klickt auf Weiter-Button.
    And Der User gibt ein gueltiges "Passwort" in das Paswort-Textfeld ein.
    And Der User klickt auf Weiter(Passwort)-Button.
    Then Der User sieht "erfolgreiche_Login_Meldung" Erfolg-Meldung.

  Scenario: TC_002 Der User darf sich nicht mit ungueltiger Email_Adresse anmelden.

    And Der User gibt eine ungueltige "ungueltige_Email_Adresse" in das Email-Handynummer-Textfeld.
    And Der User klickt auf Weiter-Button.
    Then Der User sieht "fehler_EmailOderPhone" EmailFehler-Meldung.

  Scenario: TC_003 Der User darf sich nicht mit ungueltigem Passwort anmelden.

    And Der User gibt eine gueltige "Email_Adresse" in das Email-Handynummer-Textfeld ein.
    And Der User klickt auf Weiter-Button.
    And Der User gibt ein ungueltiges "ungueltiges_Passwort" in das Paswort-Textfeld ein.
    And Der User klickt auf Weiter(Passwort)-Button.
    Then Der User sieht "falsches_Passwort_fehler" PaswortFehler-Meldung.

    Scenario: TC_004 Wenn der User das ungueltiges Passwort drei Mal eingibt, erhaelt eine Sicherheit-Meldung.

      And Der User gibt eine gueltige "Email_Adresse" in das Email-Handynummer-Textfeld ein.
      And Der User klickt auf Weiter-Button.
      And Der User gibt ungueltiges "ungueltiges_Passwort" drei Mal in das Paswort-Textfeld  ein.
      Then Der User sieht eine "sicherheit_meldung" Sicherheitsmeldung.



