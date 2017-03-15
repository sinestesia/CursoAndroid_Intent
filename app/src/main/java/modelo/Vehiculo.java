package modelo;

import android.util.Log;

/**
 * Created by cice on 15/3/17.
 */

abstract class Vehiculo {
    private String matricula;
    private int tara;
    private String modelo;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getTara() {
        return tara;
    }

    public void setTara(int tara) {
        this.tara = tara;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Vehiculo(String matricula, int tara, String modelo) {
        this.matricula = matricula;
        this.tara = tara;
        this.modelo = modelo;
    }
    public void alquilar(){
        Log.d("coche", "alquilado");
    }

}

