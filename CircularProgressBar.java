package com.hossain.zakaria.firebasephotoapp.utils;

import android.content.Context;
import androidx.appcompat.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;

import com.hossain.zakaria.firebasephotoapp.R;

public class CircularProgressBar {

    private Context context;
    private AlertDialog alertDialog;

    public CircularProgressBar(Context context) {
        this.context = context;
    }

    public AlertDialog setCircularProgressBar() {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if (inflater != null) {
            View view = inflater.inflate(R.layout.progress_bar_circular, null);
            builder.setView(view);
            builder.setCancelable(false);
            alertDialog = builder.create();
            alertDialog.show();
        }

        return alertDialog;
    }
}
