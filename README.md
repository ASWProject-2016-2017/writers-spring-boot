# Progetto di Architetture dei Sistemi Software (2016/2017)

## Composizione del gruppo:
* Susanna Marinai
* Federico Yusteenappar
* Giuseppe D'Acunzo

Questo repository contiene il codice del *progetto di Architetture dei sistemi Software (2016/2017)* 
basato su una semplice *applicazione software distribuita* 
(basato sull'uso di *middleware*), 
che va eseguito in degli opportuni *ambienti distribuiti*: 
* il software è scritto in [Java](http://www.oracle.com/technetwork/java/index.html), 
  e costruito con [Gradle](http://gradle.org/); 
* ciascun ambiente di esecuzione distribuito è composto 
  da una o più macchine virtuali create con 
  [VirtualBox](https://www.virtualbox.org/)
  e [Vagrant](https://www.vagrantup.com/), 
  e accedute tramite [Git](https://git-scm.com/); 
* inoltre, alcuni ambienti di esecuzione  
  sono basati su contenitori 
  [Docker](https://www.docker.com/). 

## Software da installare sul proprio PC 

### Per lo sviluppo del software 

* [Java SDK](http://www.oracle.com/technetwork/java/javase/) 
* [Gradle](http://gradle.org/) 
* [Git](https://git-scm.com/) 

### Per la gestione degli ambienti di esecuzione  

* [VirtualBox](https://www.virtualbox.org/)
* [Vagrant](https://www.vagrantup.com/) 
* [Git](https://git-scm.com/) 

[Docker](https://www.docker.com/) non è invece necessario, 
poichè può essere eseguito nelle macchine virtuali. 

## Organizzazione del repository 

Questo repository è organizzato in diverse sezioni (cartelle): 
* [projects](projects/) contiene il codice della *applicazione distribuita*, 
  con una sottosezione (sottocartella) per ciascuno degli argomenti del corso; 
* [environments](environments/) contiene il codice per la gestione degli *ambienti distribuiti*, 
  con una sottosezione (sottocartella) per ciascuno degli ambienti distribuiti 
  su cui poter eseguire la applicazione distribuita sviluppata. 

Queste due sezioni non sono indipendenti, ma correlate (in modo non banale). 


## Accesso al repository 

Per effettuare il download del repository, usare il seguente comando Git 
dalla cartella locale in cui si vuole scaricare il repository: 

    git clone https://github.com/ASWProject-2016-2017/writers-spring-boot.git

Oppure (se il sistema host è Windows): 

    git clone --config core.autocrlf=input https://github.com/ASWProject-2016-2017/writers-spring-boot.git

Per aggiornare il contenuto della propria copia locale del repository, 
usare il seguente comando Git dalla cartella locale in cui è stato scaricato il repository: 

    git pull 