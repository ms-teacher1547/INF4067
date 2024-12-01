package Codes.Adapter.Adapter;

import Codes.Adapter.Adaptee.Rectangle;
import Codes.Adapter.Interface.Carre;

// Class Adapter
public class RectangleAdapter implements Carre{
    private Rectangle rectangle;

    public RectangleAdapter(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public void setCote(double cote) {
        rectangle.setDimension(cote, cote); // Un carre a des cotes egaux
    }

    @Override
    public double calculerPerimetre() {
        return rectangle.calculerPerimetre();
    }

    @Override
    public double calculerAire() {
        return rectangle.calculerAire();
    }

}
