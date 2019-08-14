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

    public void displayCurrentDate() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MMM dd, YYYY");
        Date currentDate = calendar.getTime();
        String currentDateFormatted = simpleDateFormat.format(currentDate).toString();
        Toast.makeText(mContext, currentDateFormatted, Toast.LENGTH_SHORT).show();
    }
}
