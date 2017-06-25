# Primo progetto di Architetture dei Sistemi Software (2016/2017)

## writers-spring-boot
Questa cartella contiene l'applicazione realizzata per il primo progetto (da eseguire in locale sul proprio calcolatore) per il corso di Architetture dei Sistemi Software A.A 2016/2017:
* **springboot-writer** è un servizio per la generazione di informazioni casuali sugli scrittori, che accede i servizi di **springboot-production** e **springboot-masterpiece**
* **springboot-production** è un servizio per la generazione di informazioni casuali sul numero di opere realizzate da uno scrittore utilizzato dal servizio **springboot-writer**
* **springboot-masterpiece** è un servizio per la generazione di informazioni casuali per il quale un certo scrittore è famoso utilizzato dal servizio **springboot-writer**

## Compilazione
Per compilare l'applicazione fare quanto segue, dalla cartella corrente:
`./build-all-projects.sh`

## Esecuzione
Per eseguire l'applicazione fare quanto segue, in terminali diversi:
* posizionarsi nella cartella springboot-writer ed eseguire lo script `./run-writers.sh`
* posizionarsi nella cartella springboot-masterpiece ed eseguire lo script `./run-masterpieces.sh`
* posizionarsi nella cartella springboot-production ed eseguire lo script `./run-productions.sh`
