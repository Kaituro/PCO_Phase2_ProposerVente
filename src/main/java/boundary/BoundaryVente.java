package main.java.boundary;

import main.java.controller.VenteController;
import main.java.metier.Fournisseur;
import main.java.metier.Vente;

import java.util.List;
import java.util.ArrayList;

public class BoundaryVente {
    private final VenteController venteController = new VenteController();
    private List<Fournisseur> connected = new ArrayList<>();

    public void afficherErreurConnexion() {
        System.out.println("mauvais identifiant ou mot de passe");
    }

    public String proposerVente(Vente vente) {
        if (vente.getStatut().equals("En attente")) {
            venteController.validerVente(vente);
            return "Vente proposée";
        } else {
            return venteController.rejeterVente(vente);

        }

    }

    public void demanderConnexion(Fournisseur fournisseur, String id, String mdp) {
        // Logique pour demander une connexion
        boolean connexion = this.venteController.verifierIdentifiants(fournisseur, id, mdp);
        if (!connexion) {
            this.afficherErreurConnexion();
        } else {
            System.out.println("connexion réussie");
            fournisseur.setIdentifieTrue();
            connected.add(fournisseur);
        }
    }

    public boolean verifierConnexion(Fournisseur fournisseur) {
        return connected.contains(fournisseur);
    }
}
