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
    Button btn1;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        leftArrow = findViewById(R.id.left);
        rightArrow = findViewById(R.id.right);
        upArrow = findViewById(R.id.up);
        downArrow = findViewById(R.id.down);
        btn1 = findViewById(R.id.mop);
        btn2 = findViewById(R.id.btn);

    }
}
