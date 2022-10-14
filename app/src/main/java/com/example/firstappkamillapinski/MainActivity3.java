package com.example.firstappkamillapinski;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class MainActivity3 extends AppCompatActivity {
    private Button btnFirstPage;
    @SuppressLint("MissingInflatedId")


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Bundle extras = getIntent().getExtras();
        if(extras!=null) {
            TextView timest = findViewById(R.id.textView13);
            timest.setText(extras.getString("timestamp") + " - onCreate()");

        }








        btnFirstPage = findViewById(R.id.button);
        btnFirstPage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity3.this, MainActivity.class));
            }

        });
        onPause();
        onStop();

        onResume();

    }


    protected void onStop() {
        super.onStop();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String ts  = dateFormat.format(new Date().getTime());
        TextView  onstop =  findViewById(R.id.textView7);
        onstop.setText(ts + " - onStop()");
    }

    protected void onResume() {
        super.onResume();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String ts  = dateFormat.format(new Date().getTime());
        TextView  onresume =  findViewById(R.id.textView8);
        onresume.setText(ts + " - onResume()");
    }



    protected void onPause() {
        super.onPause();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String ts  = dateFormat.format(new Date().getTime());
        TextView  onpause =  findViewById(R.id.textView10);
        onpause.setText(ts + " - onPause()");
    }
}