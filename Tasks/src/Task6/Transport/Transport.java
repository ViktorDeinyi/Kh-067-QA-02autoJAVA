package Task6.Transport;

public abstract class Transport {
    private int maxspeed = 0;
    private int maxpassangers = 0;
    public String name = "???";

    abstract public void describe();

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public int getMaxpassangers() {
        return maxpassangers;
    }

    public void setMaxpassangers(int maxpassangers) {
        this.maxpassangers = maxpassangers;
    }

    public void info() {
        System.out.println(name + ":\nmaxspeed - " + getMaxspeed() + ":\nmaxpassangers - " + getMaxpassangers());
    }
}

