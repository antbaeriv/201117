package com.example.uno.a201117;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText uri;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicializarUI();
    }

    public void inicializarUI(){
        uri = findViewById(R.id.txtURL);
    }


    public void ejecutaURL(View v){
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
        intent.setData(Uri.parse(uri.getText().toString()));
        startActivity(intent);
    }


}