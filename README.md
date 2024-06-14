Project context
La chaîne de télévision internationale MovieSeriesTV a sollicité la startup OroJacksonTech, où vous travaillez, pour développer une application web permettant à son audience de visionner les films et séries produits par la chaîne. Le Product Owner vous a confié cette mission de créer une application backend bien structuré et fonctionnel. L'application devra être évolutive et facile à maintenir.

​

​

Utilisateur User Stories

​

Consultation de contenue:

​

Afficher la Liste des Films: En tant qu'utilisateur, je veux voir une liste de tous les films disponibles avec leurs titres, dates de sortie, genres, réalisateurs et notes, afin de trouver rapidement un film à consulter ou à regarder.
Afficher la Liste des Séries : En tant qu'utilisateur, je veux voir une liste de toutes les séries disponibles avec leurs titres, dates de début et de fin, genres, créateurs et notes, afin de trouver rapidement une série à consulter ou à regarder.
​

Gestion des Favoris

Ajouter un Film ou une série aux Favoris En tant qu'utilisateur, je veux pouvoir ajouter un film ou une série à mes favoris, afin de le retrouver facilement plus tard. Critères d'acceptation : Un bouton "Ajouter aux favoris" est disponible sur la page de chaque film. Le film est ajouté à une liste de favoris personnelle après clic.
Voir la Liste des Films ou une série En tant qu'utilisateur, je veux voir une liste de tous les films et les séries disponibles avec leurs titres, dates de sortie, genres, réalisateurs et notes, afin de trouver rapidement un film à consulter ou à regarder. Critères d'acceptation : La liste affiche tous les films avec les détails mentionnés. Les films peuvent être triés par différents critères (titre, date de sortie, note).
Voir les Détails d'un Film ou une série En tant qu'utilisateur, je veux pouvoir cliquer sur un film ou une série pour voir ses détails complets, y compris la liste des acteurs et une bande-annonce (si disponible), afin d'obtenir des informations plus approfondies sur le film. Critères d'acceptation : Un clic sur un film affiche une page de détails avec toutes les informations pertinentes. Les acteurs et la bande-annonce (si disponible) sont inclus dans les détails.
​

​

Travail à faire:

​

Initialisation du Projet :

Créer un nouveau projet Spring Boot en utilisant Spring Initializr avec les dépendances nécessaires : Spring Web, Spring Data JPA, Lombok, MySQL/PostgreSQL.
Configurer le fichier application.properties pour se connecter à la base de données (choisir entre MySQL et PostgreSQL).
Définition des composants

Définition des Modèles (Model)
Création des DAO/Repositories
Définition des DTO (Data Transfer Object)
Implémentation des Services
Création des Contrôleurs REST (REST Controller)
​

Tests des API avec Postman :

Créer des collections de requêtes dans Postman pour tester chaque endpoint (afficher la liste des films, ajouter aux favoris, etc.).
Tester les différents cas d'utilisation (success, erreur, etc.) et vérifier que les réponses sont conformes aux attentes.
