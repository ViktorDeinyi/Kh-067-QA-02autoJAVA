package Task6;

import Task6.Transport.AirTransport.AirTransportRealization.Airplane;
import Task6.Transport.AirTransport.Iwings;
import Task6.Transport.LandTransport.Iwheels;
import Task6.Transport.LandTransport.LandTransportRealization.Automobile;
import Task6.Transport.LandTransport.LandTransportRealization.Train;
import Task6.Transport.WaterTransport.WaterTransportRealization.Ship;

public class Main {
    public static void main(String[] args) {
        Airplane aerobus = new Airplane("aerobus200", 1000, 300);
        aerobus.describe();
        aerobus.info();

        Airplane boeing = new Airplane("boeing747", 1000, 300, 3000, 4);
        boeing.describe();
        boeing.info();
        Iwheels wheelsAirplane = boeing;
        wheelsAirplane.haveWeels();
        System.out.println(wheelsAirplane.amountOfWeels() + wheelsAirplane.materialOfWeels());
        Iwings wingsAirplane = boeing;
        System.out.println(Iwings.HAVEVINGS + wingsAirplane.amountOfWings());
        System.out.println("And the engine is located on them (" + wingsAirplane.isEngineOnWings() + ")");

        Automobile bmw741 = new Automobile("bmw741", 300, 5, 2);
        bmw741.describe();
        bmw741.info();
        Iwheels wheelsCar = bmw741;
        wheelsCar.haveWeels();
        System.out.println(wheelsCar.amountOfWeels() + wheelsCar.materialOfWeels());

        Train intercity = new Train("intercity", 550, 800, 12);
        intercity.describe();
        intercity.info();
        Iwheels wheelsTrain = intercity;
        wheelsTrain.haveWeels();
        System.out.println(wheelsTrain.amountOfWeels() + wheelsTrain.materialOfWeels());

        Ship sealiner = new Ship("sealiner", 100, 200);
        sealiner.describe();
        sealiner.info();

        Ship barkas = new Ship("barkas", 100, 200, 3);
        barkas.describe();
        barkas.info();
    }
}