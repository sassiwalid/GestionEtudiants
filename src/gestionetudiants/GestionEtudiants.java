/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionetudiants;

import gestionetudiants.Managers.ConnectionSingleton;

/**
 *
 * @author walidsassi
 */
public class GestionEtudiants {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EtudiantsManagerJFrame StudentsFrameManager = new EtudiantsManagerJFrame();
        StudentsFrameManager.setVisible(true);
        // Tester la connexion avec la base ici j'appelle mon singleton 
        ConnectionSingleton.getInstance();
        // supposons que je je refais l'appel une autre fois 
        ConnectionSingleton.getInstance();
        
    }
    
}
