package com.rozan.ktmmetro;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button BtnPrasa, BtnRajas, BtnWoda,Btnkarya;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //DataPrasasakiye();

        BtnPrasa = (Button) findViewById(R.id.btnPrasasakiya);
        BtnRajas = (Button) findViewById(R.id.btnRajaswo);
        BtnWoda = (Button) findViewById(R.id.btnWoda);
        Btnkarya = (Button) findViewById(R.id.btnDetails);


        BtnPrasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, PrasasakiyeActivity.class));
            }
        });

        BtnRajas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, RajaswoActivity.class));
            }
        });

        BtnWoda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, WodaActivity.class));
            }
        });

        Btnkarya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, OffDetailsActivity.class));
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.option_menu, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            //case R.id.updateData:
              //  Toast.makeText(getApplicationContext(),"Updated Sucessfully!!!",Toast.LENGTH_LONG).show();
                //return true;

            case R.id.exit:
                System.exit(0);
                return true;


            default:

                super.onOptionsItemSelected(item);

        }
        return true;

    }

}
