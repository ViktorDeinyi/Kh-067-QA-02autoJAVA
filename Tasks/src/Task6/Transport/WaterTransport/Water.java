package Task6.Transport.WaterTransport;

import Task6.Transport.Transport;

public class Water extends Transport {
    public Water(int maxspeed, int maxpassangers) {
        this.setMaxspeed(maxspeed);
        this.setMaxpassangers(maxpassangers);
    }

    @Override
    public void describe() {
        System.out.print("\nWater transport ");
    }
}