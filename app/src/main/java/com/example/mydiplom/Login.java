package com.example.mydiplom;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        TextView registration=(TextView)findViewById(R.id.Registration);
        registration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(Login.this, "text", Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(Login.this, Registration.class);
                startActivity(intent);
            }
        });


}
private void ShowMainPage(View v)
{
    Intent intent = new Intent(Login.this, MainPage.class);
    startActivity(intent);
}

     //Toast.makeText(this, "text", Toast.LENGTH_SHORT).show();
     //return null;

}