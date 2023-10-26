public class Animal {

    protected String name;
    protected int legs;
    protected Type type;
    protected enum Type {
        MAMMAL, FISH, BIRD
    };

    protected Animal (String name, int legs, Type type) {
        this.name = name;
        this.legs = legs;
        this.type = type;
        System.out.println("My name is " + name + " and I am a " + getType() + "!");
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

    public void setType(Type type) {
        this.type = type;
    }


}
