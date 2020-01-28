package com.jkapps.expandablerecyclerviewdemo;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class ChildViewHolders extends ChildViewHolder{

    public TextView textView_child;

    public ChildViewHolders(View itemView) {
        super(itemView);
        textView_child = itemView.findViewById(R.id.tv_child_item);
    }

    public void setChildText(String name){
        textView_child.setText(name);
    }
}
