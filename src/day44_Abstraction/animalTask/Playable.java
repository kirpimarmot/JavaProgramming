package day44_Abstraction.animalTask;

public interface Playable {

    boolean isFriendly = true;// static and final by default

    /*
    public static void method1(){
        System.out.println(isFriendly);
    } */

    void play();// public and abstract by default

}
