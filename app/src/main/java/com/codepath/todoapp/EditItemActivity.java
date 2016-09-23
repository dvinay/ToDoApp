package com.codepath.todoapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
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
        itemEditText.setText(data);
        itemEditText.setSelection(data.length());
    }

    public void onEditItem(View view) {
        Intent data = new Intent();
        data.putExtra("text", itemEditText.getText().toString());
        data.putExtra("code", 20);
        setResult(RESULT_OK, data);
        finish();
    }
}
