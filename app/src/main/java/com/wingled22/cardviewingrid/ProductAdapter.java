package com.wingled22.cardviewingrid;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
                            //use this recyclerciew.adapter
                            //and implement methods
public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder>{



    //create a constructor
    private ArrayList<Product> productArrayList;

    public ProductAdapter(ArrayList<Product> products){
        this.productArrayList = products;
    }




    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.product_card, parent, false);

        return new ViewHolder(view);
    }

    //this will populate the cell
    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        //viewHolder.recycleImage.setImageResource(productArrayList.get(i).getImage());
        viewHolder.prodName.setText(productArrayList.get(i).getName());
        viewHolder.prodDesc.setText(productArrayList.get(i).getDescription());
    }

    @Override
    public int getItemCount() {
        return productArrayList.size();
    }


    //2: create a view holder
    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView prodName;
        private TextView prodDesc;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            prodName = (TextView) itemView.findViewById(R.id.prodName);
            prodDesc = (TextView) itemView.findViewById(R.id.prodDesc);
        }


    }


}
