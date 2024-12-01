package main.java.main;

import main.java.boundary.BoundaryVente;
import main.java.metier.*;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Création des objets
        BoundaryVente bv = new BoundaryVente();
        Produit surfboard = new Produit("Surfboard", "Planche de surf", 300, 250, "Grande", "photo.jpg");
        Fournisseur fournisseur = new Fournisseur("John", "123 Street", "john@example.com", "0123456789", "Sports",
                "Equipements", "unMotDePasse");
        // Création de la vente
        Vente vente = new Vente("Vente d'été", new Date(), new Date(), "Promotion spéciale",
                Arrays.asList(Activite.SURFING, Activite.KITESURFING));
        vente.ajouterProduit(surfboard, 2);

        // Proposer et valider la vente
        fournisseur.ajouterVente(vente);
        if (fournisseur.getVentes().isEmpty() || !(fournisseur.getVentes().getLast().equals(vente))) {
            bv.demanderConnexion(fournisseur, fournisseur.getAdresse(), fournisseur.getMotDePasse());
            if (bv.verifierConnexion(fournisseur)) {
                fournisseur.ajouterVente(vente);
                System.out.println(bv.proposerVente(vente));
            }
        } else if (bv.verifierConnexion(fournisseur)) {
            fournisseur.ajouterVente(vente);
            System.out.println(bv.proposerVente(vente));

        }


    }
}
