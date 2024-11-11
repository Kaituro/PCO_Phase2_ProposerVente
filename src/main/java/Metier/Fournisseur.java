package main.java.Metier;

import java.util.ArrayList;
import java.util.List;

public class Fournisseur extends Personne {
    private String specialite;
    private String typeMateriel;
    private List<Vente> ventes = new ArrayList<>();

    public Fournisseur(String nom, String adresse, String email, String telephone, String specialite,
            String typeMateriel) {
        super(nom, adresse, email, telephone);
        this.specialite = specialite;
        this.typeMateriel = typeMateriel;
    }

    public void proposerVente(Vente vente) {
        ventes.add(vente);
        System.out.println("Vente proposée par le fournisseur : " + nom);
    }

    public List<Vente> getVentes() {
        return ventes;
    }
}
