package main.java.metier;

import java.util.ArrayList;
import java.util.List;

public class Fournisseur {
    private String specialite;
    private String typeMateriel;
    private List<Vente> ventes = new ArrayList<>();
    private String nom;
    private String adresse;
    private String email;
    private String telephone;
    private String motDePasse;


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

    public void proposerVente(Vente vente) {
        ventes.add(vente);
        System.out.println("Vente proposée par le fournisseur : " + nom);
    }

    public List<Vente> getVentes() {
        return ventes;
    }

    public void ajouterVente(Vente vente) {
        // Ajoute une vente
        ventes.add(vente);
    }

    public boolean estIdentifie() {
        // Vérifie l'identification du fournisseur
        return true;
    }

}
