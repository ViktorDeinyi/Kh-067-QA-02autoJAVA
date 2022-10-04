package Task6.Transport.AirTransport;

import Task6.Transport.Transport;

public class Air extends Transport {
    public Air(int maxspeed, int maxpassangers) {
        this.setMaxspeed(maxspeed);
        this.setMaxpassangers(maxpassangers);
    }

    @Override
    public void describe() {
        System.out.print("\nAir transport ");
    }
}