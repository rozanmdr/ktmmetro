package com.rozan.ktmmetro;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class RajaswoActivity extends AppCompatActivity {
    Button[] btnR = new Button[13];
    String[] file = new String[13];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajaswo);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnR[0] = (Button) findViewById(R.id.btnR1);
        btnR[1] = (Button) findViewById(R.id.btnR2);
        btnR[2] = (Button) findViewById(R.id.btnR3);
        btnR[3] = (Button) findViewById(R.id.btnR4);
        btnR[4] = (Button) findViewById(R.id.btnR5);
        btnR[5] = (Button) findViewById(R.id.btnR6);
        btnR[6] = (Button) findViewById(R.id.btnR7);
        btnR[7] = (Button) findViewById(R.id.btnR8);
        btnR[8] = (Button) findViewById(R.id.btnR9);
        btnR[9] = (Button) findViewById(R.id.btnR10);
        btnR[10] = (Button) findViewById(R.id.btnR11);
        btnR[11] = (Button) findViewById(R.id.btnR12);
        btnR[12] = (Button) findViewById(R.id.btnR13);



        file[0] = "anex1.htm";
        file[1] = "anex2.htm";
        file[2] = "anex3.htm";
        file[3] = "anex4.htm";
        file[4] = "anex5.htm";
        file[5] = "anex6.htm";
        file[6] = "anex7.htm";
        file[7] = "anex8.htm";
        file[8] = "anex9.htm";
        file[9] = "anex10.htm";
        file[10] = "anex11.htm";
        file[11] = "anex12.htm";
        file[12] = "anex13.htm";



        for(int i=0;i<13;i++) {

            final String title= btnR[i].getText().toString();
            final int j = i;
            btnR[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(RajaswoActivity.this,RajaswoDetails.class);

                    intent.putExtra("title",title);
                    intent.putExtra("htmlUrl","file:///android_asset/prasasakiye/"+file[j]);

                    startActivity(intent);
                }
            });
        }
    }
}
