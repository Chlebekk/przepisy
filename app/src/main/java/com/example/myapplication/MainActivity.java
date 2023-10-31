package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private ListView kategorielistView;
    private Spinner kategorieSpinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        kategorielistView=findViewById(R.id.ListView);
        kategorieSpinner=findViewById(R.id.spinner);
        kategorielistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int ktory=i;
                String kategoria = kategorielistView.getItemAtPosition(i).toString();
                Toast.makeText(MainActivity.this, "Kliknieto:"+Integer.toString(i)+"Kategoria:"+kategoria, Toast.LENGTH_SHORT).show();
                wyswietlNowaAktywnosc(kategoria,i);
            }
        });
        kategorieSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                int ktory=i;
                String kategoria = kategorielistView.getItemAtPosition(i).toString();
                Toast.makeText(MainActivity.this, "Kliknieto:"+Integer.toString(i)+"Kategoria:"+kategoria, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
                Toast.makeText(MainActivity.this, "womp womp", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void wyswietlNowaAktywnosc(String kategoria, int numer) {
        Intent intent= new Intent(MainActivity.this,ListaPrzepisowActivity.class);
        intent.putExtra("KATEGORIA",kategoria);
        intent.putExtra("NUMER",numer);
        startActivity(intent);
    }
}