package com.classicsmart.myhomegrocers.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.models.cart.CartData;
import com.classicsmart.myhomegrocers.models.cart.GetCartResponse;
import com.classicsmart.myhomegrocers.models.cart.Product;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.MyViewHolder> {
    private List<Product>products;
    private Context mcontext;
    private static int counter = 0;
    private String _stringVal;

    public CartAdapter(Context context, List<Product> products) {
        this.products=products;
        this.mcontext=context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cart, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Product productList=products.get(position);
        holder.tv_productName.setText(productList.getName());
        holder.tv_productCount.setText(productList.getQuantity());
        holder.productPrice.setText(productList.getPrice());
        Glide.with(mcontext)
                .load(productList.getThumb())
                .circleCrop()
                .placeholder(R.drawable.ic__active_bell)
                .into(holder.img_product);

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView tv_productName,productPrice;
        public ImageView img_product;
        public TextView tv_plus,tv_minus,tv_productCount;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_productName=itemView.findViewById(R.id.tv_productname);
            productPrice=itemView.findViewById(R.id.productprice);
            tv_plus=itemView.findViewById(R.id.tv_plus);
            tv_minus=itemView.findViewById(R.id.tvminus);
            tv_productCount=itemView.findViewById(R.id.tv_productcount);
            img_product=itemView.findViewById(R.id.productimg);
            tv_plus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    counter++;
                    _stringVal = Integer.toString(counter);
                    tv_productCount.setText(_stringVal);
                }
            });
            tv_minus.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    counter--;
                    _stringVal = Integer.toString(counter);
                    tv_productCount.setText(_stringVal);

                    if (counter < 1)
                    {
                        tv_productCount.setText("1");
                    }
                }
            });
        }


    }
}
