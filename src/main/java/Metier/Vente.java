package main.java.Metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Vente {
    private String nom;
    private Date dateDebut;
    private Date dateFin;
    private String description;
    private List<Activite> activites;
    private List<LigneDeVente> produits = new ArrayList<>();
    private String statut;

    public Vente(String nom, Date dateDebut, Date dateFin, String description, List<Activite> activites) {
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.description = description;
        this.activites = activites;
        this.statut = "En attente";
    }

    public void ajouterProduit(Produit produit, int quantite) {
        produits.add(new LigneDeVente(produit, quantite));
    }

    public void valider() {
        this.statut = "Validée";
    }

    public void refuser() {
        this.statut = "Refusée";
    }

    public String getStatut() {
        return statut;
    }

    public void notifierClientsPrivilegies(ServeurMail serveurMail) throws IllegalStateException {
        throw new IllegalStateException("A implémenter");
    }
}
    