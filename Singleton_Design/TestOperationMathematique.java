package Singleton_Design;

public class TestOperationMathematique {
    public static void main(String[] args) {
        // Test de la methode sum avec deux parametres
        OperationMathematique op1 = OperationMathematique.getInstance(2, 5);
        int somme2 = op1.sum(2, 5);
        System.out.printf("La somme de 2 et 5 est : %d\n", somme2);
        op1.affiche();

        // Test de la methode sum avec trois parametres
        OperationMathematique op2 = OperationMathematique.getInstance(8, 3, 7);
        int somme3 = op2.sum(8, 3, 7);
        System.out.printf("La somme de 8, 3 et 7 est : %d\n", somme3);
        op2.affiche();

        // Test de reutilisation de l'instance (Singleton)
        OperationMathematique op3 = OperationMathematique.getInstance(5, 9, 4);
        op3.affiche();
    }
}
