package com.example.kush.weathercast;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by saini on 26-Jul-16.
 */
public class HourlyWVRAdapter extends RecyclerView.Adapter<HourlyWVRAdapter.OurHolder> {
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
    ArrayList<HourlyWF> data;

    public HourlyWVRAdapter(ArrayList<HourlyWF> data, Context mContext) {
        this.data = data;
        this.mContext = mContext;
    }

    @Override
    public OurHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext)
                .inflate(R.layout.daily_view,parent,false);
        return new OurHolder(v);
    }

    @Override
    public void onBindViewHolder(OurHolder holder, int position) {
        final HourlyWF h = data.get(position);
        holder.maxT.setText(h.getMaxTemp());
        holder.minT.setText(h.getMinTemp());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
