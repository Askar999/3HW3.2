package com.example.a3hw32;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private ArrayList<String> personages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadData();
        recyclerView = findViewById(R.id.resycly);
        PersonageAdapter adapter = new PersonageAdapter(personages);
        recyclerView.setAdapter(adapter);
    }
    private void loadData(){
        personages = new ArrayList<>();
        personages.add("personage-n");
        personages.add("personage-n");
        personages.add("personage-n");
        personages.add("personage-n");
        personages.add("personage-n");
        personages.add("personage-n");
        personages.add("personage-n");
        personages.add("personage-n");
        personages.add("personage-n");
        personages.add("personage-n");
        personages.add("personage-n");
        personages.add("personage-n");
        personages.add("personage-n");
        personages.add("personage-n");
        personages.add("personage-n");
    }
}