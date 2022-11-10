import java.util.ArrayList;

public class Ferme {

    //Attributes
    public ArrayList<Animal> animals = new ArrayList<Animal>();

    public static void main(String[] args) {
        Vache vache = new Vache();
        vache.cry();
        vache.eat();

        Poule poule = new Poule();
        poule.cry();
        poule.eat();
        poule.pondre();

        Cochon cochon = new Cochon();
        cochon.boue();
        cochon.eat();
        cochon.cry();

        Dinde dinde = new Dinde();
        dinde.cry();
        dinde.eat();
        dinde.pondre();

    Ferme ferme = new Ferme();

    ferme.animals.add(cochon);
    ferme.animals.add(poule);
    ferme.animals.add(dinde);
    ferme.animals.add(vache);

    ferme.feedAnimals();
    ferme.cryAnimals();
    }

    // Methode
    public void feedAnimals() {
        for (Animal animal : this.animals) {
            animal.eat();
        }
    }

    public void cryAnimals() {
        for (Animal animal : this.animals) {
            animal.cry();
        }
    }
}