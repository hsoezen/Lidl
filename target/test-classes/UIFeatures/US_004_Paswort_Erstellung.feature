Feature: Das Paswort soll gemaess der Passwortanleitung sein.
  #gueltiges Passwort
  #mindestens 10 Zeichen lang
  #mindestens 10 Zeichen lang
  #mindestens 1Kleinbuchstabe
  #mindestens 1Grossbuchstabe
  #mindestens 1Zahl
  #mindestens 1Sonderzeichen


  Scenario Outline:
    When Der User open Lidl-StartSite "Lidl_Startseite" link
    And Der User klickt auf Zustimmen-Button.
    And Der User klickt auf Mein Konto-Button.
    And Der User klickt auf Registirieren_button.
    And Der User gibt eine gueltige "Email_adresse_Registirierung" Email-Adresse in das Email-Textfeld ein.
    And Der User gibt gleiche "Email_adresse_Registirierung" Email-Adresse" in das Email-Bestaetigung-Textfeld ein.
    And Der User gibt ein Paswort <"Passwort"> ein.
    Then Der User sieht, dass die <"Bedingung GRUEN"> wird.

    Examples:
      | "Passwort"   | "Bedingung GRUEN" |
      #gueltiges Passwort
      | "Hs.1234567" | 7                 |
      #mindestens 10 Zeichen lang
      | "1234567890" | 2                 |
      #mindestens 1Kleinbuchstabe
      | "hsasads"    | 3                 |
      #mindestens 1Grossbuchstabe
      | "HSADSFDS"   | 4                 |
      #mindestens 1Zahl
      | "12345"      | 5                 |
      #mindestens 1Sonderzeichen
      | "/§$"        | 6                 |

  @password
  Scenario Outline: TC_002 Wenn das Passwort die Bedingungen nicht erfüllt, sieht der User die Bedingung ROT.

    When Der User open Lidl-StartSite "Lidl_Startseite" link
    And Der User klickt auf Zustimmen-Button.
    And Der User klickt auf Mein Konto-Button.
    And Der User klickt auf Registirieren_button.
    And Der User gibt eine gueltige "Email_adresse_Registirierung" Email-Adresse in das Email-Textfeld ein.
    And Der User gibt gleiche "Email_adresse_Registirierung" Email-Adresse" in das Email-Bestaetigung-Textfeld ein.
    And Der User gibt ein Paswort <"Passwort"> ein.
    And Der User klickt auf Registirierung-Weiter-Button.
    Then Der User sieht, dass die <"Bedingung ROT"> rot wird.

    Examples:
      | "Passwort"   | "Bedingung ROT" |
      #9_Zeichnen_Passwort
      | "Hs.123456"  | 2               |
      #ohne_Kleinbuchstabe_Passwort
      | "HS.1234567" | 3               |
      #ohne_Grossbuchstabe_Passwort
      | "hs.1234567" | 4               |
      #ohne_Zahl_Passwort
      | "Hs.wertzuh" | 5               |
      #ohne_Sonderzeichnen_Passwort
      | "Hs12345678" | 6               |












