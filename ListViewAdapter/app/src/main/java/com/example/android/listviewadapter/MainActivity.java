package com.example.android.listviewadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listView1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listview = (ListView)findViewById(R.id.listView1);
        final String[] months = {"January", "February", "March", "April", "May", "June",
                                  "July", "August", "September", "October", "November", "December"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, months);

        listView1.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                Toast.makeText(getApplicationContext(), months[position], Toast.LENGTH_SHORT).show();
            }
        }
        );

    }

}
