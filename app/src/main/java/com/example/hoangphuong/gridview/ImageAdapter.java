package com.example.hoangphuong.gridview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Hoang Phuong on 3/28/2017.
 */

public class ImageAdapter extends ArrayAdapter{
    private Context context;
    private ArrayList<Model> modelArrayList;



    public ImageAdapter(Context context, ArrayList<Model> objects) {
        super(context, R.layout.single_item, objects);
        this.context = context;
        this.modelArrayList = objects;

    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.single_item, parent, false);


        ViewHolder viewHolder = new ViewHolder();
        viewHolder.imageView = (ImageView) convertView.findViewById(R.id.single_img);
        viewHolder.tv_title = (TextView) convertView.findViewById(R.id.tv_title);
        viewHolder.tv_name = (TextView) convertView.findViewById(R.id.tv_name);
        convertView.setTag(viewHolder);

        viewHolder.tv_title.setText(modelArrayList.get(position).getTitle());
        viewHolder.tv_name.setText(modelArrayList.get(position).getName());
        viewHolder.imageView.setImageResource(modelArrayList.get(position).getImgId());

        return convertView;

    }

    private class ViewHolder{
        private TextView tv_title;
        private ImageView imageView;
        private TextView tv_name;
    }
}
