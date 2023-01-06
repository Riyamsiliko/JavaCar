public class Sedan extends Car {
    private int Length;

    public Sedan (int speed,double regularPrice,String color, int length) {
        super (speed,regularPrice,color);
        this.Length = length;
    }

    public double getSalePrice() {
        if (Length > 20) {
            return super.getSalePrice() - (0.05 * super.getSalePrice());
        }
        else {
            return super.getSalePrice() - (0.1 * super.getSalePrice());
        }
    }
}
