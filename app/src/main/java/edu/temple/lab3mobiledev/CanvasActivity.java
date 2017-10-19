package edu.temple.lab3mobiledev;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static android.graphics.Color.parseColor;

public class CanvasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canvas);

        Intent intent = getIntent();
        String selectedColor = intent.getExtras().getString("theColor");

        View currentLayout = (View) findViewById(R.id.myScreen);
        currentLayout.setBackgroundColor(parseColor(selectedColor));



    }
}
