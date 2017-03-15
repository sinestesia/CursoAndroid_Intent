package modelo;

/**
 * Created by cice on 15/3/17.
 */

public class CocheElectrico extends Coche {
    private int bateria;

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public CocheElectrico(String matricula, int tara, String modelo, int numPuertas, int bateria) {
        super(matricula, tara, modelo, numPuertas);
        this.bateria = bateria;
    }
}
