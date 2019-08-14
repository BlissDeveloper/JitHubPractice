package com.example.samplemodule;

import android.content.Context;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {
    private Context mContext;

    public DateUtil(Context context) {
        mContext = context;
    }

   public void toast() {
       Toast.makeText(mContext, "Hello world!", Toast.LENGTH_SHORT).show();
   }
}
