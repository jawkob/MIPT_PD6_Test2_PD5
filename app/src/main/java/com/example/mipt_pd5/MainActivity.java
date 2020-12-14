package com.example.mipt_pd5;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class MainActivity extends AppCompatActivity {

    TextView tvCovid;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.tvCovid = findViewById(R.id.textView);
    }

    public void onBtnDownloadClick(View view) {
        Log.i(Constants.INFO_FORMATTED,"onBtnDownloadClick() called");
        this.tvCovid.setText("Loading...");
        new DataLoader() {
            @Override
            public void onPostExecute(String result) {
                tvCovid.setText(Constants.ANNOUNCE_LT + result);
            }
        }.execute("covid");

    }
}
