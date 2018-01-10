package com.example.bhadur.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button btnLogin,btnCreate,btnGoogle;
    TextView textView2,tvForget;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      btnCreate =  findViewById(R.id.btnCreate);
      btnLogin = findViewById(R.id.btnLogin);
      btnGoogle=findViewById(R.id.btnGoogle);
      btnLogin.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              Intent go =new Intent(MainActivity.this,Main2Activity.class);
              startActivity(go);

          }
      });
    }
}
