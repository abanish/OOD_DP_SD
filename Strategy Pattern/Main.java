public class Main
{
    public static void main(String[] args) {
        Vehicle vehicle = new Boat();
        vehicle.showTransportMedium();
        vehicle = new Aeroplane();
        vehicle.showTransportMedium();
    }
}