package com.example.tasty_world;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class addToCart extends AppCompatActivity {

//    Button btnCart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_to_cart);

//        btnCart = findViewById(R.id.btn_addToCart);
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//
//        btnCart.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(addToCart.this,Cart.class);
//                startActivity(intent);
//            }
//        });
//    }
}