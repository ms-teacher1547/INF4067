package Codes.Composit.Client;

import Codes.Composit.Composite.Dossier;
import Codes.Composit.Leaf.FichierPDF;
import Codes.Composit.Leaf.FichierTXT;

public class GestionFichier {

    public static void main(String[] args) {
        
        Dossier racine = new Dossier("Racine");
        FichierTXT fichier1 = new FichierTXT("Document1.txt");
        FichierPDF fichier2 = new FichierPDF("Document2.pdf");

        Dossier sousDossier = new Dossier("Sous-Dossier");
        FichierTXT fichier3 = new FichierTXT("Document3.txt");
        FichierPDF fichier4 = new FichierPDF("Document4.pdf");

        sousDossier.ajouter(fichier3);
        sousDossier.ajouter(fichier4);
        racine.ajouter(fichier1);
        racine.ajouter(fichier2);
        racine.ajouter(sousDossier);

        racine.decrire();
    }
}
