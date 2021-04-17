package com.example.thigk1_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
    RecyclerView rcv_bag;
    CustomAdapterBagggggggggg adt;
//    ArrayList<Chair> mChairs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        rcv_bag = findViewById(R.id.rcv_bag);
//        mChairs = new ArrayList<>();


        adt=  new CustomAdapterBagggggggggg(MainActivity2.mChairs);

        rcv_bag.setAdapter(adt);
        rcv_bag.setHasFixedSize(true);
        rcv_bag.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    }
}