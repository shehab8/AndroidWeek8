package com.shehab.mylistviewnotebook;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;


    public class CreateNotes extends AppCompatActivity {
        public static final String messageKey = "MESSAGE_KEY";
        private String message = "";
        private EditText editText;

        @SuppressLint("WrongViewCast")
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.create_notes);
            editText = findViewById(R.id.edittxt);
        }
        public void saveMessage(View view) {      // Sends Message
            message = editText.getText().toString();
            Log.i("all", "saved" + message);
        }

        public void goToViewTexts(View view){
            Intent intent = new Intent (this, ViewNotes.class);
            intent.putExtra(messageKey, message);
            startActivity(intent);
        }
    }

