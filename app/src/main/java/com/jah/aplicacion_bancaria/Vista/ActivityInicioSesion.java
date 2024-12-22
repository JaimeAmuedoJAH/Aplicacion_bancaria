package com.jah.aplicacion_bancaria.Vista;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.jah.aplicacion_bancaria.Controlador.ControladorUsuario;
import com.jah.aplicacion_bancaria.Modelo.Cuenta;
import com.jah.aplicacion_bancaria.Modelo.Usuario;
import com.jah.aplicacion_bancaria.R;

public class ActivityInicioSesion extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btnInicioSesion;
    TextView txtPassInicio;
    Usuario usuario;
    int[] contrasenhaIntroducida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_sesion);
        initComponents();
    }

    private void initComponents() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn10 = findViewById(R.id.btn10);
        btnInicioSesion = findViewById(R.id.btnInicioSesion);
        txtPassInicio = findViewById(R.id.txtPassInicio);
        contrasenhaIntroducida = new int[6];
        ControladorUsuario.cargarUsuario();
        txtPassInicio.setText("******");
    }
}