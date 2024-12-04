package main.java.main;

import main.java.boundary.BoundaryVente;
import main.java.metier.*;

import java.net.URI;
import java.util.Arrays;
import java.util.Date;

/**
 * Classe Main.
 * Point d'entrée du programme pour tester la création, la connexion des
 * fournisseurs,
 * et la gestion des ventes.
 */
public class Main {

    /**
     * Méthode principale qui initialise les objets nécessaires et simule un
     * scénario
     * de connexion et de gestion des ventes pour un fournisseur.
     *
     * @param args Les arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {
        try {
            // Création des objets nécessaires
            BoundaryVente boundaryVente = new BoundaryVente();
            Produit surfboard = new Produit("Surfboard", "Planche de surf", 300, 250, "Grande",
                    new URI("http://example.com/surfboard"));
            Fournisseur fournisseur = new Fournisseur("John", "123 Street", "john@example.com", "0123456789", "Sports",
                    "Equipements", "unMotDePasse");

            // Création d'une vente
            Vente vente = new Vente("Vente d'été", new Date(), new Date(), "Promotion spéciale",
                    Arrays.asList(Activite.SURFING, Activite.KITESURFING));
            vente.ajouterProduit(surfboard, 2);

            // Connexion du fournisseur
            boundaryVente.demanderConnexion(fournisseur, fournisseur.getAdresse(), fournisseur.getMotDePasse());

            // Vérification de la connexion et proposition de la vente
            if (boundaryVente.verifierConnexion(fournisseur)) {
                fournisseur.ajouterVente(vente);
                String result = boundaryVente.proposerVente(vente);
                System.out.println(result);
            } else {
                System.out.println("Impossible de proposer la vente. Fournisseur non connecté.");
            }
        } catch (Exception e) {
            System.out.println("Une erreur s'est produite : " + e.getMessage());
        }
    }
}
