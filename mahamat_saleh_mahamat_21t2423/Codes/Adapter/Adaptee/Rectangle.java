package Codes.Adapter.Adaptee;

// Classe adaptee
public class Rectangle {

    private double largeur;
    private double hauteur;

    public void setDimension(double largeur, double hauteur){
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public double calculerPerimetre() {
        return 2 * (largeur + hauteur);
    }

    public double calculerAire() {
        return largeur * hauteur;
    }
}
