public abstract class ProduitFactory {

    public ProduitA geProduitA() {
        return createProduitA();
    }

    protected abstract ProduitA createProduitA();
}