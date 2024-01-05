package com.example.myapplication.tuan2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication.R;

public class Tuan22MainActivity extends AppCompatActivity {
    ListView ls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan22_main);

        lv=findViewById(R.id.Tuan22listview);

    }
} 