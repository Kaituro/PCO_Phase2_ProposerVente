package main.java.metier;

import java.net.URI;

/**
 * Classe Produit.
 * Représente un produit vendu par un fournisseur.
 */
public class Produit {

    /**
     * Le nom du produit.
     */
    private String nom;

    /**
     * Le prix de vente du produit.
     */
    private double prixVente;

    /**
     * L'URI de la photo associée au produit.
     */
    private URI photo;

    /**
     * Constructeur de la classe Produit.
     *
     * @param nom       Le nom du produit.
     * @param prixVente Le prix de vente du produit.
     * @param photo     L'URI de la photo associée au produit.
     */
    public Produit(String nom, double prixVente, URI photo) {
        this.nom = nom;
        this.prixVente = prixVente;
        this.photo = photo;
    }

    /**
     * Récupère le nom du produit.
     *
     * @return Une chaîne représentant le nom du produit.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Récupère le prix de vente du produit.
     *
     * @return Le prix de vente du produit.
     */
    public double getPrixVente() {
        return prixVente;
    }
}
