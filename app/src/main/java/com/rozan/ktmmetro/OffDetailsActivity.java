package com.rozan.ktmmetro;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class OffDetailsActivity extends AppCompatActivity {
    Button[] btnR = new Button[3];
    String[] file = new String[2];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_off_details);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        btnR[0] = (Button) findViewById(R.id.btnD1);
        btnR[1] = (Button) findViewById(R.id.btnD2);
        btnR[2] = (Button) findViewById(R.id.btnD3);



        file[0] = "staffs.htm";
        file[1] = "sadasye.htm";


        btnR[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(OffDetailsActivity.this,FullDetailsActivity.class);

                intent.putExtra("title",btnR[0].getText().toString());


                startActivity(intent);
            }
        });
        for(int i=1;i<3;i++) {

            final String title= btnR[i].getText().toString();
            final int j = i-1;
            btnR[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent intent = new Intent(OffDetailsActivity.this,OfficeActivity.class);

                    intent.putExtra("title",title);
                    intent.putExtra("htmlUrl","file:///android_asset/karyalaye/"+file[j]);

                    startActivity(intent);
                }
            });
        }
    }
}
