public class Shark extends Animal {

    private boolean frenzy;

    protected Shark(String name)  {
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

    public boolean canEat(Animal animal) {
        if (this !=animal) {
            return true;
        } else {
            return false;
        }
    }

    public void eat(Animal animal) {
        if (canEat(animal)) {
            System.out.println(name + "ate a " + animal.type + " named " + animal.name);
        }
    }

}
