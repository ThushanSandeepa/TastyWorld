package com.example.tasty_world;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Food_List extends AppCompatActivity {

//    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food__list);

//        btn1 = findViewById(R.id.buttonBuy);
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent( Food_List.this,addToCart.class);
//                startActivity(intent);
//            }
//        });
//    }
}