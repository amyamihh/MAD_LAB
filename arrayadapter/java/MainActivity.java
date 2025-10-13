package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String catlist []={"blackcat","greycat","orangecat","whitecat"};
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView) findViewById(R.id.list_view);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<>(this,R.layout.activity_main2,R.id.txt1,catlist);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {
                Log.i("ListView","Item is clicked @position" +position);
                if(position==0)
                {
                    startActivity(new Intent(MainActivity.this, blackcat.class));

                }
                else if(position==1)
                {
                    startActivity(new Intent(MainActivity.this, greycat.class));

                }
                else if(position==2)
                {
                    startActivity(new Intent(MainActivity.this, orangecat.class));

                }
                else if(position==3)
                {
                    startActivity(new Intent(MainActivity.this, whitecat.class));

                }

            }
        });
    }
}
