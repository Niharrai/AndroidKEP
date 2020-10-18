package com.example.kep_as;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private List<DataClass> list;
    RecyclerViewAdapter(List<DataClass> myList){
        list = myList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_view_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DataClass data = list.get(position);
        holder.nameTV.setText(data.name);
        holder.mobTv.setText(data.mob);
        holder.imageView.setBackgroundResource(data.img_name);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        TextView nameTV;
        TextView mobTv;
        ImageView imageView;
        ViewHolder(View view){
            super(view);
            nameTV = view.findViewById(R.id.nameTV);
            mobTv = view.findViewById(R.id.mobTV);
            imageView = view.findViewById(R.id.imageView);
        }

    }
}
