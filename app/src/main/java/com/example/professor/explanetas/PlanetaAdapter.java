package com.example.professor.explanetas;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PlanetaAdapter extends BaseAdapter {

    private final Context context;
    private final List<Planeta> planetas;

    public PlanetaAdapter(Context context, List<Planeta> planetas) {
        this.context = context;
        this.planetas = planetas;
    }

    @Override
    public int getCount() {
        return planetas.size();
    }

    @Override
    public Object getItem(int position) {
        return planetas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.adapter_planeta, parent,false);
        TextView texto = (TextView) view.findViewById(R.id.txtPlaneta);
        ImageView img = (ImageView) view.findViewById(R.id.imgPlaneta);

        Planeta planeta = planetas.get(position);
        texto.setText(planeta.nome);
        img.setImageResource(planeta.img);

        return view;
    }
}
