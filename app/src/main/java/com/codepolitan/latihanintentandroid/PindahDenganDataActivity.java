package com.codepolitan.latihanintentandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PindahDenganDataActivity extends AppCompatActivity {

    private TextView tvNama;
    private TextView tvEmail;
    private TextView tvUmur;
    private TextView tvStatus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindah_dengan_data);

        tvNama = findViewById(R.id.tv_nama);
        tvEmail = findViewById(R.id.tv_email);
        tvUmur = findViewById(R.id.tv_umur);
        tvStatus = findViewById(R.id.tv_status);

        getDataIntent();
    }

    private void getDataIntent() {
        if (getIntent() !=null){
            String nama = getIntent().getStringExtra("KEY_NAMA");
            String email = getIntent().getStringExtra("KEY_EMAIL");
            int umur = getIntent().getIntExtra("KEY_UMUR", 0);
            boolean status = getIntent().getBooleanExtra("KEY_STATUS", false);

            String age = umur + " Tahun";
            String mStatus;

            if (status){
                mStatus = "Status Nikah: Sudah";
            }else {
                mStatus = "Status Nikah: Belum";
            }

            tvNama.setText(nama);
            tvEmail.setText(email);
            tvUmur.setText(age);
            tvStatus.setText(mStatus);

        }
    }
}