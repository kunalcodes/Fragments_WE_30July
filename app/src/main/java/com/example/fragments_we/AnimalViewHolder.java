package com.example.fragments_we;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AnimalViewHolder extends RecyclerView.ViewHolder {

    private TextView mTvName;
    private ImageView mIvAnimal;

    public AnimalViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mTvName = itemView.findViewById(R.id.tvName);
        mIvAnimal = itemView.findViewById(R.id.ivAnimal);
    }

    public void setData(Animal animal){
        mIvAnimal.setImageResource(animal.getImageId());
        mTvName.setText(animal.getName());
    }
}
