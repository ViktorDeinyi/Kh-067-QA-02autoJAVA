package Task6.Transport.LandTransport;

import Task6.Transport.Transport;

public class Land extends Transport implements Iwheels {
    int numberOfAxels;

    public Land(int maxspeed, int maxpassangers, int numberOfAxels) {
        this.setMaxspeed(maxspeed);
        this.setMaxpassangers(maxpassangers);
        this.numberOfAxels = numberOfAxels;
    }

    @Override
    public void describe() {
        System.out.print("\nLand transport ");
    }

    @Override
    public int amountOfWeels() {
        return numberOfAxels * 2;
    }

    @Override
    public String materialOfWeels() {
        return " Wheels";
    }
}