package Task6;

import Task6.Transport.AirTransport.AirTransportRealization.Airplane;
import Task6.Transport.LandTransport.LandTransportRealization.Automobile;
import Task6.Transport.LandTransport.LandTransportRealization.Train;
import Task6.Transport.WaterTransport.WaterTransportRealization.Ship;

public class Main {

    public static void main(String[] args) {

        Airplane boeing = new Airplane("boeing747", 1000, 300);
        boeing.describe();
        boeing.info();


        Airplane aerobus = new Airplane("aerobus200", 1000, 300, 3000);
        aerobus.describe();
        aerobus.info();


        Automobile bmw741 = new Automobile("bmw741", 300, 5 );
        bmw741.describe();
        bmw741.info();

        Train intercity = new Train("intercity", 550, 800);
        intercity.describe();
        intercity.info();


        Ship sealiner = new Ship("sealiner", 100, 200);
        sealiner.describe();
        sealiner.info();

        Ship barkas = new Ship("barkas", 100, 200, 3);
        barkas.describe();
        barkas.info();

    }
}