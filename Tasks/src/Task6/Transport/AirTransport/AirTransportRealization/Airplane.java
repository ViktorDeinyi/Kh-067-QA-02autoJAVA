package Task6.Transport.AirTransport.AirTransportRealization;

import Task6.Transport.AirTransport.Air;

public class Airplane extends Air {
private int maxFlightAltitude;

    public Airplane(String name, int maxspeed, int maxpassangers) {
        super(maxspeed, maxpassangers);
        this.name = name;

    }public Airplane(String name, int maxspeed, int maxpassangers, int maxFlightAltitude) {
        super(maxspeed, maxpassangers);
        this.name = name;
        this.maxFlightAltitude = maxFlightAltitude;
    }

    @Override
    public void info() {
        super.info();
        if (!(maxFlightAltitude==0))
        {System.out.println("maxFlightAltitude - " + maxFlightAltitude );}
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println(" fly");
    }
}

