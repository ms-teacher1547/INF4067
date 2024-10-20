package Troisieme_Produit_Avec_Son_Factory;

public class ProduitFactory1 extends ProduitFactory{
    @Override
    protected ProduitA createProduitA() {
        return new ProduitA1();
    }
}
