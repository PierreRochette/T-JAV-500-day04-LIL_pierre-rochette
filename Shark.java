public class Shark extends Animal {

    private boolean frenzy;

    protected Shark(String name) {
        super(name, 0, Type.FISH);
        this.frenzy = false;
        System.out.println("A KILLER IS BORN!");

    }

    public void smellBlood (boolean frenzy) {
        this.frenzy = frenzy;
    }

    public void status () {
        if (frenzy) {
            System.out.println(name + " is smelling blood and wants to kill.");
        } else {
            System.out.println(name + " is swimming peacefully.");
        }
    }

}
