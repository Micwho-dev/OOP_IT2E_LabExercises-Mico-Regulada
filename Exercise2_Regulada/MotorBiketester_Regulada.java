public class MotorBiketester {
    public static void main(String[] args) {
        // Create 4 motorbike objects
        MotorBike Mbike1 = new MotorBike("Yamaha", "R15 V4", 155, 165.999);
        MotorBike Mbike2 = new MotorBike("Honda", "CBR500R", 471, 409.999);
        MotorBike Mbike3 = new MotorBike("Kawasaki", "Ninja 400", 399, 331.999);
        MotorBike Mbike4 = new MotorBike("Suzuki", "GSX-R1000", 999, 995.999);

        // Display details of all motorbikes
        Mbike1.displayMotorBikeDetails();
        Mbike2.displayMotorBikeDetails();
        Mbike3.displayMotorBikeDetails();
        Mbike4.displayMotorBikeDetails();
    }
}
