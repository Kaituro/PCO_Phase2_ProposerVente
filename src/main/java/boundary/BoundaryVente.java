package main.java.boundary;

import main.java.controller.VenteController;
import main.java.metier.Fournisseur;
import main.java.metier.Vente;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe BoundaryVente.
 * Gère l'interface entre les fournisseurs et le système pour la connexion et la gestion des ventes.
 */
public class BoundaryVente {
    private final VenteController venteController = new VenteController();
    private final List<Fournisseur> connectedFournisseurs = new ArrayList<>();

    /**
     * Affiche un message d'erreur en cas d'échec de la connexion.
     */
    public void afficherErreurConnexion() {
        System.out.println("Erreur : identifiant ou mot de passe incorrect.");
    }

    /**
     * Propose une vente pour validation ou rejet.
     *
     * @param vente La vente à proposer.
     * @return Un message indiquant si la vente a été validée ou rejetée.
     */
    public String proposerVente(Vente vente) {
        if ("En attente".equals(vente.getStatut())) {
            venteController.validerVente(vente);
            return "Vente proposée avec succès.";
        } else {
            return venteController.rejeterVente(vente);
        }
    }

    /**
     * Demande la connexion d'un fournisseur avec ses identifiants.
     *
     * @param fournisseur Le fournisseur qui tente de se connecter.
     * @param id          L'identifiant du fournisseur (email ou adresse).
     * @param mdp         Le mot de passe du fournisseur.
     */
    public void demanderConnexion(Fournisseur fournisseur, String id, String mdp) {
        boolean estConnecte = venteController.verifierIdentifiants(fournisseur, id, mdp);
        if (!estConnecte) {
            afficherErreurConnexion();
        } else {
            System.out.println("Connexion réussie pour le fournisseur : " + fournisseur.getNom());
            fournisseur.setIdentifieTrue();
            connectedFournisseurs.add(fournisseur);
        }
    }

    /**
     * Vérifie si un fournisseur est actuellement connecté.
     *
     * @param fournisseur Le fournisseur à vérifier.
     * @return {@code true} si le fournisseur est connecté, sinon {@code false}.
     */
    public boolean verifierConnexion(Fournisseur fournisseur) {
        return connectedFournisseurs.contains(fournisseur);
    }
}
