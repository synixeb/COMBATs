package metier;

public class Arme {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getPA() {
        return PA;
    }

    public void setPA(Integer PA) {
        this.PA = PA;
    }

    public Arme(Integer id, String nom, Integer PA) {
        this.id = id;
        this.nom = nom;
        this.PA = PA;
    }

    private Integer id;
    private String nom;
    private Integer PA;
}
