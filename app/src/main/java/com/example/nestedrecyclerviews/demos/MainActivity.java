package com.example.nestedrecyclerviews.demos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity{

    ParentArrayList arrayList;
    ImageView modeimg;
    private boolean isGridMode = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide(); // Hide the action bar
        getWindow().setFlags(1024,1024);

        arrayList = new ParentArrayList();

        modeimg = findViewById(R.id.modeimg);
        RecyclerView recyclerView =  findViewById(R.id.parentrecyclerview);

        Context context = getApplicationContext();

        LinearLayoutManager managerss = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(managerss);

        Adpt_Header adpt_parent = new Adpt_Header(arrayList.ParentDatas(), context,isGridMode);
        recyclerView.setAdapter(adpt_parent);

        modeimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  grid and list view modes
                isGridMode = !isGridMode;
                adpt_parent.setChildViewType(isGridMode);
                if(isGridMode)
                {
                    modeimg.setImageResource(R.drawable.grid);
                }
                else
                {
                    modeimg.setImageResource(R.drawable.list);
                }
            }
        });

    }

}
