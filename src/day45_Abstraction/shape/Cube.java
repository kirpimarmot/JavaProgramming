package day45_Abstraction.shape;

public class Cube extends Shape{

    private double side;

    public Cube(String name, double side) {
        super(name);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side<=0){
            throw new RuntimeException("Invalid side: "+side);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return 6 * side;
    }

    @Override
    public double perimeter() {
        return 0;
    }


}
