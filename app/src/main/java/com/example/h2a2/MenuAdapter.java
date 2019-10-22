package com.example.h2a2;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {

    private ArrayList<Menu> menuToAdapt;

    public void setData(ArrayList<Menu> menuToAdapt) {
        this.menuToAdapt = menuToAdapt;
    }

    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.menu, parent, false);

        MenuViewHolder menuViewHolder = new MenuViewHolder(view);
        return menuViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder holder, int position) {

        final Menu menuAtPosition = menuToAdapt.get(position);

        holder.menuTextView.setText(menuAtPosition.getFname());
        holder.priceTextView.setText("$" + menuAtPosition.getPrice());
        holder.descriptionTextView.setText(menuAtPosition.getDescription());


        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, MenuDetailActivity.class);
                intent.putExtra("MenuID", menuAtPosition.getMenuId());
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return menuToAdapt.size();
    }

    public static class MenuViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView menuTextView;
        public TextView priceTextView;
        public TextView descriptionTextView;

        public MenuViewHolder(View v) {
            super(v);
            view = v;
            menuTextView = v.findViewById(R.id.name);
            priceTextView = v.findViewById(R.id.price);
            descriptionTextView = v.findViewById(R.id.description);
        }
    }
}
