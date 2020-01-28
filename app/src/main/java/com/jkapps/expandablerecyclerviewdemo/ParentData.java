package com.jkapps.expandablerecyclerviewdemo;

import android.annotation.SuppressLint;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

@SuppressLint("ParcelCreator")
public class ParentData extends ExpandableGroup<ChildData>{

    public ParentData(String title, List<ChildData> items){
        super(title,items);
    }
}
