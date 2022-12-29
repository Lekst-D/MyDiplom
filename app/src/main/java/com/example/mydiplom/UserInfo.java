package com.example.mydiplom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class UserInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
    }
    private void EditInfoShow(View v)
    {
        Intent intent = new Intent(UserInfo.this, EditInfoUser.class);
        startActivity(intent);
    }
}