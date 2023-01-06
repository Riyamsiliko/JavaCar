public class Car {
    private int Speed;
    private double RegularPrice;
    private String Color;

    public Car (int speed,double regularPrice,String color) {
        this.Speed = speed;
        this.RegularPrice = regularPrice;
        this.Color = color;
    }


    public double getSalePrice() {
        return RegularPrice;
    }
}