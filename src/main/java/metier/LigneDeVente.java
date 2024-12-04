package main.java.metier;

/**
 * Classe LigneDeVente.
 * Représente une ligne de vente, associant un produit et une quantité.
 * Utilisée dans le cadre des ventes pour détailler les produits inclus.
 */
public class LigneDeVente {
    private Produit produit;
    private int quantite;

    /**
     * Constructeur de la classe LigneDeVente.
     *
     * @param produit  Le produit associé à cette ligne de vente.
     * @param quantite La quantité du produit dans cette ligne.
     */
    public LigneDeVente(Produit produit, int quantite) {
        this.produit = produit;
        this.quantite = quantite;
    }

    /**
     * Calcule le total pour cette ligne de vente en fonction du prix de vente
     * du produit et de la quantité.
     *
     * @return Le total de la ligne de vente.
     */
    public double calculerTotal() {
        return produit.calculerPrixVente() * quantite;
    }

    /**
     * Récupère le produit associé à cette ligne de vente.
     *
     * @return Le produit de la ligne.
     */
    public Produit getProduit() {
        return produit;
    }

    /**
     * Récupère la quantité de produits dans cette ligne de vente.
     *
     * @return La quantité de produits.
     */
    public int getQuantite() {
        return quantite;
    }
}
