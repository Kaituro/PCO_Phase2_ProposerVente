package main.java.metier;

import java.util.LinkedList;
import java.util.List;

/**
 * Classe Fournisseur.
 * Représente un fournisseur, ses informations personnelles et professionnelles,
 * ainsi que ses ventes.
 */
public class Fournisseur {
    private String specialite;
    private String typeMateriel;
    private List<Vente> ventes = new LinkedList<>();
    private String nom;
    private String adresse;
    private String email;
    private String telephone;
    private String motDePasse;
    private boolean identifie = false;

    /**
     * Constructeur de la classe Fournisseur.
     *
     * @param nom          Le nom du fournisseur.
     * @param adresse      L'adresse du fournisseur.
     * @param email        L'email du fournisseur.
     * @param telephone    Le numéro de téléphone du fournisseur.
     * @param specialite   La spécialité du fournisseur.
     * @param typeMateriel Le type de matériel fourni.
     * @param motDePasse   Le mot de passe pour l'authentification.
     */
    public Fournisseur(String nom, String adresse, String email, String telephone, String specialite,
            String typeMateriel, String motDePasse) {
        this.nom = nom;
        this.adresse = adresse;
        this.email = email;
        this.telephone = telephone;
        this.specialite = specialite;
        this.typeMateriel = typeMateriel;
        this.motDePasse = motDePasse;
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
    public String getAdresse() {
        return adresse;
    }

    /**
     * Récupère le mot de passe du fournisseur.
     *
     * @return Le mot de passe du fournisseur.
     */
    public String getMotDePasse() {
        return motDePasse;
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
        return identifie;
    }

    /**
     * Définit le fournisseur comme identifié (connecté).
     */
    public void setIdentifieTrue() {
        identifie = true;
    }

    /**
     * Ajoute une vente à la liste des ventes du fournisseur.
     * Le fournisseur doit être connecté pour ajouter une vente.
     *
     * @param vente La vente à ajouter.
     */
    public void ajouterVente(Vente vente) {
        if (estIdentifie()) {
            ventes.add(vente);
            System.out.println("Vente ajoutée avec succès : " + vente.getNom());
        } else {
            System.err.println("Erreur : vous devez être connecté pour ajouter une vente.");
        }
    }
}
