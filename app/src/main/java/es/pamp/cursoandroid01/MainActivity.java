package es.pamp.cursoandroid01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonPrueba =(Button) findViewById(R.id.button2);
        buttonPrueba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);

                String usuario =  ((EditText)findViewById(R.id.editText3)).getText().toString();
                String pass = ((EditText)findViewById(R.id.editText4)).getText().toString();

                if (!usuario.equals("") && !pass.equals("") && usuario.equals(pass)){

                    startActivity(i);
                    finish();
                }else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Contraseña incorrecta", Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });
        Button botonRegistro =(Button) findViewById(R.id.botonRegistro);
        botonRegistro.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {
                                                Intent i = new Intent(getApplicationContext(), RegistroActivity.class);
                                                startActivity(i);
                                                finish();
                                            }
                                        }



        );






    }

}
