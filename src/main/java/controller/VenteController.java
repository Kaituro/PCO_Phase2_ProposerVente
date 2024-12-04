package main.java.controller;

import main.java.metier.Fournisseur;
import main.java.metier.Vente;

/**
 * Classe VenteController.
 * Gère la logique métier associée à la gestion des ventes,
 * incluant la validation, la création et le rejet des ventes.
 */
public class VenteController {

    /**
     * Vérifie les identifiants d'un fournisseur pour l'authentification.
     *
     * @param fournisseur Le fournisseur dont les identifiants doivent être vérifiés.
     * @param id          L'identifiant fourni (par exemple, adresse email).
     * @param mdp         Le mot de passe fourni.
     * @return {@code true} si les identifiants sont corrects, sinon {@code false}.
     */
    public boolean verifierIdentifiants(Fournisseur fournisseur, String id, String mdp) {
        return fournisseur.getAdresse().equals(id) && fournisseur.getMotDePasse().equals(mdp);
    }

    /**
     * Crée une nouvelle vente et la marque comme validée.
     *
     * @param vente La vente à créer.
     * @return L'instance de la vente créée et validée.
     */
    public Vente creerVente(Vente vente) {
        vente.valider();
        return vente;
    }

    /**
     * Valide une vente en changeant son statut et affiche un message de confirmation.
     *
     * @param vente La vente à valider.
     */
    public void validerVente(Vente vente) {
        vente.valider();
        System.out.println("Vente validée : " + vente.getNom());
    }

    /**
     * Rejette une vente en changeant son statut et retourne un message d'erreur.
     *
     * @param vente La vente à rejeter.
     * @return Un message indiquant que la vente a été rejetée.
     */
    public String rejeterVente(Vente vente) {
        vente.refuser();
        return "Vente rejetée : informations incomplètes.";
    }
}
