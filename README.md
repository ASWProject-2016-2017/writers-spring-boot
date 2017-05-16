# Progetto di Architetture dei Sistemi Software (2016/2017)

## Composizione del gruppo:
* Susanna Marinai
* Federico Yusteenappar
* Giuseppe D'Acunzo

## writers-spring-boot
Questo progetto contiene l'applicazione realizzata per il corso di Architetture dei Sistemi Software A.A 2016/2017 :
* **springboot-writers** è un servizio per la generazione di informazioni casuali sugli scrittori, che accede i servizi di **springboot-productions** e **springboot-masterpieces**
* **springboot-productions** è un servizio per la generazione di informazioni casuali sul numero di opere realizzate da uno scrittore utilizzato dal servizio **springboot-writers**
* **springboot-masterpieces** è un servizio per la generazione di informazioni casuali per il quale un certo scrittore è famoso utilizzato dal servizio **springboot-writers**

## Descrizione del dominio applicativo
Il servizio principale `writer` fornisce informazioni (casuali) sugli scrittori
Il servizio writer fornisce due operazioni:
* `/writer/<scrittore>/<anno>` restituisce informazioni (casuali) per il quale un certo `<scrittore>` è
famoso e informazioni sul numero di libri che ha realizzato in quel particolare `<anno>`

* `/writer/<scrittore>` restituisce invece informazioni (casuali) per il quale un certo `<scrittore>` è
famoso e informazioni sul numero (casuale) di libri che ha realizzato dalla sua nascita.

Ad esempio,
* la richiesta `/writer/pirandello/1802` potrebbe restituire “Pirandello è famoso per il libro Il fu
Mattia Pascal e nel 1802 ha scritto 2 libri”

* la richiesta `/writer/pirandello` potrebbe restituire “Pirandello è famoso per il libro Il fu Mattia Pascal e dalla sua nascita ha scritto 20 libri”

Il servizio `writer` è implementato come client di due servizi secondari `masterpices` e `productions`, con le caratteristiche
descritte nel seguito.

Il servizio `masterpices` fornisce un’operazione:
* `masterpieces/<scrittore>` restituisce un motivo (casuale) per cui un certo `<scrittore>` è famoso

Ad esempio,
* la richiesta `/masterpieces/dante` potrebbe restituire “La Divina Commedia”

Inoltre, il servizio `productions` fornisce due operazioni:

* productions/`<scrittore>/<anno>` restituisce il numero (casuale) di libri che un certo `<scrittore>` ha
realizzato in quel determinato `<anno>`
* `productions/<scrittore>` restituisce il numero di libri (casuale) che un certo `<scrittore>` ha realizzato nel complessivo

Ad esempio,
* la richiesta `/productions/pirandello/1906` potrebbe restituire “ 3”
* la richiesta `/productions/dante` potrebbe restituire “19”

Il servizio `writer` risponde al suo client usufruendo dei servizi `masterpieces` e `productions` e integrando le loro risposte.

## Esecuzione
Per compilare ed eseguire l'applicazione fare quanto segue, in terminali diversi:
* posizionarsi nella cartella springboot-writers ed eseguire lo script `./run-writers.sh` 
* posizionarsi nella cartella springboot-masterpieces ed eseguire lo script `./run-masterpieces.sh` 
* posizionarsi nella cartella springboot-productions ed eseguire lo script `./run-productions.sh` 
