package com.example.kshrd.loginform;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
EditText txtemail;
    EditText txtpassword;
    Button btnlogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnlogin= (Button) findViewById(R.id.btnlogin);
        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtemail= (EditText) findViewById(R.id.txtemail);
                txtpassword= (EditText) findViewById(R.id.txtpassword);
               if(txtpassword.getText().toString().equals("123")&&(txtemail.getText().toString().equals("lyratha@yahoo.com"))){
                    Intent intent=new Intent(MainActivity.this,App.class);
                   startActivity(intent);
                }else {
                   Toast.makeText(MainActivity.this,"Incorrect User and password",Toast.LENGTH_LONG).show();
               }

               //Log.e("xxxx",txtemail.getText().toString());
            }
        });
    }

}
