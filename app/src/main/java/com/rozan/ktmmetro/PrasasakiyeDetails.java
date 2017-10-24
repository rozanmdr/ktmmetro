package com.rozan.ktmmetro;

import android.os.Bundle;
import android.app.Activity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.github.aakira.expandablelayout.ExpandableRelativeLayout;

public class PrasasakiyeDetails extends Activity {
    ExpandableRelativeLayout expandableLayout1, expandableLayout2, expandableLayout3, expandableLayout4, expandableLayout5;
    /*  String json_string;
      JSONArray jsonArray;
      JSONObject jsonObject;*/
    String title,reqDocuments,procForFacility,respOfficer,time;
    TextView txtkaga, txtPrakri, txtJimme , txtSama,txtTitle;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prasasakiye_details);



        txtkaga = (TextView) findViewById(R.id.txtKagajat);
        txtPrakri = (TextView) findViewById(R.id.txtPrakriya);
        txtJimme = (TextView) findViewById(R.id.txtJimmewar);
        txtSama = (TextView) findViewById(R.id.txtSamaye);
        txtTitle= (TextView) findViewById(R.id.txtTitle);

        txtkaga.setSingleLine(false);
        txtPrakri.setSingleLine(false);
        txtJimme.setSingleLine(false);
        txtSama.setSingleLine(false);




        //"db_title" ,"db_reqDocuments","db_procForFacility","db_respOfficer","db_time"
        //String title,reqDocuments,procForFacility,respOfficer,time;
        title = getIntent().getExtras().getString("db_title");
        reqDocuments = getIntent().getExtras().getString("db_reqDocuments");
        procForFacility = getIntent().getExtras().getString("db_procForFacility");
        respOfficer = getIntent().getExtras().getString("db_respOfficer");
        time = getIntent().getExtras().getString("db_time");

        txtTitle.setText(title);
        txtkaga.setText(reqDocuments);
        txtPrakri.setText(procForFacility);
        txtJimme.setText(respOfficer);
        txtSama.setText(time);

            /*btn1.setText(reqDocuments);
            btn2.setText(procForFacility);
            btn3.setText(respOfficer);
            btn4.setText(time);*/


            /*try {
                jsonObject = new JSONObject(json_string);
                jsonArray = jsonObject.getJSONArray("server_response");
                int count = 0;
                String Kagajat, Prakriya, Jimmewar, Samaye;

                while(count<jsonArray.length())
                {
                    JSONObject JO = jsonArray.getJSONObject(0);
                    Kagajat=JO.getString("Kagajat");
                    Prakriya=JO.getString("Prakriya");
                    Jimmewar=JO.getString("Jimmewar");
                    Samaye=JO.getString("Samaye");

                    txtkaga.setText(Kagajat);
                    txtPrakri.setText(Prakriya);
                    txtJimme.setText(Jimmewar);
                    txtSama.setText(Samaye);

                    count++;
                }
            }
            catch(JSONException e){
                e.printStackTrace();
            }*/
    }

    public void expandableButton1(View view) {
        expandableLayout1 = (ExpandableRelativeLayout) findViewById(R.id.expandableLayout1);
        expandableLayout1.toggle(); // toggle expand and collapse
    }

    public void expandableButton2(View view) {
        expandableLayout2 = (ExpandableRelativeLayout) findViewById(R.id.expandableLayout2);
        expandableLayout2.toggle(); // toggle expand and collapse
    }

    public void expandableButton3(View view) {
        expandableLayout3 = (ExpandableRelativeLayout) findViewById(R.id.expandableLayout3);
        expandableLayout3.toggle(); // toggle expand and collapse
    }

    public void expandableButton4(View view) {
        expandableLayout4 = (ExpandableRelativeLayout) findViewById(R.id.expandableLayout4);
        expandableLayout4.toggle(); // toggle expand and collapse
    }
}
