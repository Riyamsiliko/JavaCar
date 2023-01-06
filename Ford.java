public class Ford extends Car {
    private int Year;
    private int ManufacturerDiscount;

    public Ford (int speed,double regularPrice,String color, int year, int
            manufacturerDiscount) {
        super (speed,regularPrice,color);
        this.Year = year;
        this.ManufacturerDiscount = ManufacturerDiscount;
    }

    public double getSalePrice() {
        return (super.getSalePrice() - ManufacturerDiscount);
    }
}
