package com.example.momo.skedaily.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.momo.skedaily.News;
import com.example.momo.skedaily.R;

import java.util.List;

/**
 * Created by Momo on 22/9/2559.
 */

public class NewsAdapter extends ArrayAdapter<News>{
    private List<News> objects;

    public NewsAdapter(Context context, int resource, List<News> objects) {
        super(context, resource, objects);
        this.objects = objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View v = convertView;
        if(v==null){
            LayoutInflater vi = LayoutInflater.from(getContext());
            v = vi.inflate(R.layout.news_cell, null);
        }

        TextView name = (TextView) v.findViewById(R.id.name_newsfeed);
        TextView time = (TextView) v.findViewById(R.id.time_newsfeed);
        TextView text = (TextView) v.findViewById(R.id.msg_newsfeed);
        ImageView image = (ImageView) v.findViewById(R.id.img_newsfeed);


        News news = objects.get(position);
        name.setText(""+news.getName());
        time.setText(""+news.getDate());
        text.setText(""+news.getText());
        image.setImageResource(R.drawable.pic1);

        return v;
    }
}