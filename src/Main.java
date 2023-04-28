import metier.Arme;
import metier.Combattant;
import metier.Type;

public class Main {
    public static void main(String[] args) {
        Type junior = new Type(1, "Junior", 5, 60);
        Type confirme = new Type(2, "Confirmé", 10, 80);
        Type veteran = new Type(3, "Vétéran", 20, 100);
        Type dieu = new Type(4, "Dieu", 50, 200);
        Type demon = new Type(5, "Démon", 30, 150);

        Arme poing = new Arme(1, "Poing", 5);
        Arme epee = new Arme(2, "Épée", 20);
        Arme hache = new Arme(3, "Hache", 25);
        Arme arc = new Arme(4, "Arc", 15);
        Arme bouclier = new Arme(5, "Bouclier", 10);

        Combattant shiva = new Combattant("Shiva", 1, 100, 1000, demon, poing);
        Combattant zeus = new Combattant("Zeus", 2, 150, 1200, dieu, epee);
        Combattant aphrodite = new Combattant("Aphrodite", 3, 80, 800, junior, bouclier);
        Combattant hades = new Combattant("Hadès", 4, 120, 1100, demon, hache);
        Combattant athena = new Combattant("Athéna", 5, 90, 1000, dieu, arc);

        zeus.combattre(hades);
    }
}