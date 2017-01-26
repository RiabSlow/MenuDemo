package com.team.speedcoders.menudemo;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.ArrayList;

/**
 * Created by Sakkar on 1/26/2017.
 */

class MyAddapter extends BaseAdapter {

    ArrayList<String> name,department;
    ArrayList<Drawable> images;
    Context context;
    public MyAddapter(Context context,ArrayList<String> department, ArrayList<Drawable> images, ArrayList<String> name) {
        this.department = department;
        this.images = images;
        this.name = name;
        this.context=context;
    }

    @Override
    public int getCount() {
        return name.size();
    }

    @Override
    public Object getItem(int position) {
        return name.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=convertView;
        ViewHolder viewHolder;
        if(view==null){
            view= LayoutInflater.from(context).inflate(R.layout.list_view,parent,false);
            viewHolder=new ViewHolder(view);
            view.setTag(viewHolder);
        }
        else
            viewHolder= (ViewHolder) view.getTag();
        viewHolder.profilePic.setImageDrawable(images.get(position));
        viewHolder.name.setText(name.get(position));
        viewHolder.department.setText(department.get(position));
        return view;
    }
}
