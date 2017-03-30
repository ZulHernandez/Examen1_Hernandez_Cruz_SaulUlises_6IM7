package com.example.cecyt9.examen1_app_apm_hernandezcruzsaululises_6im7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickConvertir (View vw)
    {
        Intent act2 = new Intent(this,actividad2.class);
        EditText mxnn;
        double mxn;
        double dol;
        String dollar;
        try
        {
            mxnn =  (EditText) findViewById(R.id.moneda);
            mxn = Double.parseDouble(mxnn.getText().toString());
            dol = mxn/15;
            dollar = ""+dol;
            Toast.makeText(getApplicationContext(),dollar, Toast.LENGTH_LONG).show();
            act2.putExtra("dol",dollar);
            finish();

            startActivity(act2);

        }catch (Exception exx)
        {
            Toast.makeText(this, "que pendejo", Toast.LENGTH_SHORT).show();
        }

    }
}
