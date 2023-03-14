public class Animal {

    protected String name;
    protected String category;
    protected int numLegs;
    protected String location;
    protected String sound;
    
    public Animal(String name, String category, int numLegs, String location, String sound) {
        this.name = name;
        this.category = category;
        this.numLegs = numLegs;
        this.location = location;
        this.sound = sound;
    }

    protected String speak() {
        return sound;
    }

    protected String move() {
        return "move";
    }

    protected final String getLocation() {
        return location;
    }

}
