package com.alfredo.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class HolaMundoActivity extends AppCompatActivity {

    /*
    * Esta es la activity que emos creado esta parte le dice a nuestra aplicacion que debemos hacer
    * o que condiciones debe seguir
    * */
    private Button miBoton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hola_mundo);

        miBoton = (Button)findViewById(R.id.mi_boton);

        miBoton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(HolaMundoActivity.this,"Hola mundo",Toast.LENGTH_LONG).show();
            }
        });
    }
}
