package main.java.Metier;

public abstract class Personne {
    protected String nom;
    protected String adresse;
    protected String email;
    protected String telephone;

    public Personne(String nom, String adresse, String email, String telephone) {
        this.nom = nom;
        this.adresse = adresse;
        this.email = email;
        this.telephone = telephone;
    }

    public String getNom() { return nom; }
    public String getAdresse() { return adresse; }
    public String getEmail() { return email; }
    public String getTelephone() { return telephone; }
}
