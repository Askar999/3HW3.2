package com.example.a3hw32;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PersonageAdapter extends RecyclerView.Adapter<PersonageViewHolder> {

    private ArrayList<String> data;

    public PersonageAdapter(ArrayList<String> data){
        this.data = data;
    }

    @NonNull
    @Override
    public PersonageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PersonageViewHolder(LayoutInflater.from
                (parent.getContext()).inflate(R.layout.item_personage, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PersonageViewHolder holder, int position) {
    holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
