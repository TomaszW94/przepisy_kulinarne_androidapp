/*package com.przepisyKulinarne;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;



public class CustomAdapter extends BaseAdapter {
    private Activity activity;
    private LayoutInflater inflater;
    private ArrayList<Przepisy> Items;
    TextView namer;
    ImageView imager;

    public CustomAdapter(Activity activity,ArrayList<Przepisy>Items){
        this.activity = activity;
        this.Items = Items;
    }





    @Override
    public int getCount() {
        return Items.size();
    }

    @Override
    public Przepisy getItem(int position) {
        return Items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (inflater == null) {
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (convertView == null){
            convertView = inflater.inflate(R.layout.single_row,null);
        }
        namer = (TextView) convertView.findViewById(R.id.namer);
        imager = (ImageView) convertView.findViewById(R.id.imager);

        Przepisy p = Items.get(position);
        namer.setText(p.getNazwa());
        imager.setImageResource(p.getResourceID());
        //imager.setContentDescription(p.getNazwa());

        /*final Przepisy m = Items.get(position);
        namer.setText(m.getNazwa());
        imager.setImageResource(m.getResourceID());

        return convertView;
    }
}
*/