package cal.info.Modele;
import java.util.List;

public class GestionHackathon {
    private List<Hackathon> listeHackathons;

    public GestionHackathon(List<Hackathon> listeHackathons) {
        this.listeHackathons = listeHackathons;
    }

    public void AjouterHackathon (Hackathon h) {
        listeHackathons.add(h);
    }
    public void modifierHackathon (Hackathon h) {}
    public void supprimerHackathon (String nomHackathon) {}

    public void afficherHackathons() {
        for (Hackathon h : listeHackathons) {
            System.out.println("Nom: " + h.obtenirNom() + ", Date: " + h.obtenirDate() + ", Lieu: " + h.obtenirLieu());
        }
    }

    public void creerEtudiants(List<Etudiant> etudiants) {

    }
    public Equipe formerEquipe(List<Etudiant> etudiants, String nomEquipe) {
        return null;
    }

    
}
