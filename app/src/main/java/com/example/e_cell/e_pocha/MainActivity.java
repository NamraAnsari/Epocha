package com.example.e_cell.e_pocha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {

    ImageButton leftArrow;
    ImageButton rightArrow;
    ImageButton upArrow;
    ImageButton downArrow;
    Button mop;
    Button pump;
    Button roller_up;
    Button roller_down;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        leftArrow = findViewById(R.id.left);
        rightArrow = findViewById(R.id.right);
        upArrow = findViewById(R.id.up);
        downArrow = findViewById(R.id.down);
        mop = findViewById(R.id.mop);
        pump = findViewById(R.id.pump);
        roller_up = findViewById(R.id.roller_up);
        roller_down = findViewById(R.id.roller_down);

    }
}
