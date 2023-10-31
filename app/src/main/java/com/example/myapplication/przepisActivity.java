package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class przepisActivity extends AppCompatActivity {
private  TextView skladniki,tresc,nazwa;
private ImageView img;
private ImageButton imageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_przepis);
        int id = getIntent().getIntExtra("id",0);
        repozytorium repozytorium = new repozytorium();
        przepis przepis = repozytorium.getPrzepisy().get(id);
        nazwa=findViewById(R.id.textView3);
        tresc=findViewById(R.id.textView4);
        skladniki=findViewById(R.id.textView5);
        img=findViewById(R.id.imageView);
        nazwa.setText(przepis.getNazwa());
        tresc.setText("Przepis: "+przepis.getTresc());
        skladniki.setText("Składniki: "+przepis.getSkladniki());
        img.setImageResource(przepis.getIdObrazka());
        imageButton=findViewById(R.id.imageButton);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                //intecja nie jawna
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT,przepis.getNazwa()+", skladniki: "+przepis.getSkladniki()+", tresc: "+przepis.getTresc());
                intent.setType("text/plain");
                Intent shareIntent=Intent.createChooser(intent,null);
                startActivity(intent);
            }
        });
    }
}