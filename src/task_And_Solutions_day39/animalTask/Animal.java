package task_And_Solutions_day39.animalTask;

public class Animal {

    private String name, breed;
    private char gender;
    private int age;
    private String size;
    private String color;

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null){
            System.err.println("Invalid name");
        }
        if (name.isEmpty()||name.isBlank()){
            System.err.println("invalid name");
        }
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed==null){
            System.err.println("Invalid breed");
        }
        if (breed.isEmpty()||breed.isBlank()){
            System.err.println("Invalid breed");
        }
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        gender= (""+gender).toUpperCase().charAt(0);
        if (gender=='M'||gender=='F'){
            System.err.println(("Invalid Gender"));
            System.exit(1);
        }
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color==null){
            System.err.println("Invalid color");
        }
        if (color.isEmpty()||color.isBlank()){
            System.err.println("Invalid color");
        }
        this.color = color;
    }

    public void eat(){
        System.out.println("");
    }

    public void drink(){
        System.out.println(name+" is drinking water");
    }

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public void move(){
        System.out.println(name+" is moving");
    }

    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
