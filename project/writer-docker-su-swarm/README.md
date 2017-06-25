# Secondo progetto di Architetture dei Sistemi Software 2016/2017

## writer-docker-su-swarm
Questo progetto contiene l'applicazione realizzata per il secondo progetto (in esecuzione sullo swarm) del corso di Architetture dei Sistemi Software A.A 2016/2017:
* **writer-service** è un servizio per la generazione di informazioni casuali sugli scrittori, che accede i servizi di **production-service** e **masterpiece-service**
* **production-service** è un servizio per la generazione di informazioni casuali sul numero di opere realizzate da uno scrittore utilizzato dal servizio **writer-service**
* **masterpiece-service** è un servizio per la generazione di informazioni casuali per il quale un certo scrittore è famoso utilizzato dal servizio **writer-service**
* **eureka-server** è un servizio di service discovery di tipo client-server
* **zuul** è un servizio che fornisce un punto di accesso integrato all'applicazione e ai suoi servizi

## Esecuzione
Le istruzioni che seguono vanno intese come esempio, e non come istruzioni da eseguire direttamente

Istruzioni per il rilascio dell'applicazione **writer** su **swarm.inf.uniroma3.it**
(operazioni da eseguire dalla cartella *writer-docker-su-swarm*):

* nella macchina [developer](../../environments/developer/), eseguire lo script `./build-all-projects.sh`

* poi, nella macchina [docker](../../environments/docker/), eseguire lo script `./build-all-images.sh`

* poi, nella macchina [docker](../../environments/docker/), eseguire lo script `./push-all-images.sh`

* infine, nella macchina [docker](../../environments/docker/), eseguire lo script `./start-writer-stack.sh`

Dopo di che, l'applicazione sarà accessibile al link [http://swarm.inf.uniroma3.it:9014/](http://swarm.inf.uniroma3.it:9014/).
