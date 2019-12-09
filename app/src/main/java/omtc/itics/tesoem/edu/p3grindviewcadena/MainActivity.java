package omtc.itics.tesoem.edu.p3grindviewcadena;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gvDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gvDatos = findViewById(R.id.gvDatos);
        String[] arreglo = new String[]{"nom1","nom2","nom3","nom4","nom5"
                ,"nom6","nom7","nom8","nom9","nom10","nom11","nom12","nom13"
                ,"nom4","nom15","nom16"};
        ArrayAdapter adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,arreglo);
        gvDatos.setAdapter(adaptador);
    }
}
