package com.example.kush.weathercast;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by saini on 26-Jul-16.
 */
public class HourlyWRVAdapter extends RecyclerView.Adapter<HourlyWRVAdapter.OurHolder> {

    public class OurHolder extends RecyclerView.ViewHolder{

        TextView maxT;
        TextView minT;
        public OurHolder(View itemView) {
            super(itemView);
            maxT = (TextView) itemView.findViewById(R.id.max_temp);
            minT = (TextView) itemView.findViewById(R.id.min_temp);
        }
    }
    Context mContext;
    ArrayList<HourlyWF> batches;
    @Override
    public OurHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(OurHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
