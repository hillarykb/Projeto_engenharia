package com.example.jeniffer.projeto_eng;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;

import java.net.HttpURLConnection;
import java.net.URL;

public class TelaCadastro extends AppCompatActivity {

    EditText editUsuario,edisenha,editNome, editCargo;
    Button btnCadastrar, btnCancelar;
    Switch swtAdmin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_cadastro);

        editNome = (EditText)findViewById(R.id.editNome);
        editUsuario = (EditText)findViewById(R.id.editUsuario);
        edisenha = (EditText)findViewById(R.id.editSenha);
        editCargo = (EditText)findViewById(R.id.editCargo);
        btnCadastrar = (Button)findViewById(R.id.btnCadastrar);
        btnCancelar = (Button)findViewById(R.id.btnCancelar);
        swtAdmin = (Switch)findViewById(R.id.swtAdmin);

        URL url;
        HttpURLConnection connection = null;


        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
