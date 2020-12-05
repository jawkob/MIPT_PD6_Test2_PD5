package com.example.mipt_pd5;

import android.os.AsyncTask;
import android.util.Log;

import java.io.PrintWriter;
import java.io.StringWriter;

public class DataLoader extends AsyncTask<String, Void, String> {

    protected String doInBackground(String... params) {
        Log.i(Constants.INFO_FORMATTED,"doInBackground() called");

        try {
            return Parser.parseData(DataRetriever.downloadUrl(Constants.STAT_DATA_URL));
            //
        } catch (Exception e) {
            StringWriter sw = new StringWriter();
            e.printStackTrace(new PrintWriter(sw));
            Log.e(Constants.INFO_FORMATTED, sw.toString());
            return "Error occured";
        }
    }
}

