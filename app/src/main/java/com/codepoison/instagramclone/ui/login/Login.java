package com.codepoison.instagramclone.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.codepoison.instagramclone.MainActivity;
import com.codepoison.instagramclone.R;
import com.codepoison.instagramclone.ui.login.signup.signup;

public class Login extends AppCompatActivity {

    private Button login;
    private TextView acc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



         // Set On CLick Lisiner

        login = findViewById(R.id.blogin);
        acc = findViewById(R.id.create);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });


          acc.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  Intent intent = new Intent(getApplicationContext() , signup.class);
                  startActivity(intent);
              }
          });
    }
}
