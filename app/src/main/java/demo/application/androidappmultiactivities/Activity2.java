package demo.application.androidappmultiactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;


public class Activity2 extends AppCompatActivity {

    WebView webcontrol;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        webcontrol = (WebView)findViewById(R.id.webcontrol);
        WebSettings ws = webcontrol.getSettings();
        ws.setJavaScriptEnabled(true);
        ws.setAllowContentAccess(true);
        ws.setAppCacheEnabled(true);
        ws.setDomStorageEnabled(true);
        ws.setUseWideViewPort(true);


        webcontrol.setWebViewClient(new WebViewClient() );
       // webcontrol.loadUrl("https://www.rbc.ru/");
        webcontrol.loadUrl("file:///android_asset/lesson2.html");

    }
}
