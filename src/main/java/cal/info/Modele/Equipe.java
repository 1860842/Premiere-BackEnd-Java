package cal.info.modele;

import java.util.List;

public class Equipe {
    private List<Etudiant> listeMembres;
    private String nomEquipe;

    public Equipe(List<Etudiant> listeMembres, String nomEquipe) {
        this.listeMembres = listeMembres;
        this.nomEquipe = nomEquipe;
    }

    public void ajouterMembre(Etudiant e) {
        listeMembres.add(e);
    }
    
    public void afficherMembres() {
        for (Etudiant e : listeMembres) {
            System.out.println("Nom: " + e.obtenirNom() + ", Age: " + e.obtenirAge() + ", Note: " + e.obtenirNote());
        }
    }
}
