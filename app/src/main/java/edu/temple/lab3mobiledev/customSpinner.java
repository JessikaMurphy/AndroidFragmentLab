package edu.temple.lab3mobiledev;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import edu.temple.lab3mobiledev.R;

/**
 * Created by Shiloh on 9/28/2017.
 */

public class customSpinner extends BaseAdapter {
    Context context;
    String[] displayColors;
    String[] parseColors;


    public customSpinner (Context context, String[] displayColors, String[] parseColors  ){
        this.displayColors = displayColors;
        this.parseColors =parseColors;
        this.context = context;

    }

    @Override
    public int getCount() {
        return parseColors.length;
    }

    @Override
    public Object getItem(int i) {
        return parseColors[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override

    public View getView(int i, View view, ViewGroup viewGroup) {


        TextView names = new TextView(this.context);

        names.setText(displayColors[i]);
        names.setBackgroundColor(Color.parseColor(parseColors[i]));
        return names;
    }
}



