package com.example.task;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder>{


    private List<Bitmap> categories;
    private Context context;

    public CategoryAdapter(List<Bitmap> categories, Context context) {
        this.categories = categories;
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View categoryView = inflater.inflate(R.layout.category_card, parent, false);

        // Return a new holder instance
        CategoryAdapter.CategoryViewHolder viewHolder = new CategoryViewHolder(categoryView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        Bitmap bitmap = categories.get(position);
        holder.circleImageView.setImageBitmap(bitmap);
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }


    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public CircleImageView circleImageView;


        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public CategoryViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any CategoryViewHolder instance.
            super(itemView);

            circleImageView = (CircleImageView) itemView.findViewById(R.id.circle_image_view);


        }
    }
}





