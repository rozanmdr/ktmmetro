package com.rozan.ktmmetro;

import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.os.AsyncTask;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class PrasasakiyeActivity extends AppCompatActivity {
    Button[] btnP = new Button[70];
    Cursor c = null;
    String selection;
    //String json_string;
    String[] columns={"title","reqDocuments","procForFacility","respOfficer","time"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_prasasakiye);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        btnP[0] = (Button) findViewById(R.id.btnP1);
        btnP[1] = (Button) findViewById(R.id.btnP2);
        btnP[2] = (Button) findViewById(R.id.btnP3);
        btnP[3] = (Button) findViewById(R.id.btnP4);
        btnP[4] = (Button) findViewById(R.id.btnP5);
        btnP[5] = (Button) findViewById(R.id.btnP6);
        btnP[6] = (Button) findViewById(R.id.btnP7);
        btnP[7] = (Button) findViewById(R.id.btnP8);
        btnP[8] = (Button) findViewById(R.id.btnP9);
        btnP[9] = (Button) findViewById(R.id.btnP10);
        btnP[10] = (Button) findViewById(R.id.btnP11);
        btnP[11] = (Button) findViewById(R.id.btnP12);
        btnP[12] = (Button) findViewById(R.id.btnP13);
        btnP[13] = (Button) findViewById(R.id.btnP14);
        btnP[14] = (Button) findViewById(R.id.btnP15);
        btnP[15] = (Button) findViewById(R.id.btnP16);
        btnP[16] = (Button) findViewById(R.id.btnP17);
        btnP[17] = (Button) findViewById(R.id.btnP18);
        btnP[18] = (Button) findViewById(R.id.btnP19);
        btnP[19] = (Button) findViewById(R.id.btnP20);
        btnP[20] = (Button) findViewById(R.id.btnP21);
        btnP[21] = (Button) findViewById(R.id.btnP22);
        btnP[22] = (Button) findViewById(R.id.btnP23);
        btnP[23] = (Button) findViewById(R.id.btnP24);
        btnP[24] = (Button) findViewById(R.id.btnP25);
        btnP[25] = (Button) findViewById(R.id.btnP26);
        btnP[26] = (Button) findViewById(R.id.btnP27);
        btnP[27] = (Button) findViewById(R.id.btnP28);
        btnP[28] = (Button) findViewById(R.id.btnP29);
        btnP[29] = (Button) findViewById(R.id.btnP30);
        btnP[30] = (Button) findViewById(R.id.btnP31);
        btnP[31] = (Button) findViewById(R.id.btnP32);
        btnP[32] = (Button) findViewById(R.id.btnP33);
        btnP[33] = (Button) findViewById(R.id.btnP34);
        btnP[34] = (Button) findViewById(R.id.btnP35);
        btnP[35] = (Button) findViewById(R.id.btnP36);
        btnP[36] = (Button) findViewById(R.id.btnP37);
        btnP[37] = (Button) findViewById(R.id.btnP38);
        btnP[38] = (Button) findViewById(R.id.btnP39);
        btnP[39] = (Button) findViewById(R.id.btnP40);
        btnP[40] = (Button) findViewById(R.id.btnP41);
        btnP[41] = (Button) findViewById(R.id.btnP42);
        btnP[42] = (Button) findViewById(R.id.btnP43);
        btnP[43] = (Button) findViewById(R.id.btnP44);
        btnP[44] = (Button) findViewById(R.id.btnP45);
        btnP[45] = (Button) findViewById(R.id.btnP46);
        btnP[46] = (Button) findViewById(R.id.btnP47);
        btnP[47] = (Button) findViewById(R.id.btnP48);
        btnP[48] = (Button) findViewById(R.id.btnP49);
        btnP[49] = (Button) findViewById(R.id.btnP50);
        btnP[50] = (Button) findViewById(R.id.btnP51);
        btnP[51] = (Button) findViewById(R.id.btnP52);
        btnP[52] = (Button) findViewById(R.id.btnP53);
        btnP[53] = (Button) findViewById(R.id.btnP54);
        btnP[54] = (Button) findViewById(R.id.btnP55);
        btnP[55] = (Button) findViewById(R.id.btnP56);
        btnP[56] = (Button) findViewById(R.id.btnP57);
        btnP[57] = (Button) findViewById(R.id.btnP58);
        btnP[58] = (Button) findViewById(R.id.btnP59);
        btnP[59] = (Button) findViewById(R.id.btnP60);
        btnP[60] = (Button) findViewById(R.id.btnP61);
        btnP[61] = (Button) findViewById(R.id.btnP62);
        btnP[62] = (Button) findViewById(R.id.btnP63);
        btnP[63] = (Button) findViewById(R.id.btnP64);
        btnP[64] = (Button) findViewById(R.id.btnP65);
        btnP[65] = (Button) findViewById(R.id.btnP66);
        btnP[66] = (Button) findViewById(R.id.btnP67);
        btnP[67] = (Button) findViewById(R.id.btnP68);
        btnP[68] = (Button) findViewById(R.id.btnP69);
        btnP[69] = (Button) findViewById(R.id.btnP70);
        for(int i=0;i<70;i++) {
            final int j = i+1;
            btnP[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    // startActivity(new Intent(PrasasakiyeActivity.this, PrasasakiyaSubActivity.class));

                    DatabaseHelper myDbHelper = new DatabaseHelper(PrasasakiyeActivity.this);
                    try {
                        myDbHelper.createDataBase();
                    } catch (IOException ioe) {
                        throw new Error("Unable to create database");
                    }
                    try {
                        myDbHelper.openDataBase();
                    } catch (SQLException sqle) {
                        throw sqle;
                    }
                    //Toast.makeText(PrasasakiyeActivity.this, "Success", Toast.LENGTH_SHORT).show();

                    selection = "prasasakiyeID='" + j +"'";

                    c = myDbHelper.query("tblPrasasakiye", columns, selection, null, null, null, null);
                    if (c.moveToFirst()) {
                        do {


                                Intent intent = new Intent(PrasasakiyeActivity.this,PrasasakiyeDetails.class);

                                intent.putExtra("db_title",unescape(c.getString(0)));
                                intent.putExtra("db_reqDocuments",unescape(c.getString(1)));
                                intent.putExtra("db_procForFacility",unescape(c.getString(2)));
                                intent.putExtra("db_respOfficer",unescape(c.getString(3)));
                                intent.putExtra("db_time",unescape(c.getString(4)));
                                startActivity(intent);


                            /*Toast.makeText(PrasasakiyeActivity.this,

                                    "title: " + c.getString(0) + "\n" +
                                            "reqDocuments: " + c.getString(1) + "\n" +
                                            "procForFacility: " + c.getString(2) + "\n" +
                                            "respOfficer: " + c.getString(3) + "\n" +
                                            "time:  " + c.getString(4),
                                    Toast.LENGTH_LONG).show();*/
                        } while (c.moveToNext());
                    }
                }
            });
        }

      /*  btnPra2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(PrasasakiyeActivity.this, PrasasakiyaSubActivity.class));
            }
        });*/




    }
    /*public void DataPrasasakiye2() {
        String title = btnPra1.getText().toString();
        new BackgroundWorkerPrasasaniye().execute(title);
    }
    //Insert details
    public class BackgroundWorkerPrasasaniye extends AsyncTask<String,Void,String> {

        String json_url;
        String JSON_STRING;
        @Override
        protected String doInBackground(String... params) {



            try {
                String title = params[0];

                URL url = new URL(json_url);
                HttpURLConnection httpURLConnection = (HttpURLConnection)url.openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setDoInput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
                String post_data = URLEncoder.encode("Title","UTF-8")+"="+URLEncoder.encode(title,"UTF-8");
                bufferedWriter.write(post_data);
                bufferedWriter.flush();
                bufferedWriter.close();
                outputStream.close();
                InputStream inputStream = httpURLConnection.getInputStream();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream,"iso-8859-1"));

                StringBuilder stringBuilder = new StringBuilder();

                while((JSON_STRING = bufferedReader.readLine())!= null) {
                    stringBuilder.append(JSON_STRING+"\n");
                }
                bufferedReader.close();
                inputStream.close();
                httpURLConnection.disconnect();
                return stringBuilder.toString().trim();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return null;
        }

        @Override
        protected void onPreExecute() {
            json_url = "http://192.168.123.6/webdb/prasasakiya.php";
        }

        @Override
        protected void onPostExecute(String result) {
            //TextView textView = (TextView) findViewById(R.id.txtKagajat);
            //textView.setText(result);
            Button btnP33 = (Button) findViewById(R.id.btnP3);
            btnP33.setText(result);
            json_string = result;
            if(json_string==null)
            {
                Toast.makeText(getApplicationContext(),"First Get JSON",Toast.LENGTH_LONG).show();
            }
            else
            {
                Intent intent = new Intent(PrasasakiyeActivity.this,PrasasakiyaSubActivity.class);

                intent.putExtra("json_data",json_string);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                startActivity(intent);
            }
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }
    }
*/
    private String unescape(String s) {
        return s.replaceAll("\\\\n", "\\\n").replaceAll("\\\\t", "\\\t");
    }
}
