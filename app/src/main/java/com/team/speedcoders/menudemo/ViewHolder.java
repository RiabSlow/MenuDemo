package com.team.speedcoders.menudemo;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Sakkar on 1/26/2017.
 */

class ViewHolder {
    View view;
    ImageView profilePic;
    TextView name,department;

    public ViewHolder(View view) {
        this.view = view;
        profilePic= (ImageView) view.findViewById(R.id.profile_image);
        name= (TextView) view.findViewById(R.id.profile_name);
        department= (TextView) view.findViewById(R.id.department_name);
    }


}
