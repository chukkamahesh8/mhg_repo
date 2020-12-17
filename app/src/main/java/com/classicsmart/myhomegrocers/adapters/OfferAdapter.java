package com.classicsmart.myhomegrocers.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.activities.OffersPojo;

import java.util.List;

public class OfferAdapter extends RecyclerView.Adapter<OfferAdapter.MyViewHolder>{
    private List<OffersPojo>offersPojoList;
    public OfferAdapter(List<OffersPojo> offersPojoList) {

        this.offersPojoList=offersPojoList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_offer,parent,false);
        return new MyViewHolder(view);
    }

    @NonNull
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        OffersPojo offersPojo=offersPojoList.get(position);
        holder.title.setText(offersPojo.getTitle());
        holder.description.setText(offersPojo.getDescription());
        holder.time.setText(offersPojo.getTime());
    }


    @Override
    public int getItemCount() {
        return offersPojoList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView title,description,time;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.offertitle);
            description=itemView.findViewById(R.id.offerDescription);
            time=itemView.findViewById(R.id.offertime);
        }
    }
}
