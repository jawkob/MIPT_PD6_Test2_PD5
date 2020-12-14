package com.example.mipt_pd5;

import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Parser {

    public static String parseData(String source) {
        Log.i(Constants.INFO_FORMATTED,"parseData() called");

        String returnable = null;
        if (source != null)
        {
            final Pattern pattern = Pattern.compile(Constants.REGEX_SYNTAX, Pattern.MULTILINE);
            final Matcher matcher = pattern.matcher(source);
            while (matcher.find())
            {
                for (int i = 1; i <= matcher.groupCount(); i++)
                {
                    returnable = matcher.group(i);
                }
            }
            return returnable;
        }
        else {
              return returnable;
        }
    }
}