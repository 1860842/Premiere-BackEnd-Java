package cal.info.modele;

import java.sql.Date;

public class Hackathon {
    private String nomHackathon;
    private Date dateHackathon;
    private String lieuHackathon;

    public Hackathon(String nomHackathon, Date dateHackathon, String lieuHackathon) {
        this.nomHackathon = nomHackathon;
        this.dateHackathon = dateHackathon;
        this.lieuHackathon = lieuHackathon;
    }

    public String obtenirNom() {
        return nomHackathon;
    }
    
    public Date obtenirDate() {
        return dateHackathon;
    }

    public String obtenirLieu() {
        return lieuHackathon;
    }
}
