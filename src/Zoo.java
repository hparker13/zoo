import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {

        ArrayList<Animal> zooAnimals = new ArrayList<Animal>();

        Reptiles snakes = new Reptiles("Snakes", 0, "Woods", "Hissss");
        Reptiles lizards = new Reptiles("Lizards", 4, "Woods", "Click click");
        Mammals bears = new Mammals("Bears", "Woods", "Growl");
        Mammals otters = new Mammals("Otters", "Rivers", "Whistle");
        Mammals elephants = new Mammals("Elephants", "Asia, Africa", "Trumpet");
        zooAnimals.add(snakes);
        zooAnimals.add(lizards);
        zooAnimals.add(bears);
        zooAnimals.add(otters);
        zooAnimals.add(elephants);

        ArrayList<Animal> woods = new ArrayList<Animal>();

        for (Animal animal : zooAnimals) {
            System.out.print("Animal: " + animal.name + ", ");
            System.out.print("Move: " + animal.move() + ", ");
            System.out.print("Location: " + animal.getLocation() + ", ");
            System.out.println("Says: " + animal.speak() + " ");
        }

        for (Animal animal : zooAnimals) {
            if (animal.getLocation().equalsIgnoreCase("woods")) {

                woods.add(animal);
            }
        }

        for (Animal animal : woods) {
            System.out.println(animal.name);
        }

        System.out.println("A bear " + bears.move() + "s.");

    }
}
