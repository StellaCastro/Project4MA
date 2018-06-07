package com.example.android.project4ma.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.android.project4ma.R;

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        TextView startTextView = (TextView)findViewById(R.id.start_view);
        final EditText userNameEdit = (EditText)findViewById(R.id.user_name_input);
        startTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String UserName = userNameEdit.getText().toString();
                Intent pass_name_intent = new Intent(WelcomeScreen.this,MainMenu.class);
                pass_name_intent.putExtra("name", UserName);
                startActivity(pass_name_intent);
            }
        });
    }
}
