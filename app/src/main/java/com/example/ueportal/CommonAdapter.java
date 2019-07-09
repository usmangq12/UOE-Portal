package com.example.ueportal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class CommonAdapter extends RecyclerView.Adapter<CommonAdapter.ProgrammingViewHolder> {
    private String[] data;
    Context context;

    CommonAdapter(String[] data){
        this.data = data;
    }
    @NonNull
    @Override
    public ProgrammingViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.list_item_layout, viewGroup, false);
        return new ProgrammingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProgrammingViewHolder programmingViewHolder, int i) {
        String title = data[i];
        programmingViewHolder.textTitle.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    class ProgrammingViewHolder extends RecyclerView.ViewHolder{
        ImageView imgIcon;
        TextView textTitle;

        ProgrammingViewHolder(View itemView) {
            super(itemView);
            imgIcon = itemView.findViewById(R.id.imgIcon);
            textTitle = itemView.findViewById(R.id.txtTitle);
        }
    }
}
