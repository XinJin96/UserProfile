package com.example.userprofile;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView birthday=(TextView)findViewById(R.id.birthday);
        TextView name=(TextView)findViewById(R.id.name);
        TextView country=(TextView)findViewById(R.id.country);
        ImageView myself=(ImageView)findViewById(R.id.profile_picture);

        birthday.setText("Aug 24, 1996");
        name.setText("XIN JIN");
        country.setText("China");
        myself.setImageResource(R.drawable.xin_jin);


    }
}