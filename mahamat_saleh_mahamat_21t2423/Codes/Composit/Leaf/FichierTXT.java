package Codes.Composit.Leaf;

import Codes.Composit.Component.Element;

public class FichierTXT extends Element{

    public FichierTXT(String nom) {
        super(nom, "txt");
    }

    @Override
    public void decrire() {
        System.out.println("Fichier TXT : " + nom);
    }
}
