/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetudiants.Controllers;

import Models.Etudiant;
import gestionetudiants.Managers.ConnectionSingleton;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author walidsassi
 */
public class EtudiantsController {

    public EtudiantsController() {
        // connexion à la base de données
        ConnectionSingleton.getInstance();

    }
    
    // Méthode qui permet d'ajouter un étudiant à la base de données
    
    public boolean addStudent(Etudiant e){
        try {
            // Un traitement un peu spécial pour la date
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
            String birthdayDate = sdf.format(e.getNaissance());
            // écriture de la requête
            // il faut ne pas oublier les deux quotes '' entre les valeurs 
            String requete = "insert into Etudiant(CIN, Nom, Prenom, Section, DateNaissance)"
            + " values("+e.getCin()+",'"+e.getNom()+"','"+e.getPrenom()+"','"+e.getSection()+"','"+birthdayDate+ "');";
            // nous utilisons toujours cette instance de singeleton de connexion que nous avons crée 
            // 
            PreparedStatement preparedStmt = ConnectionSingleton.getInstance().prepareStatement(requete);
            preparedStmt.execute();
            // en cas de succées la méthode retourne obligatoirement true en cas d'erreur une exception sera levée
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(EtudiantsController.class.getName()).log(Level.SEVERE, null, ex);
        }
       return true;
        
    }
    public ResultSet GetStudents(){
        ResultSet rs = null;
        try {
            Statement st;
            String sql="SELECT * FROM Etudiant";
            st = ConnectionSingleton.getInstance().createStatement();
            rs =  st.executeQuery(sql);
                    } catch (SQLException ex) {
            Logger.getLogger(EtudiantsController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rs;
    }
    
}
