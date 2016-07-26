package com.example.kush.weathercast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView hourlyRecyclerView;
    ArrayList<HourlyWF> data;
    HourlyWVRAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hourlyRecyclerView = (RecyclerView) findViewById(R.id.hourly_recycler_view);
        data = new ArrayList<>();
        data.add(new HourlyWF("30","20"));
        data.add(new HourlyWF("30","20"));
        data.add(new HourlyWF("30","20"));
        data.add(new HourlyWF("30","20"));
        data.add(new HourlyWF("30","20"));
        data.add(new HourlyWF("30","20"));
        data.add(new HourlyWF("30","20"));
        data.add(new HourlyWF("30","20"));
        data.add(new HourlyWF("30","20"));
        data.add(new HourlyWF("30","20"));
        data.add(new HourlyWF("30","20"));
        data.add(new HourlyWF("30","20"));
        data.add(new HourlyWF("30","20"));
        adapter = new HourlyWVRAdapter(data,this);
        hourlyRecyclerView.setAdapter(adapter);

        LinearLayoutManager lm = new LinearLayoutManager(this);
        lm.setOrientation(LinearLayoutManager.HORIZONTAL);
        hourlyRecyclerView.setLayoutManager(lm);
//
//        ItemTouchHelper.SimpleCallback callback = new ItemTouchHelper.SimpleCallback(ItemTouchHelper.RIGHT)

    }
}