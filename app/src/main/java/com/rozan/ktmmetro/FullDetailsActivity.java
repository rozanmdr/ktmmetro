package com.rozan.ktmmetro;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FullDetailsActivity extends Activity {
    String title;
    TextView txtTitle;
    Button btnUrl, btnFb, btnFbPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_details);


        btnUrl= (Button) findViewById(R.id.txtUrl);
        btnFb= (Button) findViewById(R.id.txtFb);
        btnFbPage= (Button) findViewById(R.id.txtFbPage);
        txtTitle= (TextView) findViewById(R.id.txtTitle);

        title = getIntent().getExtras().getString("title");
        txtTitle.setText(title);


        btnUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.namobuddhamun.gov.np")));

            }
        });
        btnFb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/namobuddhamun")));

            }
        });
        btnFbPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.facebook.com/hellonamobuddhamun")));

            }
        });
    }




}
