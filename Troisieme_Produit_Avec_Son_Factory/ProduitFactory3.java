package Troisieme_Produit_Avec_Son_Factory;

public class ProduitFactory3 extends ProduitFactory{
    @Override
    protected ProduitA createProduitA() {
        return new ProduitA3();
    }
}
