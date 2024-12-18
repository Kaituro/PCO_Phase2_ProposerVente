package main.java.controller;

import main.java.metier.Vente;

import java.util.Date;

/**
 * Classe ControllerProposerVente.
 * Gère la création des ventes en contrôlant les données fournies.
 */
public class ControllerProposerVente {

    /**
     * Crée une vente avec les informations fournies.
     * Cette méthode encapsule la logique de création de la vente.
     *
     * @param nom       Le nom de la vente.
     * @param dateDebut La date de début de la vente.
     * @param dateFin   La date de fin de la vente.
     * @return Une instance de {@link Vente} avec les détails spécifiés.
     */
    public Vente creerVente(String nom, Date dateDebut, Date dateFin) {
        return new Vente(nom, dateDebut, dateFin);
    }
}
