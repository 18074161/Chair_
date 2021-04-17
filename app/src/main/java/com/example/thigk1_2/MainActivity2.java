package com.example.thigk1_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    ImageView imgChairDt;
    TextView tvPriceDt,tvNameDt,tvSoDt;
    ImageButton imgbtn_plusDt,imgbtn_minusDt;
    Chair mChair;
    Button btn_addtocart;
    static ArrayList<Chair> mChairs;
    static {
        mChairs = new ArrayList<>();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imgChairDt = findViewById(R.id.imgChairDt);
        btn_addtocart = findViewById(R.id.btn_addtocart);
        tvPriceDt = findViewById(R.id.tvPriceDt);
        tvNameDt = findViewById(R.id.tvNameDt);
        tvSoDt = findViewById(R.id.tvSoDt);
        imgbtn_plusDt = findViewById(R.id.imgbtn_plusDt);
        imgbtn_minusDt = findViewById(R.id.imgbtn_minusDt);
        Intent intent = getIntent();
        if (intent != null){
            mChair = (Chair) intent.getSerializableExtra("key1");
            tvNameDt.setText(mChair.getName());
            tvPriceDt.setText(mChair.getPrice()+"");
            imgChairDt.setImageResource(mChair.getAnh());
        }
        btn_addtocart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity2.this,MainActivity3.class);
                mChairs.add(mChair);
                startActivity(intent1);
            }
        });




    }
}