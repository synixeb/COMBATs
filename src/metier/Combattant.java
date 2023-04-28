package metier;
public class Combattant {
        private String nom;
        private Integer id;
        private Integer PA;
        private Integer PV;
        private Type type;
        private Arme arme;

        public Combattant(String nom, Integer id, Integer PA, Integer PV, Type type, Arme arme) {
            this.nom = nom;
            this.id = id;
            this.PA = PA;
            this.PV = PV;
            this.type = type;
            this.arme = arme;
        }

        public String getNom() {
            return nom;
        }

        public void setNom(String nom) {
            this.nom = nom;
        }

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
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

        public Type getType() {
            return type;
        }

        public void setType(Type type) {
            this.type = type;
        }

        public Arme getArme() {
            return arme;
        }

        public void setArme(Arme arme) {
            this.arme = arme;
        }

    public void combattre(Combattant adversaire) {
        System.out.println("Début du combat entre " + this.getNom() + " et " + adversaire.getNom() + "!");

        while (this.getPV() > 0 && adversaire.getPV() > 0) {
            System.out.println(this.getNom() + " attaque " + adversaire.getNom() + " avec " + this.getArme().getNom() +
                    " et inflige " + this.getPA() + " points de dégâts.");

            adversaire.setPV(adversaire.getPV() - this.getPA());

            System.out.println(adversaire.getNom() + " a maintenant " + adversaire.getPV() + " points de vie.");

            if (adversaire.getPV() <= 0) {
                System.out.println(adversaire.getNom() + " est vaincu !");
                break;
            }

            System.out.println(adversaire.getNom() + " contre-attaque " + this.getNom() + " avec " +
                    adversaire.getArme().getNom() + " et inflige " + adversaire.getPA() + " points de dégâts.");

            this.setPV(this.getPV() - adversaire.getPA());

            System.out.println(this.getNom() + " a maintenant " + this.getPV() + " points de vie.");

            if (this.getPV() <= 0) {
                System.out.println(this.getNom() + " est vaincu !");
                break;
            }
        }

        System.out.println("Fin du combat entre " + this.getNom() + " et " + adversaire.getNom() + " !");
    }
    }
