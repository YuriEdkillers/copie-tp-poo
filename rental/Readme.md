TP6: pierre feuille ciseaux
====================

TP réalisé par Wiels Arthur & Kril Edouard

objectifs
---------

Réaliser un jeu de pierre feuille ciseaux "fonctionnel", avec des stratégies prédéfinies.

travail réalisé
---------------

Le jeu est fonctionnel, le main créé un jeu de 5 rounds entre 2 joueurs, dont un humain.
5 stratégies sont définies: 3 pour jouer chaque Shape indéfiniment, 1 pour jouer une Shape aléatoire et 1 pour laisser un humain jouer la Shape qu'il souhaite.

instructions
------------

Pour compiler le projet: depuis la racine, éxécutez la commande :

     make

Pour compiler les test: éxécutez la commande:

     make test

Pour générer la documention: éxécutez la commande:

     make doc

Pour créer l'éxécutable battleship.jar: éxécutez la commande:

     make exe

Pour jouer:

     java -jar rps.jar

Pour supprimer tout ce qui a été compilé:

     make clean