# PersonApp
appi crud avec spring boot pour la configuration de base d'un projet spring


###########################################################################################
				SPRING BOOG
				
		****************generalité********
Spring = Framework java qui permet de creer des appWeb.
spring = ensemble de modules pour gerer differents aspects:
	spring Core    : module de base de spring qui gere le cycle de vie des objets , les dependances et le patron  IoC
	spring Security: module de gestion de la securité , d'authentification et de control d'accès
	spring Data    : module qui implemente les interfaces de gestion de données avec les bases de données , jpa hibernate...
	spring MVC     : module permettant de gerer le pattron mvc
	
	********presentation*************
 		springBoot = extention de spring qui facilite les configurations de spring : une implementation de spring
 
 	********creation*****************
 		moyen simple :
 			-aller sur https://start.spring.io
 			-remplir le formulaire de creation 
 			-selectionner les dependances du projet
 			-generer le projet
 			
 	********configuration du projet****
 		
 		*controller        :
 			-declarer par une annotation : @RestController
 			-le chemin d'entré mappé
 			-chaque point d'entré annoté
 			-les services injectés par @Autowird
 		*services          : 
 			-declarer par une annotation : @Service
 			-les repository injecté par  @Autowird
 		*entity            :
 			-declarer par @Entity
 			-l'attribut clé primaire est annoté correctement
 		repoisitory        :
 			-declarer par @Repository
 			-le core se resume en classe qui etend CrudRepository<Nom_entity,Type_cle_primaire_entity>
 			-exemple :	
 				@Repository
				public interface PersonRepository extends CrudRepository<Person,Integer>{}
		
		===> tout ce qui est cité precedement sont des classes sans construicteur
		
 		app.properties_file:
 			-contient les configuration d'accès à la base de donnée:
 				user,password,databse_url + d'autres propriétés
 		
 		
			
 				
 				
 				
