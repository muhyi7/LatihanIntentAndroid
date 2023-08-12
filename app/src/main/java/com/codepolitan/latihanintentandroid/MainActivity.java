package com.codepolitan.latihanintentandroid;

import androidx.activity.result.ActivityResult;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
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

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 100){
            if (resultCode == Activity.RESULT_OK){
                String result = data.getStringExtra(PindahDenganResultActivity.KEY_RESULT);
                tvKota.setText(result);
            }
        }
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
        User user = new User("Muhyi", "muhyi@gmail.com", 23, true);

        Intent pindahActivityDenganObjectIntent = new Intent(MainActivity.this, PindahDenganObjectActivity.class);
        pindahActivityDenganObjectIntent.putExtra(PindahDenganObjectActivity.KEY_USER, user);
        startActivity(pindahActivityDenganObjectIntent);
    }

    public void pindahActivityResult(View view) {
        Intent pindahActivityDenganResultIntent = new Intent(MainActivity.this, PindahDenganResultActivity.class);
        startActivityForResult(pindahActivityDenganResultIntent,100);
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