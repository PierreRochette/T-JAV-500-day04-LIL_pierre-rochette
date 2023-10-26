public class GreatWhite extends Shark {

    protected GreatWhite (String name) {
        super(name);
    }

    @Override
    public boolean canEat(Animal animal) {
        if (animal instanceof Canary) {
            System.out.println(name + ": Next time you try to give me that to eat, I'll ");
        }
    }

}
