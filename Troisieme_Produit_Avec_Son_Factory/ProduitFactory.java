package Troisieme_Produit_Avec_Son_Factory;

public abstract class ProduitFactory {

    public ProduitA geProduitA() {
        return createProduitA();
    }

    protected abstract ProduitA createProduitA();
}