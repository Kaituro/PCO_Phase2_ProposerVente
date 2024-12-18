package main.java.main;

import main.java.boundary.BoundaryProposerVente;
import main.java.controller.ControllerVerifierIdentifiant;
import main.java.metier.Fournisseur;

import java.util.Scanner;

/**
 * Classe Main.
 * Point d'entrée du programme pour gérer l'authentification du fournisseur
 * et la proposition de vente.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ControllerVerifierIdentifiant verifierIdentifiant = new ControllerVerifierIdentifiant();
        BoundaryProposerVente boundary = new BoundaryProposerVente();

        try {
            // Création d'un fournisseur
            Fournisseur fournisseur = new Fournisseur();

            System.out.println("===== Connexion du Fournisseur =====");
            System.out.print("Entrez votre identifiant : ");
            String id = scanner.nextLine();

            System.out.print("Entrez votre mot de passe : ");
            String mdp = scanner.nextLine();

            // Vérification des identifiants (login -> fournisseur:password)
            if (verifierIdentifiant.verifierIdentifiants(fournisseur, id, mdp)) {
                System.out.println("Connexion réussie !");
                System.out.println("Bienvenue, fournisseur.");

                // Proposer une vente après connexion réussie
                boundary.proposerVente(fournisseur);

                // Afficher les ventes ajoutées
                System.out.println("===== Vos ventes =====");
                fournisseur.getVentes().forEach(System.out::println);
            } else {
                System.out.println("Erreur : Identifiants incorrects. Fin du programme.");
            }

        } catch (Exception e) {
            System.err.println("Erreur : " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
