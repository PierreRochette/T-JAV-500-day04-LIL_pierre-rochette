public class Animal {

    protected enum Type {
        MAMMAL, FISH, BIRD
    };
    protected String name;
    protected int legs;
    protected Type type;
    private static int numberOfAnimals = 0;
    private static int numberOfMammals = 0;
    private static int numberOfFish = 0;
    private static int numberOfBirds = 0;

    protected Animal (String name, int legs, Type type) {
        this.name = name;
        this.legs = legs;
        this.type = type;
        System.out.println("My name is " + name + " and I am a " + getType() + "!");

        switch(type) {
            case MAMMAL :
                numberOfMammals++;
                break;
            case BIRD:
                numberOfBirds++;
                break;
            case FISH:
                numberOfFish++;
                break;
        }

        numberOfAnimals++;
    }

    public String getName() {
        return name;
    }

    public int getLegs() {
        return legs;
    }


    public String getType() {
        return switch (type) {
            case MAMMAL -> "mammal";
            case FISH -> "fish";
            case BIRD -> "bird";
            default -> "unknown";
        };
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getNumberOfAnimals() {
        if (numberOfAnimals == 1) {
            System.out.println("There is currently " + numberOfAnimals + " animal in our world.");
        } else {
            System.out.println("There are currently " + numberOfAnimals + " animals in our world.");
        }
        return numberOfAnimals;
    }

    public static int getNumberOfMammals() {
        if (numberOfMammals == 1) {
            System.out.println("There is currently " + numberOfMammals + " mammal in our world.");
        } else {
            System.out.println("There are currently " + numberOfMammals + " mammals in our world.");
        }

        return numberOfMammals;
    }

    public static int getNumberOfFish() {
        if (numberOfFish == 1) {
            System.out.println("There is currently " + numberOfFish + " fish in our world.");
        } else {
            System.out.println("There are currently " + numberOfFish + " fish in our world.");
        }

        return numberOfFish;
    }

    public static int getNumberOfBirds() {
        if (numberOfBirds == 1) {
            System.out.println("There is currently " + numberOfBirds + " bird in our world.");
        } else {
            System.out.println("There are currently " + numberOfBirds + " birds in our world.");
        }
        return numberOfBirds;
    }

}
