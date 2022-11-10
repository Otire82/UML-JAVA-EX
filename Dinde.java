
public class Dinde extends Animal implements Vollaile {

    @Override
    public void eat() {
        System.out.println("la dinde fait pic pic quand elle mange");
    }

    @Override
    public void cry() {
        System.out.println("la dinde fait piou piou");
    }

    @Override
    public void pondre() {
        System.out.println("Oh un oeuf de dinde");
    }

}
