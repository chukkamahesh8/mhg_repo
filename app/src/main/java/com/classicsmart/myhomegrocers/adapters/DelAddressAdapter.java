package com.classicsmart.myhomegrocers.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.classicsmart.myhomegrocers.R;
import com.classicsmart.myhomegrocers.activities.DeliveryAddressPojo;
import com.classicsmart.myhomegrocers.models.address.Address;

import java.util.List;

public class DelAddressAdapter extends RecyclerView.Adapter<DelAddressAdapter.MyViewHolder> {
    private List<Address> deliveryAddressPojoList;
    private RadioButton lastCheckedRB;

    public DelAddressAdapter(List<Address> deliveryAddressPojoList) {
        this.deliveryAddressPojoList=deliveryAddressPojoList;

    }

    @NonNull
    @Override
    public DelAddressAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_address, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DelAddressAdapter.MyViewHolder holder, int position) {

        Address deliveryAddressPojo = deliveryAddressPojoList.get(position);
       // holder.radioButton.setText(deliveryAddressPojo.getAddressType());
        holder.name.setText(deliveryAddressPojo.getFirstname() + " " +deliveryAddressPojo.getLastname());
        holder.doorNumber.setText(deliveryAddressPojo.getAddress1());
        holder.area.setText(deliveryAddressPojo.getZone());
        holder.location.setText(deliveryAddressPojo.getAddress2());
        holder.city.setText(deliveryAddressPojo.getCity());
        holder.pincode.setText(deliveryAddressPojo.getPostcode());
      //  holder.phoneNumber.setText(deliveryAddressPojo.getPostcode());
        holder.radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()){
                    compoundButton.setChecked(true);
                }
                else {
                    compoundButton.setChecked(false);
                }
            }
        });

    }
    @Override
    public int getItemCount() {
        return deliveryAddressPojoList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
       public TextView name,doorNumber,area,location,city,pincode,phoneNumber;
       public RadioButton radioButton;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            radioButton=itemView.findViewById(R.id.homeradio);
            name=itemView.findViewById(R.id.txtName);
            doorNumber=itemView.findViewById(R.id.txtDoorNumber);
            area=itemView.findViewById(R.id.txtArea);
            location=itemView.findViewById(R.id.txtLocation);
            city=itemView.findViewById(R.id.txtCity);
            pincode=itemView.findViewById(R.id.txtPincode);
            phoneNumber=itemView.findViewById(R.id.txtPhoneNumber);
        }
    }
}
