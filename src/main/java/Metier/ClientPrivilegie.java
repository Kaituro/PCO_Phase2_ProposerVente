package main.java.Metier;

import java.util.List;

public class ClientPrivilegie extends Personne {
    private String prenom;
    private List<Activite> activites;

    public ClientPrivilegie(String nom, String prenom, String adresse, String email, String telephone,
            List<Activite> activites) {
        super(nom, adresse, email, telephone);
        this.prenom = prenom;
        this.activites = activites;
    }

    public void recevoirNotification(Notification notification) {
        System.out.println("Notification reçue par le client privilégié : " + nom + " - " + notification.getMessage());
    }
}
