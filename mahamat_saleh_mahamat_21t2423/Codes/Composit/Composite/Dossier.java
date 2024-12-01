package Codes.Composit.Composite;

import java.util.ArrayList;
import java.util.List;

import Codes.Composit.Component.Element;

public class Dossier extends Element{

    private List<Element> enfants;

    public Dossier(String nom) {
        super(nom, "dossier");
        this.enfants = new ArrayList<>();
    }

    @Override
    public void decrire() {
        System.out.println("Dossier : " + nom);
        for (Element enfant : enfants) {
            enfant.decrire();
        }
    }

    @Override
    public void ajouter(Element element) {
        enfants.add(element);
    }

    @Override
    public void supprimer(Element element) {
        enfants.remove(element);
    }

    @Override
    public Element obtenir(int index) {
        return enfants.get(index);
    }
}
