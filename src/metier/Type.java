package metier;

public class Type {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public Integer getPA() {
        return PA;
    }

    public void setPA(Integer PA) {
        this.PA = PA;
    }

    public Integer getPV() {
        return PV;
    }

    public void setPV(Integer PV) {
        this.PV = PV;
    }

    public Type(Integer id, String types,Integer PA, Integer PV) {
        this.id = id;
        this.types = types;
        this.PA = PA;
        this.PV = PV;

    }

    private Integer id;
    private String types;
    private Integer PA;
    private Integer PV;
}
