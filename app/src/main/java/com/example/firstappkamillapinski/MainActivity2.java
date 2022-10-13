package com.example.firstappkamillapinski;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity2 extends AppCompatActivity {
    private Button buttonBack;
    private Button buttonInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView loginTextView = findViewById(R.id.textView3);
        TextView passTextView = findViewById(R.id.textView4);
        TextView emailTextView = findViewById(R.id.textView5);
        TextView phoneTextView = findViewById(R.id.textView6);
        Bundle extras = getIntent().getExtras();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String ts  = dateFormat.format(new Date().getTime());
        if(extras!=null) {
            loginTextView.setText(extras.getString("login"));
            passTextView.setText(extras.getString("password"));
            emailTextView.setText(extras.getString("email"));
            phoneTextView.setText(extras.getString("phone"));
        }


        buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity2.this, MainActivity.class));
            }

        });

        buttonInfo = findViewById(R.id.button2);
        buttonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
                intent.putExtra("timestamp", ts);
                startActivity(intent);

            }

        });

    }


}