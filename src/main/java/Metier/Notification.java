package main.java.Metier;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Notification {
    private String titre;
    private String message;
    private Date dateEnvoi;
    private List<ClientPrivilegie> destinataires = new ArrayList<>();

    public Notification(String titre, String message) {
        this.titre = titre;
        this.message = message;
        this.dateEnvoi = new Date();
    }

    public void ajouterDestinataire(ClientPrivilegie client) {
        destinataires.add(client);
    }

    public void envoyer(ServeurMail serveurMail) {
        for (ClientPrivilegie destinataire : destinataires) {
            serveurMail.envoyerEmail(destinataire.getEmail(), titre, message);
            destinataire.recevoirNotification(this);
        }
    }

    public String getMessage() { return message; }
}
