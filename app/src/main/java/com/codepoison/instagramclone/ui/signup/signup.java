package com.codepoison.instagramclone.ui.login.signup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.codepoison.instagramclone.R;
import com.codepoison.instagramclone.ui.login.Login;

public class signup extends AppCompatActivity {

     private Button signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


          signup = findViewById(R.id.bsignup);


          signup.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

                  Intent intent = new Intent(getApplicationContext() , Login.class);
                  startActivity(intent);
              }
          });


    }
}
