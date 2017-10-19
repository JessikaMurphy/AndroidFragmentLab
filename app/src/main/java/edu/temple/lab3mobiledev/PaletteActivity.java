package edu.temple.lab3mobiledev;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.support.annotation.IdRes;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

import static android.graphics.Color.parseColor;

import static edu.temple.lab3mobiledev.R.id.myScreen;
import static edu.temple.lab3mobiledev.R.layout.activity_palette;

public class PaletteActivity extends AppCompatActivity implements PaletteFragment.onColorSelectListener {
   /* boolean userIsInteracting;
    @Override
    public void onUserInteraction() {
        super.onUserInteraction();
        userIsInteracting = true;

    }*/
   private String selectedColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_palette);

        /*Resources res = getResources();

        //String[] myArray = {"RED", "BLUE", "MAGENTA","WHITE", "CYAN","YELLOW","GREEN","BLACK","GRAY"};
        String[] myDisplayArray = res.getStringArray(R.array.my_color_display_array);
        String[] myParseArray = res.getStringArray(R.array.my_parse_array);
        GridView gridder = (GridView) findViewById(R.id.gridder);

        customSpinner spinner = new customSpinner(PaletteActivity.this, myDisplayArray, myParseArray);*/

        final PaletteFragment paletteFragment = new PaletteFragment();
        final CanvasFragment canvasFragment = new CanvasFragment();

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.frame_canvas, canvasFragment);
        ft.add(R.id.frame_palette, paletteFragment);
        ft.commit();




        /*gridder.setAdapter(spinner);
        final Intent intent = new Intent(this, CanvasActivity.class);




        gridder.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String selectedColor = adapterView.getItemAtPosition(i).toString();
                //View currentLayout = (View) findViewById(R.id.myScreen);
                //currentLayout.setBackgroundColor(parseColor(selectedColor));
                intent.putExtra("theColor", selectedColor);
                startActivity(intent);
            }
        })*/;


        }
        @Override
        public void onColorSelected(String selectedColor){
            View canvasLayout = (View)findViewById(R.id.frame_canvas);
            canvasLayout.setBackgroundColor(parseColor(selectedColor));

        }
}










