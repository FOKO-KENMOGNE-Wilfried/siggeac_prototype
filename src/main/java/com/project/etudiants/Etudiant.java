package com.project.etudiants;

public class Etudiant {
    public int id;
    public String nom;
    public String prenom;
    public String matricule;

    public Etudiant(int id, String nom, String prenom, String matricule) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }
}
