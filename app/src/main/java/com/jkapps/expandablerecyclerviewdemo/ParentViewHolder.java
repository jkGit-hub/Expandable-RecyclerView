package com.jkapps.expandablerecyclerviewdemo;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

public class ParentViewHolder extends GroupViewHolder{

    public TextView textView_parent;

    public ParentViewHolder(View itemView) {
        super(itemView);
        textView_parent = itemView.findViewById(R.id.tv_parent_item);
    }

    @Override
    public void expand() {
        super.expand();
        textView_parent.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.down_arrow,0);
    }

    @Override
    public void collapse() {
        super.collapse();
        textView_parent.setCompoundDrawablesWithIntrinsicBounds(0,0,R.drawable.up_arrow,0);
    }

    //private void animationExpand() { }
    //private void animationCollapse() { }


    public void setGroupName(ExpandableGroup groupName){
        textView_parent.setText(groupName.getTitle());
    }
}

