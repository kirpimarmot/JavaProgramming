package task_And_Solutions_day39.device;

public class Iphone extends Phone{

    public Iphone(String brand, String model, String color, String size, double price) {
        super(brand, model, color, size, price);
    }

    public void faceTime(long phoneNUm){
        System.out.println(getBrand()+" "+getModel()+" is face timing with "+phoneNUm);
    }

    public void facetime(String email){
        System.out.println(getBrand()+" "+getModel()+" is face timing with "+email);
    }
}
