package es.pamp.cursoandroid01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import modelo.CocheElectrico;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("Coche", "Estoy aquí");

        CocheElectrico cocheElectrico = new CocheElectrico("2325AAX",2000,"Tesla",5,6000);
        cocheElectrico.alquilar();
    }
}
