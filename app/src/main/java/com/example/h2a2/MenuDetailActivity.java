package com.example.h2a2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MenuDetailActivity extends AppCompatActivity {

    private TextView dmenuTextView;
    private TextView dpriceTextView;
    private TextView ddescriptionTextView;
    private TextView aquantity;
    private TextView dcost;
    private TextView test;
    int quantity = 0;
    double total = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_detail);

        Intent intent = getIntent();

        int menuID = intent.getIntExtra("MenuID", 0);

        Menu menu = FakeDatabase.getMenuById(menuID);

        dmenuTextView = findViewById(R.id.detailmenuname);
        dpriceTextView = findViewById(R.id.detailprice);
        ddescriptionTextView = findViewById(R.id.detaildescription);

        dmenuTextView.setText(menu.getFname());
        dpriceTextView.setText("$" + menu.getPrice());
        ddescriptionTextView.setText(menu.getDescription());

    }

    public void onadd(View view){
        quantity += 1;
        aquantity = findViewById(R.id.quantityv);
        aquantity.setText(String.valueOf(quantity));
        Intent intent = getIntent();
        int menuID = intent.getIntExtra("MenuID", 0);
        Menu menu = FakeDatabase.getMenuById(menuID);
        total = quantity * Integer.parseInt(menu.getPrice());
        dcost = findViewById(R.id.totalv);
        dcost.setText(String.valueOf(total));
    }

    public void onless(View view){
        quantity -= 1;
        aquantity = findViewById(R.id.quantityv);
        aquantity.setText(String.valueOf(quantity));
        Intent intent = getIntent();
        int menuID = intent.getIntExtra("MenuID", 0);
        Menu menu = FakeDatabase.getMenuById(menuID);
        total = quantity * Integer.parseInt(menu.getPrice());
        dcost = findViewById(R.id.totalv);
        dcost.setText(String.valueOf(total));
    }

}
