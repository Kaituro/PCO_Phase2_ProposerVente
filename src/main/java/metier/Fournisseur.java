package main.java.metier;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe Fournisseur.
 * Représente un fournisseur qui gère des ventes.
 * Cette classe contient une liste de ventes associées au fournisseur.
 */
public class Fournisseur {

    /**
     * Liste des ventes associées au fournisseur.
     */
    private List<Vente> ventes;

    /**
     * Constructeur par défaut.
     * Initialise une nouvelle instance de fournisseur avec une liste de ventes
     * vide.
     */
    public Fournisseur() {
        this.ventes = new ArrayList<>();
    }

    /**
     * Ajoute une vente à la liste des ventes du fournisseur.
     *
     * @param vente La vente à ajouter.
     */
    public void ajouterVente(Vente vente) {
        ventes.add(vente);
    }

    /**
     * Récupère la liste des ventes associées au fournisseur.
     *
     * @return Une liste de {@link Vente}.
     */
    public List<Vente> getVentes() {
        return ventes;
    }
}
