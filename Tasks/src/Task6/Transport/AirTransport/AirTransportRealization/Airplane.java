package Task6.Transport.AirTransport.AirTransportRealization;

import Task6.Transport.AirTransport.Air;
import Task6.Transport.AirTransport.Iwings;
import Task6.Transport.LandTransport.Iwheels;

public class Airplane extends Air implements Iwings, Iwheels {
    private int maxFlightAltitude;
    private int numberOfAxels;

    public Airplane(String name, int maxspeed, int maxpassangers) {
        super(maxspeed, maxpassangers);
        this.name = name;
    }

    public Airplane(String name, int maxspeed, int maxpassangers, int maxFlightAltitude, int numberOfAxels) {
        super(maxspeed, maxpassangers);
        this.name = name;
        this.maxFlightAltitude = maxFlightAltitude;
        this.numberOfAxels = numberOfAxels;
    }

    @Override
    public void info() {
        super.info();
        if (!(maxFlightAltitude == 0)) {
            System.out.println("maxFlightAltitude - " + maxFlightAltitude);
        }
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println(" fly");
    }

    @Override
    public boolean isEngineOnWings() {
        if (name.contains("boeing"))
            return true;
        else return false;
    }

    @Override
    public int amountOfWings() {
        return 2;
    }

    @Override
    public int amountOfWeels() {
        return numberOfAxels * 2;
    }

    @Override
    public String materialOfWeels() {
        return " Rubber wheels";
    }
}