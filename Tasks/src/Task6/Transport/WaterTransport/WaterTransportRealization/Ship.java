package Task6.Transport.WaterTransport.WaterTransportRealization;

import Task6.Transport.WaterTransport.Water;

public class Ship extends Water {

    public int minWaterDepth;

    public Ship(String name, int maxspeed, int maxpassangers) {
        super(maxspeed, maxpassangers);
        this.name = name;

    }
    public Ship(String name, int maxspeed, int maxpassangers, int minWaterDepth) {
        super(maxspeed, maxpassangers);
        this.name = name;
        this.minWaterDepth = minWaterDepth;
    }

    @Override
    public void info() {
        super.info();
        if (!(minWaterDepth==0))
        {System.out.println("minWaterDepth - " + minWaterDepth );}
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println(" swim");
    }
}
