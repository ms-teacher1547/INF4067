package Codes.Composit.Component;

// Component
public abstract class Element {

    protected String nom;
    protected String type;

    public Element(String nom, String type) {
        this.nom = nom;
        this.type = type;
    }

    public abstract void decrire();

    public void ajouter(Element element) {
        
    }

    public void supprimer(Element element) {

    }
    public Element obtenir(int index) {
            return null;

    }
}
