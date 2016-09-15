package com.example.marcosf.appaula1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterar(View view){

        EditText caixaTexto = (EditText) findViewById(R.id.editText);
        String conteudo = caixaTexto.getText().toString();
        caixaTexto.setText("");

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(conteudo);
    }
}
