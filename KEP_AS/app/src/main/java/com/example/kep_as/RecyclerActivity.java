package com.example.kep_as;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    List<DataClass> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        list.add(new DataClass("Aniruddh","12345678",R.drawable.pic));
        list.add(new DataClass("Sujish","87654321",R.drawable.pic2));
        list.add(new DataClass("Nihar","11111111",R.drawable.pic3));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(list);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}