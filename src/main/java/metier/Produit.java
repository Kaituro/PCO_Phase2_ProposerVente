package main.java.metier;

public class Produit {
    private String nom;
    private String description;
    private String photo;
    private double prixBase;
    private double prixVente;
    private String taille;

    public Produit(String nom, String description, double prixBase, double prixVente, String taille, String photo) {
        this.nom = nom;
        this.description = description;
        this.prixBase = prixBase;
        this.prixVente = prixVente;
        this.taille = taille;
        this.photo = photo;
    }

    public String getDetails() {
        return "Produit: " + nom + ", Prix: " + prixVente + ", Taille: " + taille + ", Photo: " + photo;
    }

    public double calculerPrixVente() {
        return prixVente;
    }
}
