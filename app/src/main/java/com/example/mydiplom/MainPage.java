package com.example.mydiplom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);

        ImageView imageSearch=(ImageView)findViewById(R.id.image_search);
        imageSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(Login.this, "text", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainPage.this, SearchPage.class);
                startActivity(intent);
            }
        });

        ImageView imageMessage=(ImageView)findViewById(R.id.image_message);
        imageMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(Login.this, "text", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainPage.this, List_message.class);
                startActivity(intent);
            }
        });

        ImageView imageHome=(ImageView)findViewById(R.id.image_home);
        imageHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(Login.this, "text", Toast.LENGTH_SHORT).show();

                //Intent intent = new Intent(MainPage.this, MainPage.class);
                //startActivity(intent);
            }
        });

        ImageView imagePeople=(ImageView)findViewById(R.id.image_people);
        imagePeople.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(Login.this, "text", Toast.LENGTH_SHORT).show();

                //Intent intent = new Intent(MainPage.this, .class);
                //startActivity(intent);
            }
        });

        ImageView imageUser=(ImageView)findViewById(R.id.image_user);
        imagePeople.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(Login.this, "text", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(MainPage.this, UserInfo.class);
                startActivity(intent);
            }
        });

    }
}