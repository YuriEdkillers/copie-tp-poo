Kril Edouard Wiels Arthur

Objectif du TP :
-Savoir créer une archive jar executable en une commande avec manifeste
-Créer des fichiers sources et fichiers Tests fonctionnels
-Tester les commandes apprises et pratiquer en implémentant les Classes Dates et month du TD


Pour example:

    pour génerer les classes:
        se placer dans le dossier src
        executer javac example/Robot.java -d ../classes
	Pour Génerer la doc:
		Se placer dans le dossier src
		executer javadoc example example.util -d ../docs
	Pour les tests:
        mettre le test-1.7.jar dans le dossier tp4
	
		Se placer dans le dossier tp4
		Compilez avec
		javac -classpath test-1.7.jar test/BoxTest.java
		puis executez avec
		java -jar test-1.7.jar BoxTest
		
		puis pour robot
		
		Compilez avec
		javac -classpath test-1.7.jar test/RobotTest.java
		puis executez avec
		java -jar test-1.7.jar RoboTest
		


Pour les classes date et month :

    

    pour génerer les classes:
        se placer dans le dossier src
	executer javac date/Date.java -d ../classes
	
    Pour Génerer la doc:
		Se placer dans le dossier src
		executer javadoc date date.util -d ../docs
	Pour les tests:
        mettre le test-1.7.jar dans le dossier tp4
	
		Se placer dans le dossier tp4 (dossier racine)
		Compilez avec
		javac -classpath test-1.7.jar test/DateTest.java
		puis executez avec
		java -jar test-1.7.jar DateTest
		
	Pour creer l'archive :
		Se placer dans le dossier classes
		executer jar cvfm ../appli.jar ../manifest-ex date
		dans le dossier tp4
		Executer avec java -jar appli.jar
