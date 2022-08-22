Feature: Als ein User soll ich verifizieren können, wie viel Unterkategorien jede Untertegorie von Onlineshop hat.

  Scenario: TC_001 Der User sieht, wie viel Unterkategorien jede Untertegorie von Onlineshop hat.

    When Der User oeffnet Lidl-StartSite "Lidl_Startseite" link
    And Der User klickt auf Zustimmen-Button.
    And Der User klickt auf "Onlineshop" Kategorie.
    And Der User klickt auf "Outdoor & Sport" Unterkategorie.
    And Der User klickt auf Alles anzeigen-Button.
    Then Der User sieht,dass es 15 Unterkategorien gibt.

  Scenario: TC_002 Der User sieht, wie viel Unterkategorien von Unterkategorien von Untertegorie von Onlineshop hat.

    When Der User oeffnet Lidl-StartSite "Lidl_Startseite" link
    And Der User klickt auf Zustimmen-Button.
    And Der User klickt auf "Onlineshop" Kategorie.
    And Der User klickt auf "Haushalt & Küche" Unterkategorie.
    And Der User klickt auf "Haushalt" UnterUnterkategorie.
    Then Der User sieht,dass es 10 Unterunterkategorien gibt.
