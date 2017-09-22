package com.example.jeniffer.projeto_eng;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TelaLogin extends AppCompatActivity {

    EditText editUsuario, editSenha;
    Button btnConectar;
    TextView txtCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_login);

       /* editUsuario = (EditText)findViewById(R.id.editUsuario);
        editSenha = (EditText)findViewById(R.id.editSenha);
        btnConectar = (Button)findViewById(R.id.btnConectar);
        txtCadastro = (TextView)findViewById(R.id.txtCadastro);*/
    }
}
