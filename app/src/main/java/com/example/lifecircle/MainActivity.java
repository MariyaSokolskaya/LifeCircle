package com.example.lifecircle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.life_methods);
        text.append("Я родился!!!\n");
    }

    @Override
    protected void onStart() {
        super.onStart();
        text.append("Я стартовал\n");
    }

    @Override
    protected void onPause() {
        super.onPause();
        text.append("Я на паузе\n");
    }

    @Override
    protected void onStop() {
        super.onStop();
        text.append("Меня остановили!\n");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Аааааа!!!", Toast.LENGTH_LONG).show();
    }
}