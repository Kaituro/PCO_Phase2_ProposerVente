package main.java.Metier;

public class Gerant extends Personne {
    public Gerant(String nom, String adresse, String email, String telephone) {
        super(nom, adresse, email, telephone);
    }

    public void validerVente(Vente vente) {
        vente.valider();
        System.out.println("Vente validée par le gérant : " + nom);
    }

    public void refuserVente(Vente vente, String motif) {
        vente.refuser();
        System.out.println("Vente refusée par le gérant : " + nom + " Motif : " + motif);
    }
}
