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
    private boolean identifie = false;


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

    public List<Vente> getVentes() {
        return ventes;
    }

    public void ajouterVente(Vente vente) {
        // Ajoute une vente
        if (estIdentifie()) {
            ventes.add(vente);
        } else {
            System.err.println("vous n'êtes pas connecté");
        }
    }

    public boolean estIdentifie() {
        return identifie;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setIdentifieTrue() {
        identifie = true;
    }
}
