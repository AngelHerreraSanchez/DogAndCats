public class Cat{

    public String name;
    private String color;
    protected int age;
    static String species = "Feline";


    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getColor(){
        return color;
    }

    protected String displayAnimalInfo(){
        return ("Name: " + name + ", Color: " + color + ", Age: " + age);
    }

    static String displaySpecies(){
        return (species);
    }



}
