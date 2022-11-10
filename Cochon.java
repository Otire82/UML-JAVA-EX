public class Cochon extends Animal {

    @Override
    public void cry() {
        System.out.println("Le cochon fait groin groin");
    }

    @Override
    public void eat() {
        System.out.println("Le cochon fait miam quand il mange");
    }

    public void boue() {
        System.out.println("Le cochon se roule dans la boue");
    }
    
}