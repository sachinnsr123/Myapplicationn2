package com.example.myapplicationn1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class loginpage extends AppCompatActivity implements View.OnClickListener {
    //variable declaration
    Button login;
    EditText un, pn;
    TextView labeltext;
    String username = "admin";
    String password = "sachu ";
    int clickcount = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginpage);
        // ui and java connected
        login = (Button) findViewById(R.id.login);
        un = (EditText) findViewById(R.id.Username);
        pn = (EditText) findViewById(R.id.password1);
        labeltext = (TextView) findViewById(R.id.labeltext);



       /*2. login.setOnClickListener(new  View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),page3.class);
                startActivity(intent);
            }
        });
    }*/

   /* 1.public void login(View view) {
        Handler obj =new Handler();
        obj.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent =new Intent(getApplicationContext(),page3.class);
                startActivity(intent);
            }
        },2000);*/
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String uname = un.getText().toString();
        String pword = pn.getText().toString();
        if (username.equals(uname) && password.equals(pword)) {
            Intent i = new Intent(getApplicationContext(), page3.class);
            startActivity(i);
        } else {
            Toast.makeText(getApplicationContext(), "invalid username and password", Toast.LENGTH_LONG).show();
            clickcount--;
            if (clickcount == 0)
            {
                login.setEnabled(false);
                labeltext.setText("LOGIN INVALID");
                labeltext.setTextColor(Color.RED);
            }
        }

    }
}

