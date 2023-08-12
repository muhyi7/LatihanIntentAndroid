package com.codepolitan.latihanintentandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvKota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvKota = findViewById(R.id.tv_kota);
    }
    /*
    * Intent Explicit
    * */
    public void pindahActivity(View view) {
        Intent pindahActivityIntent = new Intent(MainActivity.this, PindahActivity.class);
        startActivity(pindahActivityIntent);
    }

    public void pindahActivityDenganData(View view) {
        Intent pindahActivityDenganDataIntent = new Intent(MainActivity.this, PindahDenganDataActivity.class);
        pindahActivityDenganDataIntent.putExtra("KEY_NAMA","Ahmad Muhyiddin");
        pindahActivityDenganDataIntent.putExtra("KEY_EMAIL", "ahmadmuhyiddin404.com");
        pindahActivityDenganDataIntent.putExtra("KEY_UMUR", 21);
        pindahActivityDenganDataIntent.putExtra("KEY_STATUS", false);
        startActivity(pindahActivityDenganDataIntent);

    }

    public void pindahActivityDenganObject(View view) {
        //Parcelable = ini berasal dari android
        //Serializable = ini berasal dari java
        //mana yang lebih cepat dalam proses pengiriman? = Parceable(Lebih Cepat)
        //Kita akan menggunakan Serializable
        User user = new User();
        user.setName("Muhyi");
        user.setEmail("muhyi@gmail.com");
        user.setAge(23);
        user.setStatus(true);

        Intent pindahActivityDenganObjectIntent = new Intent(MainActivity.this, PindahDenganObjectActivity.class);
        pindahActivityDenganObjectIntent.putExtra(PindahDenganObjectActivity.KEY_USER, user);
        startActivity(pindahActivityDenganObjectIntent);
    }

    public void pindahActivityResult(View view) {
    }

    /*
    *Intent Implicit
    * */
    public void dialNumber(View view) {
    }

    public void bukaBrowser(View view) {
    }

    public void bukaMaps(View view) {
    }
}