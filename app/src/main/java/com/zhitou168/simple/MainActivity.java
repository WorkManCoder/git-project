package com.zhitou168.simple;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;

import com.zhitou168.simple.view.AnimListView;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AnimListView listView = (AnimListView) findViewById(R.id.lv_rotate);
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.activity_list_item, android.R.id.text1, Arrays.asList(new String[]{"text1",
                "text2", "text3", "text2", "text3", "text2", "text3", "text2", "text3", "text2", "text3", "text2", "text3", "text2", "text3", "text2",
                "text3","text2", "text3", "text2", "text3", "text2", "text3", "text2", "text3", "text2", "text3", "text2", "text3", "text2", "text3", "text2", "text3"})));
    }
}
