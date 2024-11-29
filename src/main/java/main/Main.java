package main.java.main;
import main.java.metier.*;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Création des objets
        Produit surfboard = new Produit("Surfboard", "Planche de surf", 300, 250, "Grande", "photo.jpg");
//                Fournisseur fournisseur = new Fournisseur("John", "123 Street", "john@example.com", "0123456789",
//                                "Sports",
//                                "Equipements");

        // Création de la vente
        Vente vente = new Vente("Vente d'été", new Date(), new Date(), "Promotion spéciale",
                Arrays.asList(Activite.SURFING, Activite.KITESURFING));
        vente.ajouterProduit(surfboard, 2);

        // Proposer et valider la vente
//                fournisseur.proposerVente(vente);

//                if (vente.getStatut().equals("Validée")) {
//                        // Création de la notification et envoi
//                        ClientPrivilegie client = new ClientPrivilegie("Alex", "Doe", "789 Boulevard",
//                                        "alex@example.com", "123456789",
//                                        Arrays.asList(Activite.SURFING));
//                        Notification notification = new Notification("Nouvelle Vente Validée",
//                                        "La vente d'été est maintenant disponible !");
//                        notification.ajouterDestinataire(client);
//
//                        ServeurMail serveurMail = new ServeurMail("smtp.example.com", 587, "user", "password");
//                        notification.envoyer(serveurMail);
//                } else {
//                        System.out.println("La vente n'a pas été validée.");
//                }
    }
}
