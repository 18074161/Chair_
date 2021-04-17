package com.example.thigk1_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnClickListener{
    RecyclerView rcv_chair;
    CustomAdapterChair adt;
    ArrayList<Chair> mChairs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rcv_chair = findViewById(R.id.rcv_chair);
        mChairs = new ArrayList<>();

        mChairs.add(new Chair(R.drawable.images1,10,"Chair",R.drawable.daucong));
        mChairs.add(new Chair(R.drawable.images2,20,"Chair1",R.drawable.daucong));
        mChairs.add(new Chair(R.drawable.images3,30,"Chair2",R.drawable.daucong));
        mChairs.add(new Chair(R.drawable.images4,40,"Chair3",R.drawable.daucong));
        adt=  new CustomAdapterChair(mChairs,this);

        rcv_chair.setAdapter(adt);
        rcv_chair.setHasFixedSize(true);
        rcv_chair.setLayoutManager(new GridLayoutManager(this,2));
    }

    @Override
    public void itemClick(Chair chair) {
        Intent  intent = new Intent(MainActivity.this,MainActivity2.class);
        intent.putExtra("key1",chair);
        startActivity(intent);
    }
}