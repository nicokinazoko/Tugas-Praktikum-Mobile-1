package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class VolumeKubus extends AppCompatActivity {

    private Button buttonHitung;
    private TextView textViewHitungVolumeKubus, hasilVolumeKubus;
    private EditText sisiKubus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_kubus);

        buttonHitung                    =   findViewById(R.id.ButtonHitung);

        sisiKubus                       =   findViewById(R.id.SisiKubus);

        hasilVolumeKubus                =   findViewById(R.id.HasilVolumeKubus);

        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    String sSisiKubus       =   sisiKubus.getText().toString();

                    double dSisiKubus       =   Double.parseDouble(sSisiKubus);

                    double volumeKubus      =   dSisiKubus*dSisiKubus*dSisiKubus;

                    String sVolumeKubus     =   String.valueOf(volumeKubus);

                    hasilVolumeKubus.setText(sVolumeKubus);

                }catch (NumberFormatException nfe)
                {
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
