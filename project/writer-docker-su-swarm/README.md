## writers-spring-boot
Questo progetto contiene l'applicazione realizzata per il corso di Architetture dei Sistemi Software A.A 2016/2017 :
* **writer-service** è un servizio per la generazione di informazioni casuali sugli scrittori, che accede i servizi di **production-service** e **masterpiece-service**
* **production-service** è un servizio per la generazione di informazioni casuali sul numero di opere realizzate da uno scrittore utilizzato dal servizio **writer-service**
* **masterpiece-service** è un servizio per la generazione di informazioni casuali per il quale un certo scrittore è famoso utilizzato dal servizio **writer-service**
* **eureka-server** è un servizio di service discovery di tipo client-server
* **zuul** è un servizio che fornisce un punto di accesso integrato all'applicazione e ai suoi servizi

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

Il servizio `writer` è implementato come client di due servizi secondari `masterpiece` e `production`, con le caratteristiche
descritte nel seguito.

Il servizio `masterpiece` fornisce un’operazione:
* `masterpiece/<scrittore>` restituisce un motivo (casuale) per cui un certo `<scrittore>` è famoso

Ad esempio,
* la richiesta `/masterpiece/dante` potrebbe restituire “La Divina Commedia”

Inoltre, il servizio `production` fornisce due operazioni:

* `production/<scrittore>/<anno>` restituisce il numero (casuale) di libri che un certo `<scrittore>` ha
realizzato in quel determinato `<anno>`
* `productions/<scrittore>` restituisce il numero di libri (casuale) che un certo `<scrittore>` ha realizzato nel complessivo

Ad esempio,
* la richiesta `/production/pirandello/1906` potrebbe restituire “ 3”
* la richiesta `/production/dante` potrebbe restituire “19”

Il servizio `writer` risponde al suo client usufruendo dei servizi `masterpiece` e `production` e integrando le loro risposte.

## Esecuzione
Le seguenti istruzioni che seguono vanno intese come esempio, e non come istruzioni da eseguire direttamente

Istruzioni per il rilascio dell'applicazione **writer** su **swarm.inf.uniroma3.it** 
(operazioni da eseguire dalla cartella *writer-docker-su-swarm*): 
  
* nella macchina [developer](../../environments/developer/), eseguire lo script `./build-all-projects.sh`

* poi, nella macchina [docker](../../environments/docker/), eseguire lo script `./build-all-images.sh`

* poi, nella macchina [docker](../../environments/docker/), eseguire lo script `./push-all-images.sh`

* infine, nella macchina [docker](../../environments/docker/), eseguire lo script `./start-writer-stack.sh`

Dopo di che, l'applicazione sarà accessibile al link [http://swarm.inf.uniroma3.it:9014/](http://swarm.inf.uniroma3.it:9014/).
