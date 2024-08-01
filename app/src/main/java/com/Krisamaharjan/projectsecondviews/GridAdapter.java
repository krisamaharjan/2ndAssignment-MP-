package com.Krisamaharjan.projectsecondviews;

import android.os.Bundle;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class GridAdapter extends AppCompatActivity {
    GridView gridView;
    ArrayList<String> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridviewlistlayout);

        GridView gridView = findViewById(R.id.gridView);
        ArrayList<String> dataList = getIntent().getStringArrayListExtra("dataList");
        CustomAdapter adapter = new CustomAdapter(this, dataList);
        gridView.setAdapter(adapter);
    }
}
