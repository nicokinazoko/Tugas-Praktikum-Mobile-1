package com.example.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class VolumeTabung extends AppCompatActivity {

    private Button buttonHitung;
    private TextView textViewHitungVolumeTabung, textViewHasilVolumeTabung;
    private EditText jariJariTabung, tinggiTabung;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volume_tabung);

        buttonHitung                =   findViewById(R.id.ButtonHitung);

        textViewHasilVolumeTabung   =   findViewById(R.id.TextViewHasilVolumeTabung);

        textViewHitungVolumeTabung  =   findViewById(R.id.TextViewHitungVolumeTabung);

        jariJariTabung              =   findViewById(R.id.JariJariTabung);
        tinggiTabung                =   findViewById(R.id.TinggiTabung);


        buttonHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try
                {
                    String sjariJariTabung          =   jariJariTabung.getText().toString();
                    String stingiTabung             =   tinggiTabung.getText().toString();

                    double dJariJariTabung          =   Double.parseDouble(sjariJariTabung);
                    double dTinggiTabung            =   Double.parseDouble(stingiTabung);
                    double PI                       =   3.1428571428571428571428571428571;

                    double volumeTabung             =   PI*dJariJariTabung*dJariJariTabung*dTinggiTabung;

                    String sVolumeTabung            =   String.valueOf(volumeTabung);

                    textViewHasilVolumeTabung.setText(sVolumeTabung);


                }catch (NumberFormatException nfe)
                {
                    Toast.makeText(getApplicationContext(),"Field Tidak Boleh Kosong", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
