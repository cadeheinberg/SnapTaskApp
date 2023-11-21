package com.cs407.SnapTask.TasksRecyclerView;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.cs407.SnapTask.R;

import java.util.ArrayList;

public class ListAdapter extends BaseAdapter {
    Context context;
    ArrayList<Bitmap> arrayList;
    LayoutInflater layoutInflater;
    public ListAdapter(Context context, ArrayList<Bitmap> arrayList){
        this.context = context;
        this.arrayList = arrayList;
        layoutInflater = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = layoutInflater.inflate(R.layout.single_thumbnail, parent, false);
        ImageView imageView = view.findViewById(R.id.gallerySingleThumbnail);
        imageView.setImageBitmap(arrayList.get(position));
        return view;
    }
}