package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class Adapter extends BaseAdapter {
    Context context;
    int layout;
    ArrayList<TT> arrtt;

    public Adapter(Context context, int layout, ArrayList<TT> tt) {
        this.context = context;
        this.layout = layout;
        this.arrtt = tt;
    }

    @Override
    public int getCount() {
        return arrtt.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    class Viewhodel {
        TextView tvHoTen;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Viewhodel hodel;
        if(convertView==null){
            hodel = new Viewhodel();
            LayoutInflater LI  = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            convertView  =LI.inflate(layout,null);
            hodel.tvHoTen = convertView.findViewById(R.id.tvhoten);
            convertView.setTag(hodel);
        }
        else {
            hodel = (Viewhodel) convertView.getTag();
        }
        TT tt1 = arrtt.get(position);
        hodel.tvHoTen.setText(tt1.getTt());
        return convertView;
    }

}
