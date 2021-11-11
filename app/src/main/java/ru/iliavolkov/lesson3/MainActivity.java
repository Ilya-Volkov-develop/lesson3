package ru.iliavolkov.lesson3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    int counter1 = 0;
    TextView textCounter1;
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textCounter1 = findViewById(R.id.textView);
        btn1 = findViewById(R.id.btn);

        btn1.setOnClickListener(v -> {
            counter1+=10;
            textCounter1.setText(String.format(Locale.getDefault(), "%d", counter1));
        });

    }
}