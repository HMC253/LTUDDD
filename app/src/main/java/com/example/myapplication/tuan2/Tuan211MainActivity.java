package com.example.myapplication.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;

public class Tuan211MainActivity extends AppCompatActivity {
    EditText txt1, txt2;

    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan211_main);
//khi an button
        txt1=findViewById(R.id.Tuan211txt1);
        txt2=findViewById(R.id.Tuan211txt2);
        btn1=findViewById(R.id.Tuan211btb1);
        //Dinh huong di chuyen
        btn1.setOnClickListener(v -> {
            Intent i=new Intent(Tuan211MainActivity.this,Tuan211secondActivity.class);
            //dua du lieu vao
            i.putExtra("so1",txt1.getText().toString());
            i.putExtra("so2",txt2.getText().toString());
            //khoi hanh
            startActivity(i);
        });

    }
}