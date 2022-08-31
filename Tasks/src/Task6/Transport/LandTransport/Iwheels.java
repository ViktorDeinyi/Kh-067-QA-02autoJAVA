package Task6.Transport.LandTransport;

public interface Iwheels {
    default void haveWeels() {
        System.out.print("This transport have: ");
    }

    int amountOfWeels();

    String materialOfWeels();
}