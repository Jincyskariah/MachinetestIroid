package com.example.machinetestiroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.machinetestiroid.model.Categories;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewholder> {
Categories categories;
Context context;

    public Adapter(Categories categories, Context context) {
        this.categories = categories;
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.itemlist,parent,false);
        return new MyViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int position) {
        holder.name.setText(categories.getCategories().get(position).getName());
        Glide.with(context).load(categories.getCategories().get(position).getImage()).into(holder.image);

    }

    @Override
    public int getItemCount() {
        return categories.getCategories().size();
    }

    class MyViewholder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView name;
        public MyViewholder(@NonNull View itemView) {
            super(itemView);
            image=itemView.findViewById(R.id.categories_image);
            name=itemView.findViewById(R.id.categories_name);

        }
    }
}
