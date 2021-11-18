public abstract class Vehicle {
    TransportMedium transportMedium;

    public Vehicle() {}

    public void showTransportMedium() {
        transportMedium.transport();
    }
}