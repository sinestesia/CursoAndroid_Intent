package modelo;

/**
 * Created by cice on 15/3/17.
 */

abstract class Coche extends Vehiculo {
    private int numPuertas;

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public Coche(String matricula, int tara, String modelo, int numPuertas) {
        super(matricula, tara, modelo);
        this.numPuertas = numPuertas;
    }
}
