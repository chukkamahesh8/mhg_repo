package com.classicsmart.myhomegrocers.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.models.cart.Product;

import java.util.List;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.MyViewHolder> {
    private final List<Product> products;
    private final Context mcontext;
    private final CartItemClickListener cartItemClickListener;

    public CartAdapter(Context context, List<Product> products, CartItemClickListener cartItemClickListener) {
        this.products = products;
        this.mcontext = context;
        this.cartItemClickListener = cartItemClickListener;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_cart, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Product productList = products.get(position);
        holder.tvProductName.setText(productList.getName());
        holder.tvProductCount.setText(productList.getQuantity());
        holder.productPrice.setText(productList.getPrice());
        Glide.with(mcontext)
                .load(productList.getThumb())
                .circleCrop()
                .into(holder.imgProduct);

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public interface CartItemClickListener {
        void cartItemClick(View view, Product product);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private final RelativeLayout btnDelete;
        public TextView tvProductName, productPrice;
        public ImageView imgProduct;
        public TextView tvPlus, tvMinus, tvProductCount;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvProductName = itemView.findViewById(R.id.tv_productname);
            productPrice = itemView.findViewById(R.id.productprice);
            tvPlus = itemView.findViewById(R.id.tv_plus);
            tvMinus = itemView.findViewById(R.id.tvminus);
            tvProductCount = itemView.findViewById(R.id.tv_productcount);
            imgProduct = itemView.findViewById(R.id.productimg);
            btnDelete = itemView.findViewById(R.id.btn_rl_cart_delete);
            tvMinus.setOnClickListener(this);
            tvPlus.setOnClickListener(this);
            btnDelete.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            cartItemClickListener.cartItemClick(view, products.get(getAdapterPosition()));
        }
    }
}
