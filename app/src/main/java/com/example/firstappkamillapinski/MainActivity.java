package com.example.firstappkamillapinski;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button buttonFirst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonFirst = findViewById(R.id.registerBtn);
        buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                openSecondActivity();

            }

        });




    }

    public void openSecondActivity() {
        TextView loginText = findViewById(R.id.editTextTextPersonName);
        TextView passText = findViewById(R.id.editTextTextPassword);
        TextView emailText = findViewById(R.id.editTextTextEmailAddress);
        TextView phoneText = findViewById(R.id.editTextPhone);
        String loginTextEdited = loginText.getText().toString();
        String passTextEdited = passText.getText().toString();
        String emailTextEdited = emailText.getText().toString();
        String phoneTextEdited = phoneText.getText().toString();
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("login", loginTextEdited);
        intent.putExtra("password", passTextEdited);
        intent.putExtra("email", emailTextEdited);
        intent.putExtra("phone", phoneTextEdited);
        startActivity(intent);



    }


}