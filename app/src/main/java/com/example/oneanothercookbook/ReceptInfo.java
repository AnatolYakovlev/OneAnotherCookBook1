package com.example.oneanothercookbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.gson.Gson;

public class ReceptInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       setContentView(R.layout.activity_recept_info);

        //получаем intent
        Intent intent = getIntent();
        //извлекаем json строчку из intent'а
        String receptJson = intent.getStringExtra("receptJson");
        //создаем объект сериализации
        Gson gson = new Gson();
        //десериализуем объект класса рецепт бляда
        //ReceptBluda rb = gson.fromJson(receptJson,ReceptBluda.class);
        //Вывод информации по рецепту на активити

     //   TextView nazv = (TextView)findViewById(R.id.textViewNazv);
     //   nazv.setText(rb.getNazvanie());

     //   TextView opis = (TextView)findViewById(R.id.textViewOpisanie);
    //    nazv.setText(rb.getPolnoeOpisanie());

    }
}
