package com.codepolitan.latihanintentandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PindahDenganObjectActivity extends AppCompatActivity {

    private TextView tvName;
    private TextView tvEmail;
    private TextView tvAge;
    private TextView tvStatus;

    public static String KEY_USER = "key_user";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindah_dengan_object);

        tvName = findViewById(R.id.tv_nama);
        tvEmail = findViewById(R.id.tv_email);
        tvAge = findViewById(R.id.tv_umur);
        tvStatus = findViewById(R.id.tv_status);

        getDataIntent();
    }

    private void getDataIntent() {
        if (getIntent() != null){
            User user = (User) getIntent().getSerializableExtra(KEY_USER);
            String age = user.getAge() + " Tahun";
            String status;
            if (user.isStatus()){
                status = "Status Nikah: Sudah";
            }else {
                status = "Status Nikah: Belum";
            }

            tvName.setText(user.getName());
            tvEmail.setText(user.getEmail());
            tvAge.setText(age);
            tvStatus.setText(status);
        }
    }
}