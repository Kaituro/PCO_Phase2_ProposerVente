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

    /**
     * Constructeur de la classe Produit.
     *
     * @param nom         Le nom du produit.
     * @param description La description du produit.
     * @param prixBase    Le prix de base du produit.
     * @param prixVente   Le prix de vente du produit.
     * @param photo       L'URI de la photo représentant le produit.
     */
    public Produit(String nom, String description, double prixBase, double prixVente, URI photo) {
        this.nom = nom;
        this.description = description;
        this.prixBase = prixBase;
        this.prixVente = prixVente;
        this.photo = photo;
    }



}
