// Classe Client
public class Client {
    public static void main(String[] args) {
        // Création des fabriques
        IProduitFactory produitFactory1 = new ProduitFactory1();
        IProduitFactory produitFactory2 = new ProduitFactory2();

        // Utilisation de la première fabrique
        System.out.println("Utilisation de la première fabrique");
        ProduitA produitA = produitFactory1.getProduitA();
        ProduitB produitB = produitFactory1.getProduitB();
        produitA.methodA();
        produitB.methodB();

        // Utilisation de la seconde fabrique
        System.out.println("Utilisation de la seconde fabrique");
        produitA = produitFactory2.getProduitA();
        produitB = produitFactory2.getProduitB();
        produitA.methodA();
        produitB.methodB();
    }
}
