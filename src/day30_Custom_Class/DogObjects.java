package day30_Custom_Class;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender= 'F';
        dog1.size = "Small";
        dog1.color = "White";

        Dog dog2 = new Dog();
        dog2.name = "ACE";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color ="White & Black";

        Dog dog3 = new Dog();
        dog3.setInfo("Jack","German Shepard", 5, 'M', "Large", "Black");

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        Dog dog4 = new Dog();
        dog4.setInfo("Bullet", "Husky", 4, 'M', "large", "White");

        Dog dog5 = new Dog();
        dog5.setInfo("Samme", "German Shepard", 5, 'M', "Small", "Black");

        System.out.println("---------------------------------------------");

        Dog[] dogs = {dog1, dog2,dog3,dog4,dog5};

        ArrayList<Dog> dogList = new ArrayList<>();
        dogList.addAll(Arrays.asList(dog1,dog2,dog3,dog4,dog5));

        ArrayList<Dog> femaleDogs =new ArrayList<>();
        ArrayList<Dog> maleDogs =new ArrayList<>();

        for (Dog dog : dogList) {
            if (dog.gender == 'F') {
                femaleDogs.add(dog);
            } else {
                maleDogs.add(dog);
            }
        }

        System.err.println("Female: " +femaleDogs);
        System.out.println("Male; " +maleDogs);
        System.out.println("---------------------------------------------");

        dogList.removeIf(p-> p.gender==('F'));
        System.out.println(dogList);
        System.out.println("-----------------------------------------");
        dogList.addAll(Arrays.asList(dog1,dog2,dog3, dog4,dog5));
        dogList.removeIf(p-> p.gender=='M');
        System.out.println(dogList);




                
        


    }

}
