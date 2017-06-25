# Descrizione del dominio applicativo

## Progetti

* **writer-spring-boot** è il primo progetto che deve essere mandato in esecuzione sul proprio calcolatore
* **writer-docker-su-swarm** è il secondo progetto in esecuzione sullo swarm `swarm.inf.uniroma3.it`

## Dominio applicativo

Il servizio principale `writer` fornisce informazioni (casuali) sugli scrittori.

Il servizio writer fornisce due operazioni:
* `/writer/<scrittore>/<anno>` restituisce informazioni (casuali) per il quale un certo `<scrittore>` è
famoso e informazioni sul numero di libri che ha realizzato in quel particolare `<anno>`

* `/writer/<scrittore>` restituisce invece informazioni (casuali) per il quale un certo `<scrittore>` è
famoso e informazioni sul numero (casuale) di libri che ha realizzato dalla sua nascita.

Ad esempio,
* la richiesta `/writer/pirandello/1802` potrebbe restituire “Pirandello è famoso per il libro Il fu
Mattia Pascal e nel 1802 ha scritto 2 libri”

* la richiesta `/writer/pirandello` potrebbe restituire “Pirandello è famoso per il libro Il fu Mattia Pascal e dalla sua nascita ha scritto 20 libri”

Il servizio `writer` è implementato come client di due servizi secondari `masterpiece` e `production`, con le caratteristiche
descritte nel seguito.

Il servizio `masterpiece` fornisce un’operazione:
* `masterpiece/<scrittore>` restituisce un motivo (casuale) per cui un certo `<scrittore>` è famoso

Ad esempio,
* la richiesta `/masterpiece/dante` potrebbe restituire “La Divina Commedia”

Inoltre, il servizio `production` fornisce due operazioni:

* production/`<scrittore>/<anno>` restituisce il numero (casuale) di libri che un certo `<scrittore>` ha
realizzato in quel determinato `<anno>`
* `production/<scrittore>` restituisce il numero di libri (casuale) che un certo `<scrittore>` ha realizzato nel complessivo

Ad esempio,
* la richiesta `/production/pirandello/1906` potrebbe restituire “ 3”
* la richiesta `/production/dante` potrebbe restituire “19”

Il servizio `writer` risponde al suo client usufruendo dei servizi `masterpiece` e `production` e integrando le loro risposte.



