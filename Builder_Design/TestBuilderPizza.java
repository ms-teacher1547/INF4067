public class TestBuilderPizza {
    public static void main(String[] args) {
        DirecteurCuisinier cuisinier = new DirecteurCuisinier();

        // Construire une pizza reine
        MonteurPizza monteurReine = new MonteurPizzaReine();
        cuisinier.setMonteurPizza(monteurReine);
        cuisinier.construirePizza();
        Pizza pizzaReine = cuisinier.getPizza();
        pizzaReine.print();

        System.out.println();

        // Construire une pizza piquante
        MonteurPizza monteurPiquante = new MonteurPizzaPiquante();
        cuisinier.setMonteurPizza(monteurPiquante);
        cuisinier.construirePizza();
        Pizza pizzaPiquante = cuisinier.getPizza();
        pizzaPiquante.print();
    }
}
