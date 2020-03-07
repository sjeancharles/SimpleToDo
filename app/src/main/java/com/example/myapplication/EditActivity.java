package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.example.myapplication.MainActivity.KEY_ITEM_POSITION;
import static com.example.myapplication.MainActivity.KEY_ITEM_TEXT;

public class EditActivity extends AppCompatActivity {
    EditText etItem;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);

        etItem = findViewById(R.id.etItem);
        btnSave = findViewById(R.id.btnSave);

        getSupportActionBar().setTitle("Edit Item");
        etItem.setText(getIntent(). getStringExtra(KEY_ITEM_TEXT));

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();

                intent.putExtra(KEY_ITEM_TEXT, etItem.getText().toString());
                intent.putExtra(KEY_ITEM_POSITION, getIntent(). getExtras().getInt(KEY_ITEM_POSITION));

                setResult (RESULT_OK, intent);

                finish();

            }
        });
    }
}
