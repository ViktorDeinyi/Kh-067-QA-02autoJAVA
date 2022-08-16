package Task6.Transport.LandTransport.LandTransportRealization;

import Task6.Transport.LandTransport.Land;

public class Automobile extends Land {

    public Automobile(String name, int maxspeed, int maxpassangers) {
        super(maxspeed, maxpassangers);
        this.name = name;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println(" rides roads");
    }
}