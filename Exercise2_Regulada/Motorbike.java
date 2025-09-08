// Blueprint sa bike class
public class MotorBike {
    
    public String brand; // brand name sa bike
    public String model; // model name sa bike
    public int engineCC;     // engine displacement (cc)
    public double price;     // presyo sa bike

    // mo-setup sa values sa bag-ong Bike
    public MotorBike(String brand, String model, int engineCC, double price) {
        this.brand = brand;
        this.model = model;
        this.engineCC = engineCC;
        this.price = price;
    }

    // pangkuha sa values 
    public String getBrand() { return brand; }
    public String getModel() { return model; }
    public int getEngineCC() { return engineCC; }
    public double getPrice() { return price; }

    // pang-ilis/pa-update sa values
    public void setEngineCC(int engineCC) { this.engineCC = engineCC; }
    public void setPrice(double price) { this.price = price; }

    // mo-print sa details sa console
    public void displayMotorBikeDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Engine: " + engineCC + "cc");
        System.out.println("Price: P " + price);
        System.out.println();
    }
}