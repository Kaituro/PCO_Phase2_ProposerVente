package main.java.metier;

/**
 * Classe ProduitVente.
 * Représente une association entre un produit et sa quantité dans une vente.
 */
public class ProduitVente {

    /**
     * Le produit associé à cette ligne de vente.
     */
    private Produit produit;

    /**
     * La quantité du produit dans la vente.
     */
    private int quantite;

    /**
     * Constructeur de la classe ProduitVente.
     *
     * @param produit  Le produit associé.
     * @param quantite La quantité de ce produit.
     */
    public ProduitVente(Produit produit, int quantite) {
        this.produit = produit;
        this.quantite = quantite;
    }

    /**
     * Calcule le total pour cette ligne de vente.
     *
     * @return Le total (prix du produit * quantité).
     */
    public double calculerTotal() {
        return produit.getPrixVente() * quantite;
    }

    /**
     * Récupère le produit associé à cette ligne de vente.
     *
     * @return Une instance de {@link Produit}.
     */
    public Produit getProduit() {
        return produit;
    }

    /**
     * Génère une représentation textuelle de cette ligne de vente.
     *
     * @return Une chaîne décrivant le produit, la quantité et le total.
     */
    @Override
    public String toString() {
        return produit.getNom() + " - Quantité: " + quantite + " - Total: " + calculerTotal();
    }
}
