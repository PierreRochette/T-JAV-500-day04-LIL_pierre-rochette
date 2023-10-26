public class Animal {

    protected String name;
    protected int legs;
    protected Type type;
    protected enum Type {
        MAMMAL, FISH, BIRD
    };

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
            case BIRD:
                numberOfBirds++;
            case FISH:
                numberOfFish++;
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
        switch(type) {
            case MAMMAL :
                return "mammal";
            case FISH :
                return "fish";
            case BIRD:
                return "bird";
            default:
                return "unknown";
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfAnimals() {
        if (numberOfAnimals <= 1) {
            System.out.println("There is currently " + numberOfAnimals + " animal in our world.");
        } else {
            System.out.println("There are currently " + numberOfAnimals + " in our world.");
        }
        return numberOfAnimals;
    }

    public int getNumberOfMammals() {
        if (numberOfMammals <= 1) {
            System.out.println("There is currently " + numberOfMammals + " mammal in our world.");
        } else {
            System.out.println("There are currently " + numberOfMammals + " mammals in our world.");
        }

        return numberOfMammals;
    }

    public int getNumberOfFish() {
        if (numberOfFish <= 1) {
            System.out.println("There is currently " + numberOfFish + " fish in our world.");
        } else {
            System.out.println("There are currently " + numberOfFish + " fish in our world.");
        }

        return numberOfFish;
    }

    public int getNumberOfBirds() {
        if (numberOfBirds <= 1) {
            System.out.println("There is currently " + numberOfBirds + " bird in our world.");
        } else {
            System.out.println("There are currently " + numberOfBirds + " birds in our world.");
        }
        return numberOfBirds;
    }


}
