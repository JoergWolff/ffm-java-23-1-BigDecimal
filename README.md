# ffm-java-23-1-BigDecimal


Erstellt eine Record 'Client' mit den Eigenschaften Vorname, Nachname und Kundennummer (wähle geeignete englische Feldnamen).

Erstellt eine Klasse 'Account' (kein Record, soll vorerst veränderlich sein) mit den Eigenschaften Kontonummer (String), Kontostand (BigDecimal) und dem zugehörigen Kunden.

Bitte poste hier den Link zu eurem GitHub-Repository, in dem ihr eure Lösungen teilt.


Implementiert eine Methode, um Geld auf das Konto einzuzahlen.

Implementiert eine Methode, um Geld vom Konto abzuheben.


Erstellt eine Klasse 'BankService', die eine Menge von Konten verwaltet.

Implementiert eine Methode im BankService, um ein Konto zu eröffnen. Man soll dafür nur einen Kunden als Argument übergeben müssen. Es soll die neue Kontonummer zurückgeben.

Implementiert eine Methode im BankService, von einer Kontonummer (als String) einen bestimmten Betrag (als BigDecimal) auf eine andere Kontonummer (als String) zu überweisen.


Baut Eure Records und Klassen so um, dass ein Konto mehreren Kontoinhaberinnen gehören kann (zwei oder mehreren Kontoinhaberinnen).

Schreibe im Service eine Methode public List<String> split(String accountNumber), die ein Konto zu gleichen Teilen aufteilt. Aus einem Gemeinschaftskonto soll dabei pro Kontoinhaber*in ein Einzelkonto entstehen. Es soll die entstandenen neuen Kontonummern zurückgeben. Jedes Konto soll nach der Aufteilung gleich viel Geld abbekommen (+- 1 Cent). Achte darauf, dass uns als Bank dabei weder Cent-Gewinne noch Cent-Verluste entstehen.


Erweitert den 'BankService' um eine Methode, die Zinsen für alle Kundenkonten basierend auf einem Zinssatz berechnet und gutschreibt. (Zinsen = Kontostand * (Zinssatz / 100).


Schreibt Eure Klassen so um, dass es nicht mehr einen fixen Kontostand gibt, sondern eine Liste von Transaktionen. Jede Transaktion hat einen Betrag, einen Saldo (neuer Kontostand nach der Veränderung), eine Beschreibung (optional) und ein Datum. Die Transaktionen sollen als Record implementiert werden. Um den aktuellen Kontostand zu ermitteln soll der BankService das Saldo der letzten Transaktion zurückgeben.


Bei jeder Abheben- oder Einzahlen-Aktion sollen die Zinsen, die seit der letzten Transaktion angefallen sind berechnet werden. Der im BankService hinterlegte Zinssatz soll dabei den jährlichen Zins darstellen. Achtet bei der Berechnung auf den Zinseszinseffekt (bei 4% Zins sind nach einem halben Jahr noch nicht ganz 2% angefallen). Erstellt für Zins-Gutschriften (oder Zins-Belastungen) jeweils pro Transaktion eine zweite Transaktion.


