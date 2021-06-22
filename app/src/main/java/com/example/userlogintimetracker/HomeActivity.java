package com.example.userlogintimetracker;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class HomeActivity extends AppCompatActivity {
    DBHelper DB;
    TextView lastlogtimetext;
    EditText username;
    Button logtime;
    String C;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        logtime = (Button) findViewById(R.id.logtime_button);
        lastlogtimetext = findViewById(R.id.logtimetext);
        username = findViewById(R.id.username);
        DB = new DBHelper(this);



    logtime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View view){
                String user = username.getText().toString();
               C = DB.checklogintime(user);

            lastlogtimetext.setText(C);
        }
        });
    }
}