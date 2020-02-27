package com.shehab.mynotebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
Button newbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.AddNewHeadline);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addHeadline();
            }
        });
    }
    public void addHeadline(){
          LinearLayout layout = (LinearLayout) findViewById(R.id.rootlayout);
          newbtn = new Button(this);
          newbtn.setText("New Note " );
          layout.addView(newbtn);

    }
}
