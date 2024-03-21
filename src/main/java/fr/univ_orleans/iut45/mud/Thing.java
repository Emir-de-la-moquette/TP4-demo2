package fr.univ_orleans.iut45.mud;

public class Thing {
    private String nom;


    public Thing(String nom) {
        this .nom = nom;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }



    @Override
    public String toString() {
        return "{" +
            " nom='" + getNom() + "'" +
            "}";
    }

    
}