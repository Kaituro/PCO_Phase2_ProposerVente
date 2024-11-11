package main.java.Metier;

public class LigneDeVente {
    private Produit produit;
    private int quantite;

    public LigneDeVente(Produit produit, int quantite) {
        this.produit = produit;
        this.quantite = quantite;
    }

    public double calculerTotal() {
        return produit.calculerPrixVente() * quantite;
    }

    public Produit getProduit() { return produit; }
}
