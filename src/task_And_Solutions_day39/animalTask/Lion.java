package task_And_Solutions_day39.animalTask;

public class Lion extends WildAnimal{


    public Lion(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void hunt() {
        System.out.println("Lion "+getName()+" hunts buffaloes");
    }
}
