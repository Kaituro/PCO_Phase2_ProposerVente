package main.java.Metier;

public class ServeurMail {
    private String adresseServeur;
    private int port;
    private String utilisateur;
    private String motDePasse;

    public ServeurMail(String adresseServeur, int port, String utilisateur, String motDePasse) {
        this.adresseServeur = adresseServeur;
        this.port = port;
        this.utilisateur = utilisateur;
        this.motDePasse = motDePasse;
    }

    public void connecter() {
        System.out.println("Connecté au serveur de mail " + adresseServeur);
    }

    public void deconnecter() {
        System.out.println("Déconnecté du serveur de mail");
    }

    public void envoyerEmail(String destinataire, String sujet, String corps) {
        connecter();
        System.out.println("Envoi de l'email à " + destinataire + " avec le sujet : " + sujet);
        deconnecter();
    }
}
