package distanceconverter;

public class Distance {
    // Convert meter to kilometer
    public double meterToKm(double meter) {
        return meter / 1000;
    }

    // Convert kilometer to meter
    public double kmToMeter(double km) {
        return km * 1000;
    }

    // Convert miles to kilometer
    public double milesToKm(double miles) {
        return miles * 1.60934;
    }

    // Convert kilometer to miles
    public double kmToMiles(double km) {
        return km / 1.60934;
    }
}
