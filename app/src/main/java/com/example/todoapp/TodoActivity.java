package com.example.todoapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TodoActivity extends AppCompatActivity {

    public static final String TAG = TodoActivity.class.getSimpleName();
    public static final String TODO_INDEX=;
    private String[] todos;
    private Button nextButton;
    private Button detailButton;
    private TextView todotitle;
    private int todoIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_todo);

        if(savedInstanceState)

        todotitle = findViewById(R.id.title);
        nextButton = findViewById(R.id.next_btn);
        detailButton = findViewById(R.id.detail_button);

        Resources res = getResources();
        todos = res.getStringArray(R.array.todos);
        Log.d(TAG, ""+ todos.length);

        todotitle.setText(todos[todoIndex]);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                todoIndex = ++todoIndex % todos.length;
                todotitle.setText(todos[todoIndex]);
            }

        });

        detailButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                todoIndex = ++todoIndex % todos.length;
                todotitle.setText(todos[todoIndex]);
            }

        });
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState);
        outState.putInt(TODO_INDEX, todoIndex);
    }
}