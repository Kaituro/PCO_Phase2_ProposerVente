package main.java.main;

import main.java.boundary.BoundaryVente;
import main.java.metier.*;

import java.net.URI;
import java.util.Arrays;
import java.util.Date;

/**
 * Classe Main.
 * Point d'entrée du programme pour tester la création, la connexion des
 * fournisseurs, et la gestion des ventes, avec des cas réussis et des échecs.
 */
public class Main {

    /**
     * Méthode principale qui initialise les objets nécessaires et simule un
     * scénario de connexion et de gestion des ventes pour un fournisseur, en
     * incluant des cas où le système ne doit pas fonctionner correctement.
     *
     * @param args Les arguments de la ligne de commande (non utilisés ici).
     */
    public static void main(String[] args) {
        try {
            // Création des objets nécessaires
            BoundaryVente boundaryVente = new BoundaryVente();
            Produit surfboard = new Produit(
                "Surfboard", 
                "Planche de surf", 
                300, 
                250, 
                "Grande", 
                new URI("http://example.com/surfboard")
            );
            Fournisseur fournisseur = new Fournisseur(
                "John", 
                "123 Street", 
                "john@example.com", 
                "0123456789", 
                "Sports", 
                "Equipements", 
                "unMotDePasse"
            );

            // Cas réussi : Connexion correcte et vente proposée
            System.out.println("\nCas réussi : Connexion correcte et vente proposée");
            testConnexionEtVente(boundaryVente, fournisseur, surfboard);

            // Cas d'échec : Connexion avec un mot de passe incorrect
            System.out.println("\nCas d'échec : Connexion avec un mot de passe incorrect");
            testConnexionIncorrecte(boundaryVente, fournisseur, "mauvaisMotDePasse");

            // Cas d'échec : Tentative de proposer une vente sans connexion
            System.out.println("\nCas d'échec : Tentative de proposer une vente sans connexion");
            testProposerVenteSansConnexion(boundaryVente, fournisseur, surfboard);

            // Cas d'échec : Vente sans produit
            System.out.println("\nCas d'échec : Vente sans produit");
            testVenteSansProduit(boundaryVente, fournisseur);

        } catch (Exception e) {
            System.out.println("Une erreur s'est produite : " + e.getMessage());
        }
    }

    /**
     * Teste une connexion correcte et propose une vente.
     */
    private static void testConnexionEtVente(BoundaryVente boundaryVente, Fournisseur fournisseur, Produit produit) {
        Vente vente = new Vente(
            "Vente d'été",
            new Date(),
            new Date(),
            "Promotion spéciale",
            Arrays.asList(Activite.SURFING, Activite.KITESURFING)
        );
        vente.ajouterProduit(produit, 2);

        boundaryVente.demanderConnexion(fournisseur, fournisseur.getAdresse(), fournisseur.getMotDePasse());

        if (boundaryVente.verifierConnexion(fournisseur)) {
            fournisseur.ajouterVente(vente);
            String result = boundaryVente.proposerVente(vente);
            System.out.println(result);
        } else {
            System.out.println("Impossible de proposer la vente. Fournisseur non connecté.");
        }
    }

    /**
     * Teste une connexion incorrecte avec un mot de passe erroné.
     */
    private static void testConnexionIncorrecte(BoundaryVente boundaryVente, Fournisseur fournisseur, String mauvaisMotDePasse) {
        boundaryVente.demanderConnexion(fournisseur, fournisseur.getAdresse(), mauvaisMotDePasse);

        if (!boundaryVente.verifierConnexion(fournisseur)) {
            System.out.println("Connexion refusée comme prévu.");
        } else {
            System.out.println("Erreur : La connexion ne devrait pas être réussie.");
        }
    }

    /**
     * Teste la tentative de proposer une vente sans connexion préalable.
     */
    private static void testProposerVenteSansConnexion(BoundaryVente boundaryVente, Fournisseur fournisseur, Produit produit) {
        Vente vente = new Vente(
            "Vente d'hiver",
            new Date(),
            new Date(),
            "Offre exceptionnelle",
            Arrays.asList(Activite.SNOWBOARDING)
        );
        vente.ajouterProduit(produit, 1);

        String result = boundaryVente.proposerVente(vente);
        System.out.println("Résultat attendu : " + result);
    }

    /**
     * Teste la tentative de créer une vente sans produit associé.
     */
    private static void testVenteSansProduit(BoundaryVente boundaryVente, Fournisseur fournisseur) {
        Vente vente = new Vente(
            "Vente vide",
            new Date(),
            new Date(),
            "Vente sans produits",
            Arrays.asList(Activite.SKATEBOARDING)
        );

        boundaryVente.demanderConnexion(fournisseur, fournisseur.getAdresse(), fournisseur.getMotDePasse());
        if (boundaryVente.verifierConnexion(fournisseur)) {
            fournisseur.ajouterVente(vente);
            String result = boundaryVente.proposerVente(vente);
            System.out.println(result);
        } else {
            System.out.println("Erreur : Vente vide proposée sans connexion.");
        }
    }
}
