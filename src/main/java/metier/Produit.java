package main.java.metier;

import java.net.URI;

/**
 * Classe Produit.
 * Représente un produit avec ses détails tels que le nom, la description,
 * le prix, la taille et une photo associée.
 */
public class Produit {
    private String nom;
    private String description;
    private URI photo;
    private double prixBase;
    private double prixVente;
    private String taille;

    /**
     * Constructeur de la classe Produit.
     *
     * @param nom         Le nom du produit.
     * @param description La description du produit.
     * @param prixBase    Le prix de base du produit.
     * @param prixVente   Le prix de vente du produit.
     * @param taille      La taille du produit.
     * @param photo       L'URI de la photo représentant le produit.
     */
    public Produit(String nom, String description, double prixBase, double prixVente, String taille, URI photo) {
        this.nom = nom;
        this.description = description;
        this.prixBase = prixBase;
        this.prixVente = prixVente;
        this.taille = taille;
        this.photo = photo;
    }

    /**
     * Récupère les détails du produit sous forme de chaîne de caractères.
     *
     * @return Une chaîne contenant les informations du produit.
     */
    public String getDetails() {
        return String.format("Produit: %s, Prix: %.2f, Taille: %s, Photo: %s", nom, prixVente, taille, photo);
    }

    /**
     * Calcule le prix de vente du produit.
     *
     * @return Le prix de vente du produit.
     */
    public double calculerPrixVente() {
        return prixVente;
    }

    /**
     * Récupère le nom du produit.
     *
     * @return Le nom du produit.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Récupère le prix de vente du produit.
     *
     * @return Le prix de vente.
     */
    public double getPrixVente() {
        return prixVente;
    }

    /**
     * Récupère l'URI de la photo du produit.
     *
     * @return L'URI de la photo.
     */
    public URI getPhoto() {
        return photo;
    }

    /**
     * Récupère la description du produit.
     *
     * @return La description du produit.
     */
    public String getDescription() {
        return description;
    }

    /**
     * Récupère la taille du produit.
     *
     * @return La taille du produit.
     */
    public String getTaille() {
        return taille;
    }
}
