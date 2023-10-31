package com.example.arrayadapterdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class ArrayAdapterDemo extends AppCompatActivity {

    private ListView sports_category_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_array_adapter_demo);

        sports_category_list = (ListView)findViewById(R.id.category_lv);
        final String[] news_list = getResources().getStringArray(R.array.sports_category);
        /**在下方补充代码，为ListView设置适配器***/
        ArrayAdapter adapter=new ArrayAdapter(
                this,
                android.R.layout.simple_expandable_list_item_1,
                news_list
        );
        sports_category_list.setAdapter(adapter);
        /*****/
        sports_category_list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /**在下方补充代码，为ListView设置点击条目的事件监听器***/
                String msg=news_list[position];
                Toast.makeText(ArrayAdapterDemo.this,msg,Toast.LENGTH_SHORT).show();
                /*****/
            }
        });
    }
}
