package main.java.metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Classe Vente.
 * Représente une vente avec ses détails, les produits associés,
 * et son statut (en attente, validée ou refusée).
 */
public class Vente {
    private String nom;
    private Date dateDebut;
    private Date dateFin;
    private String description;
    private List<Activite> activites;
    private List<LigneDeVente> produits = new ArrayList<>();
    private String statut;

    /**
     * Constructeur de la classe Vente.
     *
     * @param nom         Le nom de la vente.
     * @param dateDebut   La date de début de la vente.
     * @param dateFin     La date de fin de la vente.
     * @param description La description de la vente.
     * @param activites   La liste des activités associées à la vente.
     */
    public Vente(String nom, Date dateDebut, Date dateFin, String description, List<Activite> activites) {
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.description = description;
        this.activites = activites;
        this.statut = "En attente";
    }

    /**
     * Ajoute un produit à la liste des produits associés à cette vente.
     *
     * @param produit  Le produit à ajouter.
     * @param quantite La quantité de ce produit.
     */
    public void ajouterProduit(Produit produit, int quantite) {
        produits.add(new LigneDeVente(produit, quantite));
        System.out.println("Produit ajouté : " + produit.getNom());
    }

    /**
     * Marque la vente comme validée et modifie son statut.
     */
    public void valider() {
        this.statut = "Validée";
        System.out.println("Vente validée : " + nom);
    }

    /**
     * Marque la vente comme refusée et modifie son statut.
     */
    public void refuser() {
        this.statut = "Refusée";
        System.out.println("Vente refusée : " + nom);
    }

    /**
     * Récupère le nom de la vente.
     *
     * @return Le nom de la vente.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Récupère le statut de la vente.
     *
     * @return Le statut de la vente (En attente, Validée, Refusée).
     */
    public String getStatut() {
        return statut;
    }

    /**
     * Récupère la liste des produits associés à cette vente.
     *
     * @return Une liste des lignes de vente.
     */
    public List<LigneDeVente> getProduits() {
        return produits;
    }
}
