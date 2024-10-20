package Singleton_Design;

public final class OperationMathematique {
    // Attributs de la classe

    private static OperationMathematique instance = null;
    private int x;
    private int y;
    private int z;

    // Construction prive sans parametre (ne fait rien)
    private OperationMathematique() {
        super();
    }

    // Construction prive avec deux parametres
    private OperationMathematique(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Construction prive avec trois parametres
    private OperationMathematique(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Methode pour obtenir l'instance du Singleton (sans parametres)
    public static OperationMathematique getInstance() {
        if (instance == null) {
            instance = new OperationMathematique();
        }
        return instance;
    }

    // Methode pour obtenir l'instance du Singleton (avce deux parametres)
    public static OperationMathematique getInstance(int x, int y) {
        if (instance == null) {
            instance = new OperationMathematique(x, y);
        }
        return instance;
    }

    // Methode pour obtenir l'instance du Singleton (avec trois parametres)
    public static OperationMathematique getInstance(int x, int y, int z) {
        if (instance == null) {
            instance = new OperationMathematique(x, y, z);
        }
        return instance;
    }

    // Methode sum avec deux parametres
    public int sum(int x, int y) {
        return x + y;
    }

    // Methode sum avec trois parametres
    public int sum(int x, int y, int z) {
        return x + y + z;
    }

    // affichages des valeurs de l'instance
    public void affiche() {
        System.out.println("\n Je suis une instance mes valeurs sont x = " + this.x + ", y = " + this.y + ", z = " + this.z);
    }

    // Redefinir la methode clone pour empecher son utilisation
    @Override
    public Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }
}
