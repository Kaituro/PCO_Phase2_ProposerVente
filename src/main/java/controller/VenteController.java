package main.java.controller;

import main.java.metier.Fournisseur;
import main.java.metier.Vente;

public class VenteController {
    public boolean verifierIdentifiants(Fournisseur fournisseur, String id, String mdp) {
        // Logique pour vérifier les identifiants
        return fournisseur.getAdresse().equals(id) && fournisseur.getMotDePasse().equals(mdp);
    }

    public Vente creerVente(Vente vente) {
        // Logique pour créer une vente
        vente.valider();
        return vente;
    }

    public void validerVente(Vente vente) {
        // Logique pour valider une vente
        System.out.println("Vente valide");
        this.creerVente(vente);
    }

    public String rejeterVente(Vente vente) {
        vente.refuser();
        return "Vente rejetée, elle n'est pas complète";
    }
}
