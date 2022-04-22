package com.example.a3hw32;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PersonageViewHolder extends RecyclerView.ViewHolder {
    private TextView name;
    public PersonageViewHolder(@NonNull View itemView) {
        super(itemView);
        name=itemView.findViewById(R.id.name);
    }
    public void bind (String PersonageValue){
        name.setText(PersonageValue);
    }
}
