public class Main {
    public static void main(String[] args){
        // Test de la premiere fabrique
        ProduitFactory factory1 = new ProduitFactory1();
        ProduitA produit1 = factory1.geProduitA();
        produit1.afficherDetails();

        // Test de la deuxieme fabrique
        ProduitFactory factory2 = new ProduitFactory2();
        ProduitA produit2 = factory2.geProduitA();
        produit2.afficherDetails();
    }
}
