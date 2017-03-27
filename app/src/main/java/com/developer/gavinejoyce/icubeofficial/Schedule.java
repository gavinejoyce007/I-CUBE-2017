package com.developer.gavinejoyce.icubeofficial;

import android.app.ProgressDialog;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Schedule extends AppCompatActivity {


    private WebView webView;
    ProgressDialog progresspwi;
    String url="https://drive.google.com/open?id=1OzQESO_oIfoc-JF_Iy187onoHuNhW4NXXzcTF_a26zs";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

        webView = (WebView)findViewById(R.id.imageEnhance);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setBuiltInZoomControls(true);
        settings.setAppCacheEnabled(true);
        settings.setDisplayZoomControls(false);

        /*progresspwi = ProgressDialog.show(this, "Loading", "Please Wait...");
        webView.setWebViewClient(new myWebClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {

                view.loadUrl(url);
                return true;
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                if(progresspwi.isShowing()) {
                    progresspwi.dismiss();
                }

            }
        });

        webView.loadUrl(url);*/
        webView.loadDataWithBaseURL("file:///android_res/drawable/", "<style>img{display: inline; height: auto; max-width: 100%;}</style><img src='schedule.png' />", "text/html", "utf-8", null);

        //webView.loadUrl("https://drive.google.com/open?id=1OzQESO_oIfoc-JF_Iy187onoHuNhW4NXXzcTF_a26zs");
    }


}
