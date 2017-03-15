package modelo;

/**
 * Created by cice on 15/3/17.
 */

public class GasolinaCoche extends Coche {
    private int deposito;

    public int getDeposito() {
        return deposito;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    public GasolinaCoche(String matricula, int tara, String modelo, int numPuertas, int deposito) {
        super(matricula, tara, modelo, numPuertas);
        this.deposito = deposito;
    }
}
