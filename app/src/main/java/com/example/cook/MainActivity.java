package com.example.cook;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button b1;
    EditText ed1,ed2;
    String username = "admin";
    String pass = "admin";
    TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        ed1 = (EditText)findViewById(R.id.ed1);
        ed2 = (EditText)findViewById(R.id.ed2);
        tv1 = (TextView)findViewById(R.id.tv1);
        b1 = (Button)findViewById(R.id.b1);






    }

    public void next(View view) {

        if (ed1.getText().toString().equals(username) &&  ed2.getText().toString().equals(pass)) {
            Intent i = new Intent(MainActivity.this,Activity2.class);
            startActivity(i);
            Toast.makeText(getApplicationContext(),"Login Sucessfull",Toast.LENGTH_SHORT).show();
        } else {
            tv1.setText("ERROR !");
        }
    }
//    public void nextActivity() {
//        Intent i = new Intent(MainActivity.this,Activity2.class);
//        startActivity(i);
//    }
}
