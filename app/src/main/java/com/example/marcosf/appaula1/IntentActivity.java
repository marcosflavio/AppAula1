package com.example.marcosf.appaula1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by marcosf on 09/09/2016.
 */
public class IntentActivity extends AppCompatActivity {

    //constantes para minhas chaves
    public static final String CHAVE1 = "chave";

    public static final String RETORNO_TELA_2_CHAVE1 = "retornoTela2_chave1";

    //constantes para representar meus codigos
    public static final int REQUIS_TELA2 = 0;
    public static final int RESPONSE_TELA2_OK = 1;
    public static final int RESPONSE_TELA2_CANCELA = 2;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent_activity);
    }

    public void abrirTela2(View view){


        Intent intent = new Intent(this, Activity2.class);
        intent.setType("text/plain");

        EditText editText = (EditText) findViewById(R.id.editText3);
        String texto = (String ) editText.getText().toString();

        //Passando dados para a nova tela
        intent.putExtra(CHAVE1, texto);

        //Inicializar uma tela, mas sem esperar retorno
        //startActivity(intent);

        startActivityForResult(intent,IntentActivity.REQUIS_TELA2);

    }

    //Metodo para receber a resposta da tela chamada pela intent
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode == IntentActivity.REQUIS_TELA2){

            if(resultCode == IntentActivity.RESPONSE_TELA2_OK){
                //voltei da tela2 com o código ok.

                // se recebi resposta com o valor passado na tela 2
                if( data.hasExtra(IntentActivity.RETORNO_TELA_2_CHAVE1)){
                    String textoTela2 = data.getExtras().getString(IntentActivity.RETORNO_TELA_2_CHAVE1);
                    TextView textView = (TextView) findViewById(R.id.textView4);
                    textView.setText(textoTela2);
                }
            }

            else if(resultCode == IntentActivity.RESPONSE_TELA2_CANCELA){
                //voltei da tela2 com o codigo cancel

                    //String textoTela2 = data.getExtras().getString(IntentActivity.RETORNO_TELA_2_CHAVE1);
                    TextView textView = (TextView) findViewById(R.id.textView4);
                    textView.setText("ERRO 404 ERRO 404 ERRO 404 ERRO 404" +
                            "ERRO 404 ERRO 404 ERRO 404" +
                            "ERRO 404 ERRO 404 ERRO 404 ERRO 404 ERRO 404 ERRO 404 " +
                            "ERRO 404 ERRO 404 ERRO 404 ERRO 404 ERRO 404 ERRO 404" +
                            "ERRO 404 ERRO 404 ERRO 404 ERRO 404 ERRO 404 ERRO 404");

            }
        }
    }
}