package com.example.flappybird;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class DiemXHAdapter extends ArrayAdapter<DiemXH> {
    private Activity context;
    private int resource;
    private List<DiemXH> objects;
    public DiemXHAdapter(@NonNull Activity context, int resource, @NonNull List<DiemXH> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View viewItem;
        if (convertView == null) {
            //Tao view
            LayoutInflater in = this.context.getLayoutInflater();
            viewItem = in.inflate(this.resource, null);
        } else
            viewItem = convertView;
            DiemXH diemXH = getItem(position);
            TextView textViewDiemXH = viewItem.findViewById(R.id.textviewDiemXH);
            textViewDiemXH.setText(diemXH.getDiem());

        return viewItem;
    }
}
