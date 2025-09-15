public class Etudiant {
    private String nomEtudant;
    private int ageEtudiant;
    private double noteEtudiant;

    public Etudiant(String nom,int ageEtudiant,double noteEtudiant){
        this.nomEtudant=nom;
        this.ageEtudiant=ageEtudiant;
        this.noteEtudiant=noteEtudiant;
    }

    public String obtenirNom() {
        return nomEtudant;
    }
    
    public int obtenirAge() {
        return ageEtudiant;
    }

    public double obtenirNote() {
        return noteEtudiant;
    }
    public void ajouterPreferenceHackathon(Hackathon h) {}

}