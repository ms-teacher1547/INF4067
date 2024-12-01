package Codes.Composit.Leaf;

import Codes.Composit.Component.Element;

public class FichierPDF extends Element{

    public FichierPDF(String nom) {
        super(nom, "pdf");
    }

    @Override
    public void decrire() {
        System.out.println("Fichier PDF : " + nom);
    }
}
