package main.java.entity;

public interface Entite {
    public String nom = "";
    public String adresse = "";
    public String telephone = "";
    public String email = "";

    String getAttribute();
    void setAttribute(String attribute);

}
