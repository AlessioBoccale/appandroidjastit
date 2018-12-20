package org.elis.jp4application;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class

FoodListAdapter  extends RecyclerView.Adapter{
    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder
            (@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView productName,productPrice,productQty;
        public Button addBtn,RemoveBtn;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);

            productName = itemView.findViewById(R.id.primorow);
        }

        public TextView getProductName() {
            return productName;
        }

        public TextView getProductPrice() {
            return productPrice;
        }

        public TextView getProductQty() {
            return productQty;
        }

        public void setProductName(TextView productName) {

            this.productName = productName;
        }

        public void setProductPrice(TextView productPrice) {
            this.productPrice = productPrice;
        }

        public void setProductQty(TextView productQty) {
            this.productQty = productQty;
        }

        @Override
        public void onClick(View v) {

        }
    }

}
