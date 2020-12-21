package com.classicsmart.myhomegrocers.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.models.dashboard.PreviouslyOrderedProduct;

import java.util.List;

public class ProductsAdapter extends RecyclerView.Adapter<ProductsAdapter.MyViewHolder> {
    private List<PreviouslyOrderedProduct> previouslyOrderedProducts;
    private Context mContext;
    private ProductClickListener productClickListener;

    public ProductsAdapter(Context context, List<PreviouslyOrderedProduct> previouslyOrderedProducts, ProductClickListener productClickListener) {
        this.previouslyOrderedProducts = previouslyOrderedProducts;
        this.mContext = context;
        this.productClickListener = productClickListener;
    }

    public void setList(List<PreviouslyOrderedProduct> sourcesList) {
        this.previouslyOrderedProducts = sourcesList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_product, parent, false);
        return new MyViewHolder(view);
    }

    @NonNull
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        PreviouslyOrderedProduct item = previouslyOrderedProducts.get(position);
        holder.productName.setText(item.getName().replaceAll("/", ","));
        //  holder.quantity.setText(String.valueOf(item.getCartQuantity()));
        holder.price.setText("$ " + item.getPrice());
        holder.discount.setText(item.getDiscount() + "%");
        holder.rbProductRatting.setNumStars(Math.toIntExact(item.getRating()));
        Glide.with(mContext).load(item.getImage()).circleCrop()
                .placeholder(R.drawable.ic_fruits_vegetables).into(holder.img);
    }


    @Override
    public int getItemCount() {
        return previouslyOrderedProducts.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public TextView productName, discount, quantity, price;
        public ImageView img;
        public RatingBar rbProductRatting;
        public RelativeLayout btnShare, btnFave;
        public TextView tvAddToCart;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            productName = itemView.findViewById(R.id.txt_product_name);
            quantity = itemView.findViewById(R.id.txt_quantity);
            discount = itemView.findViewById(R.id.txt_discount);
            price = itemView.findViewById(R.id.txt_price);
            rbProductRatting = itemView.findViewById(R.id.rb_product_ratting);
            img = itemView.findViewById(R.id.im_product);
            btnShare = itemView.findViewById(R.id.btn_rl_share);
            btnFave = itemView.findViewById(R.id.btn_rl_fave);
            tvAddToCart = itemView.findViewById(R.id.txt_goto_cart);
            btnShare.setOnClickListener(this);
            btnFave.setOnClickListener(this);
            tvAddToCart.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            productClickListener.onProductItemClicked(view, previouslyOrderedProducts.get(getAdapterPosition()));
        }
    }

    public interface ProductClickListener {
        public void onProductItemClicked(View view, PreviouslyOrderedProduct item);
    }
}
