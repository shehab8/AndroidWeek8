package com.shehab.mylistviewnotebook;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ViewNotes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_notes);
        TextView textView = findViewById(R.id.textView2);
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra(CreateNotes.messageKey));
    }
}
