/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;



/**
 *
 * @author walidsassi
 */
public class Etudiant {
    private int cin;
    private String nom,prenom,section;
    private Date naissance;

    public Etudiant(int cin, String nom, String prenom, String section, Date naissance) {
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.section = section;
        this.naissance = naissance;
    }

    public int getCin() {
        return cin;
    }

    public void setCin(int cin) {
        this.cin = cin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Date getNaissance() {
        return naissance;
    }

    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "cin=" + cin + ", nom=" + nom + ", prenom=" + prenom + ", section=" + section + ", naissance=" + naissance + '}';
    }
    
    
    
}
