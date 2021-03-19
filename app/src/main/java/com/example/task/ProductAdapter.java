package com.example.task;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ViewHolder> {
    private List<HomeModel> products;
    private Context context;

    public ProductAdapter(List<HomeModel> products, Context context) {
        this.products = products;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View productView = inflater.inflate(R.layout.home_products_card, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(productView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        HomeModel product = products.get(position);

        // Set item views based on your views and data model
        holder.addressTextView.setText(product.getAddress());
        holder.nameTextView.setText(product.getName());
        holder.dateTextView.setText(product.getDate());
        holder.commentTextView.setText(product.getComments());
        holder.likeTextView.setText(product.getLikes());
        holder.addressTextView.setText(product.getAddress());
        holder.addressTextView.setText(product.getAddress());
        holder.addressTextView.setText(product.getAddress());


    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView nameTextView;
        public TextView addressTextView;
        public TextView dateTextView;
        public TextView likeTextView;
        public TextView commentTextView;
        public TextView descriptionTextView;
        public ImageView shareTextView;

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);

            nameTextView = (TextView) itemView.findViewById(R.id.text_view_name);
            descriptionTextView=itemView.findViewById(R.id.text_view_desc);
            commentTextView=itemView.findViewById(R.id.text_view_comment);
            likeTextView=itemView.findViewById(R.id.text_view_likes);
            dateTextView=itemView.findViewById(R.id.text_view_date);
            shareTextView=itemView.findViewById(R.id.share);
            addressTextView=itemView.findViewById(R.id.text_view_address);

        }
    }
}
