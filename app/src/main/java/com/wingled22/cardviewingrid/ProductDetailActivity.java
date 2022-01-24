package com.wingled22.cardviewingrid;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class ProductDetailActivity extends AppCompatActivity {
    private TextView prodName;
    private TextView prodDesc;

    private Product selectedProd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_detail);

        setupViews();
        getProductDetail();
    }

    private void setupViews() {
        prodName = (TextView) findViewById(R.id.prodName);
        prodDesc = (TextView) findViewById(R.id.prodDesc);
    }

    private void getProductDetail() {
        Intent previousIntent = getIntent();
        int position = previousIntent.getIntExtra("position", 0);
        selectedProd =  MainActivity.productArrayList.get(position);

        prodName.setText(selectedProd.getName());
        prodDesc.setText(selectedProd.getDescription());
    }


}
