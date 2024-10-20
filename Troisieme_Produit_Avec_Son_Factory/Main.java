package Troisieme_Produit_Avec_Son_Factory;

public class Main {
    public static void main(String[] args) {
        // Test de la premiere fabrique
        ProduitFactory factory1 = new ProduitFactory1();
        ProduitA produit1 = factory1.geProduitA();
        produit1.afficherDetails();

        // Test de la deuxieme fabrique
        ProduitFactory factory2 = new ProduitFactory2();
        ProduitA produit2 = factory2.geProduitA();
        produit2.afficherDetails();

        // Test de la troisieme fabrique
        ProduitFactory factory3 = new ProduitFactory3();
        ProduitA produit3 = factory3.geProduitA();
        produit3.afficherDetails();
    }
}
