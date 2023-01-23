# TP3 - POO, API et Outillages


Lien GitHub: 

---

### Dependencies :
- #### Spring Data
    Persist data in SQL stores with Java Persistence API using Spring Data and Hibernate.
- #### Spring Web
    Build web, including RESTful, applications using Spring MVC. Uses Apache Tomcat as the default embedded container.
- #### H2 Database
    Provides a fast in-memory database that supports JDBC API and R2DBC access, with a small (2mb) footprint. Supports embedded and server modes as well as a browser based console application.
- #### Spring Boot DevTools
    Provides fast application restarts, LiveReload, and configurations for enhanced development experience.
- #### Thymeleaf
    A modern server-side Java template engine for both web and standalone environments. Allows HTML to be correctly displayed in browsers and as static prototypes.
- #### Validation
    Bean Validation with Hibernate validator.
---

### Questions :
1.  Avec quelle partie du code avons-nous paramétré l'URL d'appel /greeting ?

Nous avons paramétré l'URL d'appel avec la partie suivant l'annotation `@RequestParam` dans la classe `HelloWorldController.java`
  
2. Avec quelle partie du code avons-nous choisi le fichier HTML à afficher ?

L'annotation `@GetMapping("/greeting")` nous permet de choisir le fichier HTML que nous voulons afficher, ici, la page `/greeting.html`

3. Comment envoyons-nous le nom à qui nous disons bonjour avec le second lien ?

Dans l'URL de la page, nous ajoutons un attribut `name` suivi de son contenu, dans cet exemple nous avons donc : `?name=ENSIM`
  
4. Relancez-votre application, retournez sur la console de H2 : http://localhost:8080/h2-console. Avez-vous remarqué une différence ?

Dans la hiérarchie, nous voyons qu'une nouvelle table ADDRESS est disponible et modifiable.
  
5. Expliquez l'apparition de la nouvelle table en vous aidant de vos cours sur Hibernate, et de la
   dépendance Hibernate de Spring.



6. Faites une requête de type SELECT sur la table Address. Voyez-vous tout le contenu de data.sql ?

Lorsque nous réalisons la requête SELECT sur la table ADDRESS nous pouvons voir le contenu inséré précédemment.

7. Pouvez-vous trouver à quoi sert l'annotation @Autowired du code précèdent sur internet ?

L’annotation `@Autowired` permet d’activer l’injection automatique de dépendance.


## TP4

### Etape 6 :

- Il est nécessaire d'avoir une clé API pour utiliser l'API de MeteoConcept, pour l'obtenir il faut s'inscrire et 
créer un token
- Il faut appeler l'URL `https://api.meteo-concept.com/api/forecast/daily/0?token=API_KEY&latlng=lat,lng`
- Il faut utiliser la méthode HTTP GET pour récupérer les données qui sont au format JSON
- Il faut remplacer dans le lien précédent : `API_KEY` par la clé API obtenue précédemment et `lat,lng` par les coordonnées de la ville souhaitée

- Les informations utiles sont dans l'objet forecast du JSON
- Les méthodes `getTmax()` et `getTmin()` permettent de récupérer la température maximale et minimale du lieu
- La méthode `getWeather()` permet de récupérer la météo du lieu demandé.