package com.example.cecyt9.examen1_app_apm_hernandezcruzsaululises_6im7;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class actividad2 extends AppCompatActivity {

    String cont;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad2);
        try{
            Bundle rec = this.getIntent().getExtras();

            String dol;
            TextView res;

            dol = rec.getString("dol");
            res =  (TextView) findViewById(R.id.res);

            res.setText(dol);
            cont = ""+dol;
        }catch (Exception e)
        {
            Toast.makeText(this, e.getMessage(), Toast.LENGTH_LONG).show();
        }

    }

    public void onClickEnviar(View vw)
    {
        Intent envia = new Intent(android.content.Intent.ACTION_SEND);

        envia.setType("plain/text");
        envia.putExtra(android.content.Intent.EXTRA_EMAIL, new String[]{"eoropezag@ipn.mx"});
        envia.putExtra(android.content.Intent.EXTRA_SUBJECT, "examen 1er parcial");
        envia.putExtra(android.content.Intent.EXTRA_TEXT, cont);

        startActivity(envia);

    }

}
