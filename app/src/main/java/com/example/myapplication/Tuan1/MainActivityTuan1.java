package com.example.myapplication.Tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

public class MainActivityTuan1 extends AppCompatActivity {
    //Khai bao cac control
    EditText txt1, txt2;

    Button btn1;

    TextView tv1;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tuan1);
        //anh xa cac control
        txt1=findViewById(R.id.demo11txt1);
        txt2=findViewById(R.id.demo11txt2);
        btn1=findViewById(R.id.demo11btn1);
        tv1=findViewById(R.id.demo11tv1);
        //xu lu su kien
        btn1.setOnClickListener(v->{
            //Goi ham tinh tong
            tinhTong();
        });

    }
//dinh nghia ham tinhTong
    private void tinhTong() {
        //Lay du lieu tu EditText1
        String str1=txt1.getText().toString();
        float So1=Float.parseFloat(str1); // chuyen du lieu sang so
        //Lay du lieu tu EditText2
        String str2=txt2.getText().toString();
        float So2=Float.parseFloat(str2); //chuyen du lieu sang so
        //Tinh tong
        Float tong=So1+So2;
        //in ket qua
        tv1.setText(String.valueOf(tong));
    }
}