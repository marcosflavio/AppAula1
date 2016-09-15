package com.example.marcosf.appaula1;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by marcosf on 08/09/2016.
 */
public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second);

    }

    public void alterar2 (View view){
        EditText caixaTexto = (EditText) findViewById(R.id.editText2);
        String conteudo = caixaTexto.getText().toString();


        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(conteudo);

    }

    public void apagar (View view){
        EditText caixaTexto = (EditText) findViewById(R.id.editText2);
        caixaTexto.setText("");

        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(R.string.textView2);
    }

}
