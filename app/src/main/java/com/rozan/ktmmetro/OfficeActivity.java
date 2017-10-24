package com.rozan.ktmmetro;

import android.os.Bundle;
import android.app.Activity;
import android.webkit.WebView;
import android.widget.TextView;

public class OfficeActivity extends Activity {
    WebView mWebView;
    String title, htmlUrl;
    TextView txtTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_office);
        txtTitle= (TextView) findViewById(R.id.txtTitle);
        htmlUrl = getIntent().getExtras().getString("htmlUrl");
        title = getIntent().getExtras().getString("title");
        txtTitle.setText(title);

        mWebView = (WebView) findViewById(R.id.karyalaye_webview);






        mWebView.getSettings().setBuiltInZoomControls(true);
        //mWebView.getSettings().setDisplayZoomControls(false);
        mWebView.getSettings().setLoadWithOverviewMode(true);
        //mWebView.getSettings().setUseWideViewPort(true);
        // mWebView.loadUrl("file:///android_asset/karSukla.html");
        //mWebView.loadUrl("http://nareshmdr.com.np/Rojan/karSukla.html");
        mWebView.loadUrl(htmlUrl);
    }
}
