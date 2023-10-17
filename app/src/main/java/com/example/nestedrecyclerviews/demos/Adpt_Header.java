package com.example.nestedrecyclerviews.demos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adpt_Header extends RecyclerView.Adapter<Adpt_Header.ParentHold> {

    List<Model_Header> parentList;
    Context conn;
    private boolean isGridMode = false; // Set the default mode to list view
    int viewmode = 1;


    public Adpt_Header(List<Model_Header> modelParentList, Context context, boolean isGridMode) {
        this.parentList = modelParentList;
        this.conn = context;
        this.isGridMode = isGridMode; // Initialize with the provided value
    }

    public void setChildViewType(boolean isGridMode) {
        this.isGridMode = isGridMode;
        notifyDataSetChanged(); // Notify the adapter that the data set has changed
    }


    @NonNull
    @Override
    public ParentHold onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.main_header_item, viewGroup, false);
        return new ParentHold(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ParentHold viewHolder, int poss) {

        Model_Header present = parentList.get(poss);
        viewHolder.headerss.setText(present.getHeader());

        if(isGridMode) {
            GridLayoutManager layoutManager = new GridLayoutManager(viewHolder.recyclerView.getContext(), 2);
            viewHolder.recyclerView.setLayoutManager(layoutManager);
            viewmode = 1;
        }
        else {
            LinearLayoutManager childLayoutManager = new LinearLayoutManager(viewHolder.recyclerView.getContext(), RecyclerView.VERTICAL, false);
            viewHolder.recyclerView.setLayoutManager(childLayoutManager);
            viewmode = 0;

        }

        viewHolder.recyclerView.setAdapter(new Adpt_Child(present.getParentLists(), conn,viewmode));

    }

    @Override
    public int getItemCount() {
        return parentList.size();
    }


    public class ParentHold extends RecyclerView.ViewHolder  {

        RecyclerView recyclerView;
        TextView headerss;

        public ParentHold(@NonNull View itemView) {
            super(itemView);

            headerss = itemView.findViewById(R.id.headertxtdata);
            recyclerView = itemView.findViewById(R.id.childrecycler);

        }
    }

}
