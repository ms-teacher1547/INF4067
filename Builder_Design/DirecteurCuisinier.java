public class DirecteurCuisinier {
    private MonteurPizza monteurPizza;

    public void setMonteurPizza(MonteurPizza mp) {
        monteurPizza = mp;
    }

    public Pizza getPizza() {
        return monteurPizza.getPizza();
    }

    public void construirePizza() {
        monteurPizza.creerNouvellePizza();
        monteurPizza.monterPate();
        monteurPizza.monterSauce();
        monteurPizza.monterGarniture();
    }
}
