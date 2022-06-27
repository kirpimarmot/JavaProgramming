package task_And_Solutions_day39.animalTask;

public class Dolphin extends FriendlyAnimal{

    public Dolphin(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void swim(){
        System.out.println(getName()+" is swimming under the water");
    }
}
