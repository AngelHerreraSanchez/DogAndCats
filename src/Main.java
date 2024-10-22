public class Main {

    private Main(){
        // prevents instantiation
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Max", "Labrador", 5);
        Dog dog2 = new Dog("Unknown", "Unknown", 0);
        Cat cat1 = new Cat("Whiskers", "Black", 3);
        Cat cat2 = new Cat("Unknown", "Unknown", 0);


        System.out.println(dog1.displayAnimalInfo());
        System.out.println(dog2.displayAnimalInfo());
        System.out.println("All dogs are of species: " + Dog.displaySpecies());
        System.out.println(cat1.displayAnimalInfo());
        System.out.println(cat2.displayAnimalInfo());
        System.out.println("All cats are of species: " + Cat.displaySpecies());


    }

}

