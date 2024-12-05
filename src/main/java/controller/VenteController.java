package main.java.controller;

import main.java.metier.Activite;
import main.java.metier.Vente;

import java.util.Collections;
import java.util.Date;

/**
 * Classe VenteController.
 * Gère la logique métier associée à la gestion des ventes,
 * incluant la validation, la création et le rejet des ventes.
 */
public class VenteController {

    /**
     * Crée une nouvelle vente et la marque comme validée.
     *
     * @param nom         Nom de la vente à créer.
     * @param description Description de la vente à créer
     * @return L'instance de la vente créée et validée.
     */
    public Vente creerVente(String nom, String description, Activite activite) {
        return new Vente(
                nom,
                new Date(),
                new Date(),
                description,
                Collections.singletonList(activite)
        );
    }


}
