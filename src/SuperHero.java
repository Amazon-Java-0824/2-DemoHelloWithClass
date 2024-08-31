public class SuperHero extends Person{

    private String superPower;


    @Override
    public void eat(Food food) {
        System.out.println("SuperHero eats food just by looking at it");
    }

    public SuperHero(String firstName, String lastName, String documentId, String superPower) {
        super(firstName, lastName, documentId);
        this.superPower = superPower;
    }

    public String getSuperPower() {
        return superPower;
    }

    public void setSuperPower(String superPower) {
        this.superPower = superPower;
    }
}
