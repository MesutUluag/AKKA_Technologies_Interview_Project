# Projektarbeit Schwerpunkt Backend

REST-Schnittstelle, Formularaufbau, Validierung

# Vorab

* Es sind mehr TODOs als an einem Tag zu schaffen sind. Das Wie und Warum ist im Zweifelsfall wichtiger als die
Vollständigkeit. 
* Das Layout muss nicht schön sein, es sollte nur funktionieren. 
* Das Projekt sollte zum Schluss vollständig durchlaufen. Der Aufruf `mvn clean verify` muss erfolgreich sein.

# Aufgabe

Die Web-Applikation kann mit `mvn spring-boot:run` gestartet werden. Sie ist aufrufbar mittels: [http://localhost:8080/klt](http://localhost:8080/klt)
Die Seite umfasst ein Anmeldeformular mit Vor- und Nachnamen. Die Anwendung soll in dieser Aufgabe Schritt für Schritt erweitert werden.

1. Es soll möglich sein, das Formular abzusenden. Steht in allen Feldern etwas drin, so soll eine Information erscheinen:
   "Vielen Dank für ihre Angaben". Im Fehlerfall soll wieder das Formular erscheinen und die fehlerhaften Felder markiert werden.

2. Es soll ein neuer REST-Service hinzugefügt werden. Unter der Adresse GET /klt/rest/age/{age} (wobei {age} eine Zahl ist) sollen folgende Status zurückgegeben werden:
   * Werte < 18 resultieren in der Meldung "zu jung"
   * Werte > 67 resultieren in der Meldung "zu alt"
   * Ist der Wert eine Primzahl, kommt die Meldung: "lustig"
   * Sonst "OK"
 
3. Zu der Methode im REST-Service soll ein neuer JUnit-Test geschrieben werden, der im Build-Prozess auch ausgeführt wird.

4. Die aus 1. erfolgreich abgespeicherten Anfragen sollen abgespeichert werden. Die gespeicherten Anfragen müssen nach einem
   Neustart der Applikation nicht weiter bestehen.

5. Es soll einen neuen REST-Service geben, der alle gespeicherten Anfragen als eine Liste ausgibt

6. Es soll eine neue Webseite geben, die alle gespeicherten Anfragen anzeigt als Liste anzeigt. 

7. Dem Formular auf der Startseite soll ein neues Feld hinzugefügt werden mit dem Label "Age". Das Alter soll auch mit abgespeichert werden.

8. Es soll eine Instant-AJAX/REST-Validierung mittels der oben erstellten REST-Service durchgeführt werden, wenn der User das Alter-Feld verlässt und der ensprechende Status angezeigt werden. 

9. Ein Abspeichern des Formulars soll nicht möglich sein, wenn der Status nicht "OK" oder "lustig" ist.

10. Ein neuer REST-Service, der analog zu den anderen umzusetzen ist, soll ermöglichen, einen Antrag zu löschen.

11. In der Liste der gespeicherten Anfragen in 5. soll zusätzlich bei jeder Anfrage ein Button erscheinen, der es ermöglicht,
   diese spezifische Anfrage via REST-Service wieder zu löschen.
