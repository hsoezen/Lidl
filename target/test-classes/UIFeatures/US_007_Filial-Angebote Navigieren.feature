Feature: Als ein User möchte ich in Filial-Angebote surfen.

  Background:
    When Der User oeffnet Lidl-StartSite "Lidl_Startseite" link
    And Der User klickt auf Zustimmen-Button.
    And Der User klickt auf "Filial-Angebote" Kategorie.

  Scenario: TC_001 Der User sieht die Produkte in seinen gewuescheten Unterkategorie.

    And Der User klickt auf "Unsere Testergebnisse" Unterkategorie von Filiale-Angebote.
    Then Der User sieht in "Unsere Prospekte", dass Produkt "Ocean Sea Eismeergarnelen aus Grönland, ohne Schale" steht.

  Scenario: TC_002 Der User kann die Prospekte anschauen.
    And Der User klickt auf "Unsere Prospekte" Unterkategorie von Filiale-Angebote.
    Then Der User sieht, dass der Prospekt "Grillen-Magazin" mit Datum oder Titel "Weltweit ein Fest" auf der "Unsere Prospekte" Seite steht.

    Scenario: TC_003 Der User kann seinen gewuenschten Prospekt herunterladen.
      And Der User klickt auf "Unsere Prospekte" Unterkategorie von Filiale-Angebote.
      Then Der User sieht, dass der Prospekt "Grillen-Magazin" mit Datum oder Titel "Weltweit ein Fest" auf der "Unsere Prospekte" Seite steht.
      And Der User klickt auf Herunterladenikone von Prospekt "Grillen-Magazin".
      Then Der User sieht, dass dieser Prospekt auf seinem Computer heruntergeladen wurde.
