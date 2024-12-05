package main.java.metier;

import java.util.LinkedList;
import java.util.List;

/**
 * Classe Fournisseur.
 * Représente un fournisseur, ses informations personnelles et professionnelles,
 * ainsi que ses ventes.
 */
public class Fournisseur extends Utilisateur {
    private List<Vente> ventes = new LinkedList<>();
    private String nom;


    /**
     * Constructeur de la classe Fournisseur.
     *
     * @param nom        Le nom du fournisseur.
     * @param email      L'email du fournisseur.
     * @param motDePasse Le mot de passe pour l'authentification.
     */
    public Fournisseur(String nom, String email, String motDePasse) {
        super(email, motDePasse);
        this.nom = nom;

    }

    /**
     * Récupère la liste des ventes du fournisseur.
     *
     * @return La liste des ventes.
     */
    public List<Vente> getVentes() {
        return ventes;
    }

    /**
     * Récupère l'adresse du fournisseur.
     *
     * @return L'adresse du fournisseur.
     */
    public String getEmail() {
        return super.getEmail();
    }

    /**
     * Récupère le mot de passe du fournisseur.
     *
     * @return Le mot de passe du fournisseur.
     */
    public String getMotDePasse() {
        return super.getMdp();
    }

    /**
     * Récupère le nom du fournisseur.
     *
     * @return Le nom du fournisseur.
     */
    public String getNom() {
        return nom;
    }

    /**
     * Vérifie si le fournisseur est identifié (connecté).
     *
     * @return {@code true} si le fournisseur est identifié, sinon {@code false}.
     */
    public boolean estIdentifie() {
        return super.estIdentifie();
    }

    /**
     * Définit le fournisseur comme identifié (connecté).
     */
    public void setIdentifieTrue() {
        super.setIdentifie();
    }

    /**
     * Ajoute une vente à la liste des ventes du fournisseur.
     * Le fournisseur doit être connecté pour ajouter une vente.
     *
     * @param vente La vente à ajouter.
     */
    public void ajouterVente(Vente vente) {

    }
}
