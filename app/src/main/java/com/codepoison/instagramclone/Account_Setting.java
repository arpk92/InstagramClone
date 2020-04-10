package com.codepoison.instagramclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.codepoison.instagramclone.ui.editprofile.EditProfile;

public class Account_Setting extends AppCompatActivity {

     private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account__setting);

          // Calling Button

        button = findViewById(R.id.editprofile);

        //Start Onclick Lisinres

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(getApplication() , EditProfile.class);
                startActivity(intent);
            }
        });

    }
}
