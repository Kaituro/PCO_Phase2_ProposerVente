package main.java.boundary;

import main.java.controller.ControlVerificationIdentification;
import main.java.controller.VenteController;
import main.java.metier.Activite;

/**
 * Classe BoundaryVente.
 * Gère l'interface entre les fournisseurs et le système pour la connexion et la
 * gestion des ventes.
 */
public class BoundaryVente {
    private final VenteController venteController = new VenteController();
    private final ControlVerificationIdentification controlVerificationIdentification = new ControlVerificationIdentification();

    /**
     * Affiche un message d'erreur en cas d'échec de la connexion.
     */
    public void afficherErreurConnexion() {
        // TODO équipe de dev boundary de le faire
    }


    public void proposerVente(String nom, String description, Activite activite) {
        if (controlVerificationIdentification.ControlVerificationIdentification()) {
            venteController.creerVente(nom, description, activite);
        }
    }

    /**
     * Demande la connexion d'un fournisseur avec ses identifiants.
     *
     * @param id  L'identifiant du fournisseur (email ou adresse).
     * @param mdp Le mot de passe du fournisseur.
     */
    public void demanderConnexion(String id, String mdp) {
        controlVerificationIdentification.ControlVerificationIdentification();
        System.out.println("connecté");
    }

    /**
     * Vérifie si un fournisseur est actuellement connecté.
     *
     * @return {@code true} si le fournisseur est connecté, sinon {@code false}.
     */
    public String verifierConnexion(String token) {
        if (controlVerificationIdentification.ControlVerificationIdentification()) {
            return "connecté";
        }
        return "Vous n'êtes pas connecté";
    }
}
