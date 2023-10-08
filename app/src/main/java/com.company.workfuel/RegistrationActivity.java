package com.company.workfuel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.company.workfuel.R;

public class RegistrationActivity extends AppCompatActivity {

    private Button regButton, backLoginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        regButton = findViewById(R.id.regButton);
        backLoginButton = findViewById(R.id.backLoginButton);

        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intentMainActivity();
            }
        });
        backLoginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intentBackActivity();
            }
        });
    }
    private void intentMainActivity() {
        Intent intentMain = new Intent(this, MainActivity.class);
        startActivity(intentMain);
    }
    private void intentBackActivity() {
        finish();
    }

}