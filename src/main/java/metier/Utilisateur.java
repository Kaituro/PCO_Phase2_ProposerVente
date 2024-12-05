package main.java.metier;

public class Utilisateur {
    private String email;
    private String mdp;
    private boolean identifie = false;

    public Utilisateur(String email, String mdp){
        this.email = email;
        this.mdp = mdp;
    }
    public boolean estIdentifie(){
        return identifie;
    }
    public void setIdentifie(){
        this.identifie = true;
    }

    public String getEmail() {
        return this.email;
    }
    public String getMdp() {
        return this.mdp;
    }
}