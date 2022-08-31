package Task6.Transport.LandTransport.LandTransportRealization;

import Task6.Transport.LandTransport.Land;

public class Automobile extends Land {

    public Automobile(String name, int maxspeed, int maxpassangers, int numberOfAxels) {
        super(maxspeed, maxpassangers, numberOfAxels);
        this.name = name;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println(" rides roads");
    }

    @Override
    public String materialOfWeels() {
        return " Rubber wheels";
    }
}