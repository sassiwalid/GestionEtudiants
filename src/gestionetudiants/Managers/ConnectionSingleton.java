/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetudiants.Managers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
// vous devez importer tous ses packages java 
/**
 *
 * @author walidsassi
 */
// idee de définir un singleton pour la connexion à la bd est de limiter la création des objets à une seule instance qu'on va
// utiliser à  chaque fois dans les différents classes qui peuvent éventuellement se connecter à notre base
public class ConnectionSingleton {
  // définir ici url de la base de données  que j'ai nommé EtudiantsDB
   private String url = "jdbc:mysql://localhost:3306/EtudiantsDB";
  //Nom du user
  private String user = "root";
  //Mot de passe de l'utilisateur par defaut le mot de passe est vide j'ai changé le mot de passe avant ce vidéo 
  private String passwd = "0000";
  //Objet Connection
  // afin de se connecter à une base en java on doit créer un objet de connection de type Connection mais aussi il faut télécharger API mysql
  // qui permet de se connecter à la base mysql
  private static Connection connect;
  // il faut mettre le constructeur de notre classe privé afin de faire appel ensuite à ce dernier à traver la méthode getInstance 
  // mettre le constructeur privé interdit de créer un objet en dehors de cette classe ce qui est le but de pattern Singleton 
  //Constructeur privé
  private ConnectionSingleton(){
    try {
      connect = DriverManager.getConnection(url, user, passwd);
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
   
  //Méthode qui va nous retourner notre instance et la créer si elle n'existe pas
  // cette méthode va vérifier tout simplement que nous créons une seule instance de notre objet de connexion 
  // je me suis inspiré de ce document afin de créer cette classe de connexion 
   public static Connection getInstance(){
    if(connect == null){
      new ConnectionSingleton();// appel du constructeur seulement une fois lorsque l'objet connect est null sinon on retourne l'objet déja crée
    }
    return connect;   
  }   
}
// Maintenant nous allons mettre notre projet sur Github un site très connu pour versionner les projets IT!!!!
// en fait il y a plusieurs méthodes pour envoyer un projet vers github dans la prochaine vidéo je vous présente la méthode avec la ligne de commande
// à la prochaine vidéo.