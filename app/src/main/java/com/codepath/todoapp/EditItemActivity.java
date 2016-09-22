package com.codepath.todoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

public class EditItemActivity extends AppCompatActivity {

    EditText itemEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);
        itemEditText = (EditText) findViewById(R.id.itemEditText);
        String data = getIntent().getStringExtra("data");
        //System.out.println(data);
        itemEditText.setText(data);
    }
}
