package com.Krisamaharjan.projectsecondviews;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button add_data,viewList,viewGrid, viewRecycle;
    EditText addName, addAge, addAddress, addOccupation;
    ArrayList<String> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        dataList = new ArrayList<>();
        addName = findViewById(R.id.txt_name);
        addAge = findViewById(R.id.txt_age);
        addAddress = findViewById(R.id.txt_address);
        addOccupation = findViewById(R.id.txt_occ);


        add_data = findViewById(R.id.add_data);
        viewList = findViewById(R.id.view_list);
        viewGrid = findViewById(R.id.view_grid);
        viewRecycle = findViewById(R.id.view_recycler);

        add_data.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = addName.getText().toString();
                String age = addAge.getText().toString();
                String occupation = addOccupation.getText().toString();
                String address = addAddress.getText().toString();

                String data = "Name: " + name + ", Age: " + age + ", Occupation: " + occupation + ", Address: " + address;
                dataList.add(data);
                clearForm();
            }
        });

        viewGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, GridAdapter.class);
                intent.putStringArrayListExtra("dataList", dataList);
                startActivity(intent);
            }
        });

        viewList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ListAdapter.class);
                intent.putStringArrayListExtra("dataList", dataList);
                startActivity(intent);
            }
        });

        viewRecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, RecyclerAdapter.class);
                intent.putStringArrayListExtra("dataList", dataList);
                startActivity(intent);

            }
        });


    }
    public void clearForm() {
        addName.setText("");
        addAge.setText("");
        addAddress.setText("");
        addOccupation.setText("");
    }
}