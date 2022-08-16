package Task6.Transport.LandTransport;

import Task6.Transport.Transport;

public class Land extends Transport {

    public Land(int maxspeed, int maxpassangers) {
        this.setMaxspeed(maxspeed);
        this.setMaxpassangers(maxpassangers);
    }

    @Override
    public void describe() {
        System.out.print("\nLand transport ");
    }
}
