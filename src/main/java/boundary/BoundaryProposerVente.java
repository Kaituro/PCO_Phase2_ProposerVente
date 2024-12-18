    package main.java.boundary;

    import main.java.controller.ControllerProposerVente;
    import main.java.controller.ControllerVerifierIdentifiant;
    import main.java.metier.Fournisseur;
    import main.java.metier.Produit;
    import main.java.metier.Vente;

    import java.net.URI;
    import java.util.Date;
    import java.util.Scanner;

    /**
     * Classe BoundaryProposerVente.
     * Interface utilisateur permettant de gérer les interactions liées à la
     * proposition de vente.
     * Cette classe facilite la communication entre le fournisseur et les
     * contrôleurs.
     */
    public class BoundaryProposerVente {

        private ControllerProposerVente proposerVente = new ControllerProposerVente();
        private ControllerVerifierIdentifiant verifierIdentifiant = new ControllerVerifierIdentifiant();
        private Scanner scanner = new Scanner(System.in);

        /**
         * Permet à un fournisseur de proposer une vente.
         * Cette méthode demande à l'utilisateur les détails de la vente et les produits
         * associés.
         *
         * @param fournisseur L'objet fournisseur qui propose la vente.
         * @throws Exception Si une erreur survient lors de la création des URI ou des
         *                   données saisies.
         */
        public void proposerVente(Fournisseur fournisseur) throws Exception {
            System.out.println("Nom de la vente : ");
            String nomVente = scanner.nextLine();

            Vente vente = proposerVente.creerVente(nomVente, new Date(), new Date());

            System.out.println("Ajout de produits : ");
            while (true) {
                System.out.print("Nom du produit (stop pour terminer) : ");
                String nomProduit = scanner.nextLine();
                if (nomProduit.equalsIgnoreCase("stop"))
                    break;

                System.out.print("Prix du produit : ");
                double prix = scanner.nextDouble();

                System.out.print("Quantité : ");
                int quantite = scanner.nextInt();
                scanner.nextLine();

                vente.ajouterProduit(new Produit(nomProduit, prix, new URI("http://example.com")), quantite);
            }

            fournisseur.ajouterVente(vente);
            System.out.println("Vente ajoutée avec succès !");
        }
    }
