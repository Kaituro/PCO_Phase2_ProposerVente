package main.java.controller;

import main.java.metier.Fournisseur;

public class ControlVerificationIdentification {
    private final VenteController venteController = new VenteController();
    public boolean ControlVerificationIdentification() {
        Fournisseur fournisseur = new Fournisseur("utilisateur", "user@email.com", "******");
        venteController.setFournisseur(fournisseur);
        return true;
    }

}