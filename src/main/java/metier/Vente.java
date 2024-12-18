package main.java.metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Classe Vente.
 * Représente une vente effectuée par un fournisseur, contenant plusieurs
 * produits.
 */
public class Vente {

    /**
     * Le nom de la vente.
     */
    private String nom;

    /**
     * La date de début de la vente.
     */
    private Date dateDebut;

    /**
     * La date de fin de la vente.
     */
    private Date dateFin;

    /**
     * La liste des produits inclus dans cette vente.
     */
    private List<ProduitVente> produits = new ArrayList<>();

    /**
     * Constructeur de la classe Vente.
     *
     * @param nom       Le nom de la vente.
     * @param dateDebut La date de début de la vente.
     * @param dateFin   La date de fin de la vente.
     */
    public Vente(String nom, Date dateDebut, Date dateFin) {
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
    }

    /**
     * Ajoute un produit à cette vente.
     *
     * @param produit  Le produit à ajouter.
     * @param quantite La quantité de ce produit.
     */
    public void ajouterProduit(Produit produit, int quantite) {
        produits.add(new ProduitVente(produit, quantite));
    }

    /**
     * Récupère la liste des produits inclus dans cette vente.
     *
     * @return Une liste de {@link ProduitVente}.
     */
    public List<ProduitVente> getProduits() {
        return produits;
    }

    /**
     * Redéfinition de la méthode toString pour afficher les détails de la vente.
     *
     * @return Une chaîne contenant le nom, les dates et les produits de la vente.
     */
    @Override
    public String toString() {
        StringBuilder details = new StringBuilder();
        details.append("Vente: ").append(nom)
                .append("\nDate début: ").append(dateDebut)
                .append("\nDate fin: ").append(dateFin)
                .append("\nProduits: \n");

        for (ProduitVente pv : produits) {
            details.append(" - ").append(pv).append("\n");
        }

        return details.toString();
    }
}
