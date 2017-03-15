package modelo;

import java.util.Iterator;

/**
 * Created by cice on 15/3/17.
 */

public class FlotaGasolina implements Iterable {
    public void crearFlota(){
        GasolinaCoche gasolinaCoche1 = new GasolinaCoche("24567POO", 1278, "PEUGEOT",4,200);
        GasolinaCoche gasolinaCoche2 = new GasolinaCoche("0896AAA", 1278, "RENAULT",4,200);
        GasolinaCoche gasolinaCoche3 = new GasolinaCoche("9800HYD", 1278, "MAZDA",4,200);
        GasolinaCoche[] arrayGasolina = new GasolinaCoche[3];

    }

    @Override
    public Iterator<Vehiculo> iterator() {
        return null;
    }
}
