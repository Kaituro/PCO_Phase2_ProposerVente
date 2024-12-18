package main.java.controller;

import main.java.metier.Fournisseur;

/**
 * Classe ControllerVerifierIdentifiant.
 * Gère la vérification des identifiants d'un fournisseur.
 */
public class ControllerVerifierIdentifiant {

    /**
     * Vérifie si les identifiants fournis sont corrects.
     * Cette méthode compare l'identifiant et le mot de passe fournis avec des
     * valeurs prédéfinies.
     *
     * @param fournisseur L'instance du fournisseur à authentifier (non utilisé dans
     *                    cette implémentation).
     * @param id          L'identifiant saisi par l'utilisateur.
     * @param mdp         Le mot de passe saisi par l'utilisateur.
     * @return true si les identifiants sont corrects, sinon false.
     */
    public boolean verifierIdentifiants(Fournisseur fournisseur, String id, String mdp) {
        return id.equals("fournisseur") && mdp.equals("password");
    }
}
