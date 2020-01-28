package com.jkapps.expandablerecyclerviewdemo;

//2019-11-20

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        List<ParentData> list = getList();

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyAdapter myAdapter = new MyAdapter(MainActivity.this,list);
        recyclerView.setAdapter(myAdapter);
        recyclerView.addItemDecoration(new DividerItemDecoration(this,LinearLayoutManager.VERTICAL));
        recyclerView.setAdapter(myAdapter);
    }


    private List<ParentData> getList() {

        List<ParentData> list_parent =new ArrayList<>();

        List<ChildData> list_data_child1 = new ArrayList<>();
        List<ChildData> list_data_child2 = new ArrayList<>();
        List<ChildData> list_data_child3 = new ArrayList<>();
        List<ChildData> list_data_child4 = new ArrayList<>();

        list_parent.add(new ParentData("Parent 1",list_data_child1));
        list_parent.add(new ParentData("Parent 2",list_data_child2));
        list_parent.add(new ParentData("Parent 3",list_data_child3));
        list_parent.add(new ParentData("Parent 4",list_data_child4));

        list_data_child1.add(new ChildData("Child 1-1"));
        list_data_child1.add(new ChildData("Child 1-2"));

        list_data_child2.add(new ChildData("Child 2-1"));
        list_data_child2.add(new ChildData("Child 2-2"));
        list_data_child2.add(new ChildData("Child 2-3"));

        list_data_child3.add(new ChildData("Child 3-1"));
        list_data_child3.add(new ChildData("Child 3-2"));

        list_data_child4.add(new ChildData("Child 4-1"));

        return list_parent;
    }
}
