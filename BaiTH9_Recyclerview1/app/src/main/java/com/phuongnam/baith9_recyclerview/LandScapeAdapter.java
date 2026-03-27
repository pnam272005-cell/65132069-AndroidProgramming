package com.phuongnam.baith9_recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class LandScapeAdapter extends RecyclerView.Adapter<LandScapeAdapter.ViewHolder> {
    private Context context;
    private ArrayList<LandScape> listData;

    public LandScapeAdapter(Context context, ArrayList<LandScape> listData) {
        this.context = context;
        this.listData = listData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.item_land, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        LandScape land = listData.get(position);

        holder.tvCaption.setText(land.getLandCaption());

        String pkgName = context.getPackageName();
        int resId = context.getResources().getIdentifier(
                land.getLandImageName(),
                "drawable",
                pkgName
        );

        if (resId != 0) {
            holder.ivLand.setImageResource(resId);
        }
    }

    @Override
    public int getItemCount() {
        return listData.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView ivLand;
        TextView tvCaption;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);ivLand = itemView.findViewById(R.id.ivLand);
            tvCaption = itemView.findViewById(R.id.tvCaption);
        }
    }
}