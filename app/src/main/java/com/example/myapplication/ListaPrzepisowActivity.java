package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class ListaPrzepisowActivity extends AppCompatActivity {
    private ArrayList<przepis> wybraneprzepisy;
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_przepisow);
        String kategoria = getIntent().getStringExtra("KATEGORIA");
        int nr=getIntent().getIntExtra("NUMER",0);
        TextView textView=findViewById(R.id.textView2);
        textView.setText(kategoria);
        repozytorium repozytorium=new repozytorium();
        wybraneprzepisy= repozytorium.przepiszkategorii(nr);
        listView=findViewById(R.id.listView2);
        ArrayAdapter<przepis> arrayAdapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,wybraneprzepisy);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ListaPrzepisowActivity.this,przepisActivity.class);
                przepis przepis = wybraneprzepisy.get(i);
                intent.putExtra("id",przepis.getId());
                startActivity(intent);
            }
        });
    }
}