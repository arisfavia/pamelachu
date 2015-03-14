# PamelaChu

Git du projet Entreprise Application EPITECH du groupe Pamela Chu.

A. Pour installer ninja:

1. Installer la dernière version de Java (JDK): http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html

2. Installer Maven (avec Honeybrew) : $> brew install maven

B. Créer sa première App Ninja (juste à titre informatif, cette installe à déjà été initialisée de cette manière):

1. $> mvn archetype:generate -DarchetypeGroupId=org.ninjaframework -DarchetypeArtifactId=ninja-servlet-archetype-simple

2. $> cd DOSSIER_DU_PROJET

3. $> mvn clean install

C. Pour lancer le serveur :

1. $> mvn ninja:run

2. Ouvrir un browser sur http://localhost:8080