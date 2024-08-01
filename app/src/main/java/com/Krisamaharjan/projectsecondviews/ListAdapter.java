package com.Krisamaharjan.projectsecondviews;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ListAdapter extends AppCompatActivity {
    ListView listView;
    ArrayList<String> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lisviewlayout);
        ListView listView = findViewById(R.id.listview);
        ArrayList<String> dataList = getIntent().getStringArrayListExtra("dataList");
        CustomAdapter adapter = new CustomAdapter(this, dataList);
        listView.setAdapter(adapter);
    }
}

