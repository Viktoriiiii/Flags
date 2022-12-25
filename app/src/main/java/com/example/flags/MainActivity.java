package com.example.flags;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<State> states = new ArrayList<State>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list);
        StateAdapter adapter = new StateAdapter(this, states);
        recyclerView.setAdapter(adapter);
    }

    private void setInitialData() {
        states.add(new State("Россия", "Москва", R.drawable.russia));
        states.add(new State("Белорусия", "Минск", R.drawable.belarus));
        states.add(new State("Германия", "Берлин", R.drawable.germany));
        states.add(new State("Грузия", "Тбилиси", R.drawable.georgia));
        states.add(new State("Канада", "Оттава", R.drawable.canada));
        states.add(new State("Китай", "Пекин", R.drawable.kitai));
        states.add(new State("США", "Вашингтон", R.drawable.usa));
        states.add(new State("Финляндия", "Хельсинки", R.drawable.finland));
        states.add(new State("Франция", "Париж", R.drawable.francia));
        states.add(new State("Япония", "Токио", R.drawable.japan));
    }
}