package com.example.marcosf.appaula1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Bundle extras = getIntent().getExtras();

        if(extras != null){
            //lalala

            String texto = extras.getString(IntentActivity.CHAVE1);

            TextView textView = (TextView) findViewById(R.id.textView5);
            textView.setText(texto);

        }
        return;

    }
    public void voltar (View view){

        EditText editText = (EditText) findViewById(R.id.editText4);
        String textoTela2 = (String) editText.getText().toString();

        Intent intentRetorno = new Intent();
        intentRetorno.putExtra( IntentActivity.RETORNO_TELA_2_CHAVE1, textoTela2);
        setResult(IntentActivity.RESPONSE_TELA2_OK, intentRetorno);
        finish();
    }

    public void cancelar (View view){
        setResult(IntentActivity.RESPONSE_TELA2_CANCELA);
        finish();
    }
}
