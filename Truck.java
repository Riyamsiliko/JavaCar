public class Truck extends Car {
    private int Weight;

    public Truck (int speed,double regularPrice,String color, int weight) {
        super(speed,regularPrice,color);
        this.Weight = weight;
    }

    public double getSalePrice() {
        if (Weight > 2000){
            return super.getSalePrice() - (0.1 * super.getSalePrice());
        }
        else {
            return super.getSalePrice();
        }
    }
}