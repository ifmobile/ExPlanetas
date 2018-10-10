package com.example.professor.explanetas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = (ListView)findViewById(R.id.lista);
        List<Planeta> planetas = Planeta.getPlanetas();
        listview.setAdapter(new PlanetaAdapter(this,planetas));
        listview.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Planeta p = (Planeta)parent.getAdapter().getItem(position);
        Toast.makeText(this,"Planeta: " + p.nome, Toast.LENGTH_SHORT).show();
    }
}
