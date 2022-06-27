package task_And_Solutions_day39.animalTask;

public class WildAnimal extends Animal{

    public static boolean isWild=false;
    public static boolean isFriendly=true;
    public static boolean isPlayable=true;

    public WildAnimal(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void hunt(){
        System.out.println(getName()+" is hunting");
    }
}
/*
Create a sub class of Animal named WildAnimal:
				Variable:
						isWild, isFriendly, isPlayable
				Extra Methods:
					hunt()
 */