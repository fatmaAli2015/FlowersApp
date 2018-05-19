package com.amin.flowersapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Senior Steps on 8/12/2017.
 */

public class FlowerAdapter extends BaseAdapter {

    private ArrayList<Flower> flowers;

    public FlowerAdapter(ArrayList<Flower> flowers) {
        this.flowers = flowers;
    }

    @Override
    public int getCount() {
        return flowers.size();
    }

    @Override
    public Flower getItem(int position) {
        return flowers.get(position);
    }

    @Override
    public long getItemId(int position) {
        return flowers.get(position).getProductId();
    }

    @Override
    public View getView(int position, View oldView, ViewGroup adapterView) {

        oldView = LayoutInflater.from(adapterView.getContext()).inflate(R.layout.item_flower, null);

        ImageView ivFlower = oldView.findViewById(R.id.iv_flower);
        TextView tvPrice = oldView.findViewById(R.id.tv_flower_price);
        TextView tvName = oldView.findViewById(R.id.tv_flower_name);

        Flower currentFlower = getItem(position);

        tvName.setText(currentFlower.getName());
        tvPrice.setText(String.valueOf(currentFlower.getPrice()));
        Picasso.with(adapterView.getContext())
                .load("http://services.hanselandpetal.com/photos/" + currentFlower.getPhoto())
                .into(ivFlower);

        return oldView;
    }
}
