package com.example.todoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class detailActivity extends AppCompatActivity {

    public static final String TAG = detailActivity.class.getSimpleName();
    private static final String TODO_INDEX_EXTRA="com.example.todoapp.todoindex";
    private String[] todosDetail;
    TextView detailTextView;
    private int todoIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Resources res = getResources();
        todosDetail=res.getStringArray(R.array.todos.todos_detail);

        Intent intent = getIntent();
        todoIndex = intent.getIntExtra(TODO_INDEX_EXTRA, 0);

        detailTextView.setText(todosDetail[todoIndex]);
    }



    public static Intent makeIntent(Context context, int todoIndex){
        Intent intent = new Intent(context, detailActivity.class);
        intent.putExtra(TODO_INDEX_EXTRA,);

    }

    private onClickListener mTodoListener = new View.OnClickListener(){
        public void onClick(View v){
            switch (v.getId()){
                case R.id.checkBoxisComplete:

            }
        }
    };

    private void setIsComplete(boolean isChecked){
        if(isChecked){
            Toast.makeText()
        }
    }

    public void clickBox(View view) {

    }
}