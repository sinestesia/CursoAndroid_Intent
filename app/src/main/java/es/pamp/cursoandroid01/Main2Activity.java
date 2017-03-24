package es.pamp.cursoandroid01;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        final SharedPreferences pref = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);

        Button botonSalir =(Button) findViewById(R.id.botonSalir);
        botonSalir.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v) {
                                              SharedPreferences.Editor editor = pref.edit();
                                              editor.putString("Login","No");
                                              editor.commit();
                                          }
                                      }



        );
    }
}
