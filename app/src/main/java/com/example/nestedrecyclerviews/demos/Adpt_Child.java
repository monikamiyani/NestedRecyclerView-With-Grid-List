package com.example.nestedrecyclerviews.demos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.picasso.Picasso;
import java.util.List;

public class Adpt_Child extends RecyclerView.Adapter<Adpt_Child.ChildHold>{

    List<Model_ChildData> modelChildDataList;
    Context conn;
    int mode;

    public Adpt_Child(List<Model_ChildData> dataList, Context context, int viewmode) {
        this.modelChildDataList = dataList;
        this.conn = context;
        mode = viewmode;
    }

    View view;

    @NonNull
    @Override
    public ChildHold onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        if (i == 0) {
            view =LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_recycler_item, viewGroup, false);
        } else  {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.grid_recycler_item, viewGroup, false);
        }
        return new ChildHold(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChildHold viewHolder, int poss) {

        Picasso.get().
                load(modelChildDataList.get(poss).getImage())
                .resize(480,640)
                .onlyScaleDown()
                .into(viewHolder.Image);

        viewHolder.Title.setText(modelChildDataList.get(poss).getTxttitle());

    }

    @Override
    public int getItemViewType(int position) {
        List<Model_ChildData> list = this.modelChildDataList;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return mode;
    }

    @Override
    public int getItemCount() {
        return modelChildDataList.size();
    }

    class ChildHold extends RecyclerView.ViewHolder {

         TextView Title;
         ImageView Image;

        private ChildHold(@NonNull View itemView) {
            super(itemView);

            Title = itemView.findViewById(R.id.wall_txt);
            Image = itemView.findViewById(R.id.wall_image);
        }
    }

}
