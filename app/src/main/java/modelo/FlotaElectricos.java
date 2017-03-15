package modelo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by cice on 15/3/17.
 */

public class FlotaElectricos implements Iterable {
    public void crearFlota(){
        ArrayList<CocheElectrico> arrayElectricos= new ArrayList<CocheElectrico>();

        CocheElectrico cocheElectrico1 = new CocheElectrico("2325AAX",2000,"Tesla",5,6000);
        CocheElectrico cocheElectrico2 = new CocheElectrico("7864ZWA",2000,"Tesla",5,6000);
        CocheElectrico cocheElectrico3 = new CocheElectrico("0005DCF",2000,"Tesla",5,6000);

        arrayElectricos.add(cocheElectrico1);
        arrayElectricos.add(cocheElectrico2);
        arrayElectricos.add(cocheElectrico3);
    };

    @Override
    public Iterator <Vehiculo> iterator() {
        return null;
    }
}
