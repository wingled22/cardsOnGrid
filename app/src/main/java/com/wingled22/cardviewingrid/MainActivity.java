package com.wingled22.cardviewingrid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ProductAdapter.OnItemListener {

    RecyclerView recyclerView;

    public static ArrayList<Product> productArrayList = new ArrayList<Product>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        populateArrayList();



        ProductAdapter adapter  = new ProductAdapter(productArrayList, this);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(getApplicationContext(),3);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    //populate the arraylist of prod
    private void populateArrayList(){
        Product a = new Product(1, "Prod 1", "the quick brown fox the lazy dog");
        productArrayList.add(a);
        Product b = new Product(2, "Prod 2", "the quick brown fox the lazy dog");
        productArrayList.add(b);
        Product c = new Product(3, "Prod 3", "the quick brown fox the lazy dog");
        productArrayList.add(c);
        Product d = new Product(4, "Prod 4", "the quick brown fox the lazy dog");
        productArrayList.add(d);
        Product e = new Product(5, "Prod 5", "the quick brown fox the lazy dog");
        productArrayList.add(e);
        Product f = new Product(6, "Prod 6", "the quick brown fox the lazy dog");
        productArrayList.add(f);
        Product h = new Product(7, "Prod 7", "the quick brown fox the lazy dog");
        productArrayList.add(h);

    }

    @Override
    public void onItemClick(int position) {
        Intent detailIntent = new Intent(this, ProductDetailActivity.class);
        detailIntent.putExtra("position", position);
        startActivity(detailIntent);
    }
}