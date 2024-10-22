public class Dog {

    public String name;
    private String breed;
    protected int age;
    static String species = "Canine";


    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    public String getBreed(){
        return breed;
    }

    protected String displayAnimalInfo(){
        return ("Name: " + name + ", Breed: " + breed + ", Age: " + age);
    }

    static String displaySpecies(){
        return (species);
    }



}
