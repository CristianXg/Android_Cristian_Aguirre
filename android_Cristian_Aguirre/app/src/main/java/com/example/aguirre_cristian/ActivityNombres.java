package com.example.aguirre_cristian;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityNombres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nombres);

        TextView textoNombres = findViewById(R.id.lblNombres);
        TextView textoApellidos = findViewById(R.id.lblApellidos);
        Bundle bundle = this.getIntent().getExtras();
        textoNombres.setText(bundle.getString("nombre"));
        textoApellidos.setText(bundle.getString("apellido"));
    }
}