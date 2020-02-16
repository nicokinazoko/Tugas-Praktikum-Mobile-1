package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button buttonVolumeTabung, buttonVolumeKubus;
    private TextView textViewNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonVolumeTabung          =   findViewById(R.id.ButtonVolumeTabung);
        buttonVolumeKubus           =   findViewById(R.id.ButtonVolumeKubus);

        textViewNama                =   findViewById(R.id.TextViewNama);

        buttonVolumeKubus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuKubus       =   new Intent(MainActivity.this , VolumeKubus.class);
                startActivity(menuKubus);
            }
        });

        buttonVolumeTabung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent menuTabung       =   new Intent(MainActivity.this , VolumeTabung.class);
                startActivity(menuTabung);
            }
        });
    }
}
