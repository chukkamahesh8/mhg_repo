package com.classicsmart.myhomegrocers.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.models.wishlist.WishListData;

import java.util.List;

public class WishlistAdapter extends RecyclerView.Adapter<WishlistAdapter.MyViewHolder> {
    private List<WishListData> wishListData;
    private Context mcontext;
    private static int counter = 0;
    private String _stringVal;
    private final WishListClickListener wishListClickListener;


    public WishlistAdapter(Context context, List<WishListData> wishListData, WishListClickListener wishListClickListener) {
        this.wishListData = wishListData;
        this.mcontext = context;
        this.wishListClickListener = wishListClickListener;
    }


    public interface WishListClickListener {
        void wishListDeleteClick(View view, WishListData product);
        void wishListAddCartClick(View view, WishListData product);
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_wishlist, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        WishListData wishListDataList = wishListData.get(position);
        holder.tv_productName.setText(wishListDataList.getName());
        // holder.tv_productCount.setText(wishListDataList.get());
        holder.productPrice.setText(wishListDataList.getPrice());
        Glide.with(mcontext)
                .load(wishListDataList.getThumb())
                .circleCrop()
                .placeholder(R.drawable.ic__active_bell)
                .into(holder.img_product);


    }

    @Override
    public int getItemCount() {
        return wishListData.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder  {
        public TextView tv_productName, productPrice;
        public ImageView img_product, deleteItem, shareItem;
        public TextView tv_plus, tv_minus, tv_productCount,tvAddCart;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_productName = itemView.findViewById(R.id.tv_productname);
            productPrice = itemView.findViewById(R.id.productprice);
            img_product = itemView.findViewById(R.id.productimg);
            deleteItem = itemView.findViewById(R.id.wishlistproductdelete);
            shareItem = itemView.findViewById(R.id.whishlistproductshare);
            tv_plus = itemView.findViewById(R.id.tv_plus);
            tv_minus = itemView.findViewById(R.id.tvminus);
            tv_minus = itemView.findViewById(R.id.txt_addto_cart);
            tvAddCart = itemView.findViewById(R.id.txt_addto_cart);
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

                    if (counter < 1) {
                        tv_productCount.setText("1");
                    }
                }
            });

            deleteItem.setOnClickListener(v -> {
                wishListClickListener.wishListDeleteClick(v, wishListData.get(getAdapterPosition()));

            });
            tvAddCart.setOnClickListener(v -> {
                wishListClickListener.wishListAddCartClick(v, wishListData.get(getAdapterPosition()));

            });


        }

    }
}
