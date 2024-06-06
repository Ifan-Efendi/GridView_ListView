package com.example.latihangridview_listview;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ArrayAdapter;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        // Data to be displayed in GridView
        String[] items = {
                "Item 1", "Item 2", "Item 3", "Item 4", "Item 5",
                "Item 6", "Item 7", "Item 8", "Item 9", "Item 10",
                "Item 11", "Item 12", "Item 13", "Item 14", "Item 15"
        };

        // Adapter to bind data to GridView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, items);

        gridView.setAdapter(adapter);
    }
}