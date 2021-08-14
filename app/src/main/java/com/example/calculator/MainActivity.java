package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    Button button0, button1;
    TextView textv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //map buttons
        button0 = findViewById(R.id.b0);
        button1 = findViewById(R.id.b1);
        //map result display
        textv1 = findViewById(R.id.display);

        // set button click listeners
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textv1.setText(textv1.getText() + "0");
            }
        });
    }
    }
