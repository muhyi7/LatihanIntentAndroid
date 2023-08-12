package com.codepolitan.latihanintentandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PindahDenganResultActivity extends AppCompatActivity {

    static final String KEY_RESULT = "key_result";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pindah_dengan_result);
    }

    public void btnSukabumi(View view) {
        Intent intent = new Intent();
        intent.putExtra(KEY_RESULT,"Sukabumi");
        setResult(Activity.RESULT_OK, intent);
        finish();
    }

    public void btnBandung(View view) {
        Intent intent = new Intent();
        intent.putExtra(KEY_RESULT,"Bandung");
        setResult(Activity.RESULT_OK, intent);
        finish();
    }

    public void btnCimahi(View view) {
        Intent intent = new Intent();
        intent.putExtra(KEY_RESULT,"Cimahi");
        setResult(Activity.RESULT_OK, intent);
        finish();
    }

    public void btnCirebon(View view) {
        Intent intent = new Intent();
        intent.putExtra(KEY_RESULT,"Cirebon");
        setResult(Activity.RESULT_OK, intent);
        finish();
    }

    public void btnJakarta(View view) {
        Intent intent = new Intent();
        intent.putExtra(KEY_RESULT,"Jakarta");
        setResult(Activity.RESULT_OK, intent);
        finish();
    }

    public void btnTangerang(View view) {
        Intent intent = new Intent();
        intent.putExtra(KEY_RESULT,"Tangerang");
        setResult(Activity.RESULT_OK, intent);
        finish();
    }
}